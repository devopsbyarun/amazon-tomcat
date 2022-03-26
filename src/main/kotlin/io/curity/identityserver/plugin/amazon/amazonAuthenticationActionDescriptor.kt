package io.curity.identityserver.plugin.amazon

import se.curity.identityserver.sdk.plugin.descriptor.AuthenticationActionPluginDescriptor

class amazonAuthenticationActionDescriptor: AuthenticationActionPluginDescriptor<amazonAuthenticationActionConfig>
{
    override fun getAuthenticationAction() = amazonAuthenticationAction::class.java

    override fun getPluginImplementationType() = "amazon"

    override fun getConfigurationType() = amazonAuthenticationActionConfig::class.java;
}
