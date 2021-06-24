package com.example.demo.core.filter

import org.apache.commons.lang3.StringUtils
import org.slf4j.MDC
import org.springframework.web.filter.GenericFilterBean
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

class LogFilter : GenericFilterBean() {

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(
        req: ServletRequest, res: ServletResponse?,
        chain: FilterChain
    ) {
        val request = req as HttpServletRequest
        MDC.clear();
        MDC.put("X-SERVICE-REQUEST-URI", request.requestURI);
        chain.doFilter(req, res)
    }
}