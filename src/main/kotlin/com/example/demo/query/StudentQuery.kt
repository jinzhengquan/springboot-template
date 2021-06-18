package com.example.demo.query

import com.example.demo.domain.model.Student
import com.example.demo.domain.repository.StudentRepository
import graphql.kickstart.tools.GraphQLQueryResolver
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional(readOnly = true)
class StudentQuery: GraphQLQueryResolver {
    var logger = LoggerFactory.getLogger(StudentQuery::class.java)

    @Autowired
    lateinit var studentRepository: StudentRepository;

    fun findByName(name: String, page:Int, size:Int): List<Student> {
        logger.info("==========");
        return studentRepository.findByNameContains(name, PageRequest.of(page,size));
    }
}