package com.example.demo.core.exceptions

class RemoteServerException : RuntimeException {
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