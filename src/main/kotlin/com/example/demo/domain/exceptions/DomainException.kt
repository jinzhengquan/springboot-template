package com.example.demo.domain.exceptions

class DomainException : RuntimeException {
    lateinit var errorCode: String;
    var params: List<String>? = null;

    constructor(){}

    constructor(errorCode: String) {
        this.errorCode = errorCode;
    }

    constructor(errorCode: String, params: List<String>) {
        this.errorCode = errorCode;
        this.params = params;
    }
}