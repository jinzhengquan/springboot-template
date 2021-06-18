package com.example.demo.core.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "external.remote.server")
class RemoteServerProp {
    var url: String? = null;

    var timeout: Long = 0
}
