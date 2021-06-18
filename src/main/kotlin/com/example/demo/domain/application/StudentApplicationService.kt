package com.example.demo.domain.application

import com.example.demo.domain.model.Student
import com.example.demo.domain.repository.StudentRepository
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional(readOnly = true)
class StudentApplicationService: GraphQLMutationResolver {

    @Autowired
    lateinit var studentRepository: StudentRepository;

    @Transactional
    fun addStudent(name: String, createdBy: String): Student {
        val student = Student(name, createdBy);
        return studentRepository.save(student);
    }
}