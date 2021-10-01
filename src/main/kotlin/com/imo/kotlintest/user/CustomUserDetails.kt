package com.imo.kotlintest.user

import com.imo.kotlintest.user.entity.TblUser
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class CustomUserDetails private constructor(
        private val userCode: Long? = null,
        private var userId: String,
        private var password: String,
        private var authority: String
) :UserDetails {

    companion object {
        fun from(user:TblUser) : CustomUserDetails {
            return CustomUserDetails(
                    userCode = user.userCode,
                    userId = user.userId,
                    authority = "ROLE_USER",
                    password = user.password
            )
        }
    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        val authorities = ArrayList<GrantedAuthority>()
        authorities.add(SimpleGrantedAuthority(authority))
        return authorities
    }

    override fun getPassword(): String {
        return password
    }

    override fun getUsername(): String {
        return userId
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}