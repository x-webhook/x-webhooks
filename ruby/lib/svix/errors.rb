# frozen_string_literal: true

module Xwebhook
    class XwebhookError < StandardError
        attr_reader :message

        def initialize(message = nil)
            @message = message
        end
    end

    class WebhookVerificationError < XwebhookError
    end

    class WebhookSigningError < XwebhookError
    end
end
