package com.example.demo.query

import com.example.demo.domain.model.Student
import com.example.demo.domain.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional(readOnly = true)
class StudentQuery {

    @Autowired
    lateinit var studentRepository: StudentRepository;

    fun findByName(name: String): List<Student> {
        return studentRepository.findByNameContains(name);
    }
}