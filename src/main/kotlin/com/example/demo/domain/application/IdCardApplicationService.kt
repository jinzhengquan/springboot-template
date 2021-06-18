package com.example.demo.domain.application

import com.example.demo.domain.model.IdCard
import com.example.demo.domain.repository.IdCardRepository
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class IdCardApplicationService: GraphQLMutationResolver {
    @Autowired
    lateinit var idCardRepository: IdCardRepository;

    fun addIdCard(idNumber:String, code:String):IdCard {
        var idCard = IdCard(idNumber,code);
        idCardRepository.save(idCard);
        return idCard;
    }
}