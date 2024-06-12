# frozen_string_literal: true

require "xwebhook"

DEFAULT_MSG_ID = "msg_p5jXN8AQM9LWM0D4loKWxJek"
DEFAULT_PAYLOAD = '{"test": 2432232314}'
DEFAULT_SECRET = "MfKQ9r8GKYqrTwjUPD8ILPZIo2LaLaSw"
TOLERANCE = 5 * 60

class TestPayload

    def initialize(timestamp = Time.now.to_i)
        @secret = DEFAULT_SECRET

        @id = DEFAULT_MSG_ID
        @timestamp = timestamp

        @payload = DEFAULT_PAYLOAD
        @secret = DEFAULT_SECRET

        toSign = "#{@id}.#{@timestamp}.#{@payload}"
        @signature = Base64.encode64(OpenSSL::HMAC.digest(OpenSSL::Digest.new("sha256"), Base64.decode64(DEFAULT_SECRET), toSign)).strip

        @headers = {
            "xwebhook-id" => @id,
            "xwebhook-signature" => "v1,#{@signature}",
            "xwebhook-timestamp" => @timestamp
        }
    end

    attr_accessor :secret
    attr_accessor :id
    attr_accessor :timestamp
    attr_accessor :payload
    attr_accessor :signature
    attr_accessor :headers
end

describe Xwebhook::Webhook do
    it "missing id raises error" do
        testPayload = TestPayload.new
        testPayload.headers.delete("xwebhook-id")

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "missing timestamp raises error" do
        testPayload = TestPayload.new
        testPayload.headers.delete("xwebhook-timestamp")

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "missing signature raises error" do
        testPayload = TestPayload.new
        testPayload.headers.delete("xwebhook-signature")

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "invalid signature raises error" do
        testPayload = TestPayload.new
        testPayload.headers["xwebhook-signature"] = "v1,g0hM9SsE+OTPJTGt/tmIKtSyZlE3uFJELVlNIOLawdd"

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "valid signature is valid and returns valid json" do
        testPayload = TestPayload.new
        wh = Xwebhook::Webhook.new(testPayload.secret)

        json = wh.verify(testPayload.payload, testPayload.headers)
        expect(json[:test]).to eq(2432232314)
    end

    it "valid unbranded signature is valid and returns valid json" do
        testPayload = TestPayload.new
        unbrandedHeaders = {
            "webhook-id" => testPayload.headers["xwebhook-id"],
            "webhook-signature" => testPayload.headers["xwebhook-signature"],
            "webhook-timestamp" => testPayload.headers["xwebhook-timestamp"]
        }
        testPayload.headers = unbrandedHeaders

        wh = Xwebhook::Webhook.new(testPayload.secret)

        json = wh.verify(testPayload.payload, testPayload.headers)
        expect(json[:test]).to eq(2432232314)
    end

    it "old timestamp raises error" do
        testPayload = TestPayload.new(Time.now.to_i - TOLERANCE - 1)

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "new timestamp raises error" do
        testPayload = TestPayload.new(Time.now.to_i + TOLERANCE + 1)

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "invalid timestamp raises error" do
        testPayload = TestPayload.new("teadwd")

        wh = Xwebhook::Webhook.new(testPayload.secret)

        expect { wh.verify(testPayload.payload, testPayload.headers) }.to raise_error(Xwebhook::WebhookVerificationError)
    end

    it "multi sig pyload is valid" do
        testPayload = TestPayload.new
        sigs = [
            "v1,Ceo5qEr07ixe2NLpvHk3FH9bwy/WavXrAFQ/9tdO6mc=",
            "v2,Ceo5qEr07ixe2NLpvHk3FH9bwy/WavXrAFQ/9tdO6mc=",
            testPayload.headers["xwebhook-signature"], # valid signature
            "v1,Ceo5qEr07ixe2NLpvHk3FH9bwy/WavXrAFQ/9tdO6mc=",
        ]
        testPayload.headers["xwebhook-signature"] = sigs.join(" ")

        wh = Xwebhook::Webhook.new(testPayload.secret)

        json = wh.verify(testPayload.payload, testPayload.headers)
        expect(json[:test]).to eq(2432232314)
    end

    it "signature verification works with and without prefix" do
        testPayload = TestPayload.new

        wh = Xwebhook::Webhook.new(testPayload.secret)
        json = wh.verify(testPayload.payload, testPayload.headers)
        expect(json[:test]).to eq(2432232314)

        wh = Xwebhook::Webhook.new("whsec_" + testPayload.secret)
        json = wh.verify(testPayload.payload, testPayload.headers)
        expect(json[:test]).to eq(2432232314)
    end

    it "sign function works" do
            key = "whsec_MfKQ9r8GKYqrTwjUPD8ILPZIo2LaLaSw"
            msg_id = "msg_p5jXN8AQM9LWM0D4loKWxJek"
            timestamp = 1614265330
            payload = '{"test": 2432232314}'
            expected = "v1,g0hM9SsE+OTPJTGt/tmIKtSyZlE3uFJELVlNIOLJ1OE="

            wh = Xwebhook::Webhook.new(key)
            signature = wh.sign(msg_id, timestamp, payload)
            expect(signature).to eq(expected)
    end
end
