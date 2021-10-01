package com.imo.kotlintest.common

import org.springframework.security.core.annotation.AuthenticationPrincipal


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION)
@AuthenticationPrincipal(expression = "#this == 'anonymousUser' ? null : userCode")
annotation class CurrentUserCode()
