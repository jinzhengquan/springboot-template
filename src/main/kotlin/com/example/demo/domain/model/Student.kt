package com.example.demo.domain.model

import java.io.Serializable
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "student")
class Student : Serializable {
    @Id
    private var id: String? = null;

    fun getId():String? {
        return this.id;
    }

    @Column
    private var name: String? = null;

    fun getName():String? {
        return this.name;
    }

    @Column
    private var createdAt: OffsetDateTime? = null;

    fun getCreatedAt():OffsetDateTime? {
        return this.createdAt;
    }

    @Column
    private var createdBy: String? = null;

    fun getCreatedBy():String? {
        return this.createdBy;
    }

    @Column
    private var lastModifiedAt: OffsetDateTime? = null;

    fun getLastModifiedAt():OffsetDateTime? {
        return this.lastModifiedAt;
    }

    @Column
    private var lastModifiedBy: String? = null;

    fun getLastModifiedBy():String? {
        return this.lastModifiedBy;
    }

    @Column
    private var enabled: Boolean? = null;

    fun getEnabled():Boolean? {
        return this.enabled;
    }

    constructor()

    constructor(name: String, createdBy: String) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.createdBy = createdBy;
        this.createdAt = OffsetDateTime.now();
        this.lastModifiedBy = createdBy;
        this.lastModifiedAt = OffsetDateTime.now();
        this.enabled = true;
    }


}