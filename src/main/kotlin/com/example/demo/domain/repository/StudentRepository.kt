package com.example.demo.domain.repository

import com.example.demo.domain.model.Student
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : PagingAndSortingRepository<Student, String> {
    fun findByNameContains(name: String, pageable:Pageable): List<Student>;
}