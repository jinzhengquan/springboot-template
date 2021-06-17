package com.example.demo.core.exceptions

sealed class DomainException : RuntimeException {
    var errorCode: String;
    var params: List<String>? = null;

    constructor(errorCode: String) {
        this.errorCode = errorCode;
    }

    constructor(errorCode: String, params: List<String>) {
        this.errorCode = errorCode;
        this.params = params;
    }
}