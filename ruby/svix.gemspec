
lib = File.expand_path("../lib", __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)
require "xwebhook/version"

Gem::Specification.new do |spec|
  spec.name          = "xwebhook"
  spec.version       = Xwebhook::VERSION
  spec.authors       = ["Xwebhook"]
  spec.email         = ["support@webhook.openweb3.io"]
  spec.license       = "MIT"

  spec.summary       = "Xwebhook webhooks API client and webhook verification library"
  spec.description   = "Xwebhook makes webhooks easy and reliable.  " \
                       "Learn more at https://webhook.openweb3.io"
  spec.homepage      = "https://webhook.openweb3.io"

  # Prevent pushing this gem to RubyGems.org. To allow pushes either set the 'allowed_push_host'
  # to allow pushing to a single host or delete this section to allow pushing to any host.
  if spec.respond_to?(:metadata)
    spec.metadata["allowed_push_host"] = "https://rubygems.org"

    spec.metadata["homepage_uri"] = spec.homepage
    spec.metadata["source_code_uri"] = "https://github.com/xwebhook/xwebhook-libs"
    spec.metadata["changelog_uri"] = "https://github.com/xwebhook/xwebhook-libs/blob/main/ChangeLog.md"
  else
    raise "RubyGems 2.0 or newer is required to protect against " \
      "public gem pushes."
  end

  # Specify which files should be added to the gem when it is released.
  ignored = Regexp.union(
    /\A\.openapi-generator/,
    /\Aspec/,
    /\Apkg/,
    /\Atemplates/,
    /\A.gitignore/,
    /\A.openapi-generator-ignore/,
    /\Aopenapi-generator-config.json/,
    /.gem\z/
  )
  spec.files = Dir['**/*'].reject {|f| !File.file?(f) || ignored.match(f) }

  spec.bindir        = "exe"
  spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
  spec.require_paths = ["lib"]

  spec.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  spec.add_development_dependency "rake", "~> 13.0"
  spec.add_development_dependency "rspec", "~> 3.2"
end
