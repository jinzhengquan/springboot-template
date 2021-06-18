package com.example.demo.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.index.Indexed

@RedisHash(value = "id-card")
class IdCard {
    @Id
    @Indexed
    private var idNumber: String? = null;

    fun getIdNumber(): String? {
        return this.idNumber;
    }

    @Indexed
    private var code: String? = null;

    fun getCode(): String? {
        return this.code;
    }

    private val sentAt: Long = 0;
    fun getSentAt(): Long {
        return this.sentAt;
    }

    constructor(idNumber: String?, code: String?) {
        this.idNumber = idNumber;
        this.code = code;
    }
}