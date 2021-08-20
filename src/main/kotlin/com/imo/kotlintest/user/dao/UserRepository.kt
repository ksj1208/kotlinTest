package com.imo.kotlintest.user.dao

import com.imo.kotlintest.user.entity.TblUser
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository :JpaRepository<TblUser, Long> {
    fun findByUserId(userId: String):TblUser?
}