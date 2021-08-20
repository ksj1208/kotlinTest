package com.imo.kotlintest.user.entity

import javax.persistence.*

@Entity
@Table(name = "TBL_USER")
class TblUser (
        @Id
        @Column(name = "USER_CODE")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var userCode:Long? = null,

        @Column(name = "USER_ID")
        var userId:String,

        @Column(name = "password")
        var password:String
)