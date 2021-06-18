package com.example.demo.domain.repository

import com.example.demo.domain.model.IdCard
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface IdCardRepository : PagingAndSortingRepository<IdCard, String> {
}