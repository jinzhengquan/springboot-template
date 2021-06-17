package com.example.demo.domain.application.cmd

import com.example.demo.domain.exceptions.ErrorCodes
import javax.validation.constraints.NotBlank

class AddStudentCmd {
    @get:NotBlank(message = ErrorCodes.STUDENT_NAME_IS_NULL)
    var name: String = "";

    @get:NotBlank(message = ErrorCodes.STUDENT_NAME_CREATED_BY_IS_NULL)
    var createdBy: String = "";
}
