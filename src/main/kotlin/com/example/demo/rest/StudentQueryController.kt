package com.example.demo.rest

import com.example.demo.domain.model.Student
import com.example.demo.query.StudentQuery
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
@Tag(name = "student APIs")
class StudentQueryController {
    private val logger = LoggerFactory.getLogger(StudentQueryController::class.java)

    @Autowired
    lateinit var studentQuery: StudentQuery;

    @GetMapping("/users")
    fun findByName(name: String, page: Int, size: Int): List<Student> {
        return studentQuery.findByName(name, page, size);
    }

}