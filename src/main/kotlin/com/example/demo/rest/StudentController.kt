package com.example.demo.rest

import com.example.demo.domain.application.StudentApplicationService
import com.example.demo.domain.application.input.AddStudentInput
import com.example.demo.domain.model.Student
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/student")
@Tag(name = "student APIs")
class StudentController {

    @Autowired
    lateinit var studentApplicationService: StudentApplicationService;

    @PostMapping("/add")
    fun add(@Valid @RequestBody addStudentInput: AddStudentInput): Student {
        return studentApplicationService.addStudent(addStudentInput.name, addStudentInput.createdBy);
    }

}