package com.digas.emailservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.digas.emailservice.application.EmailSenderService;
import com.digas.emailservice.core.EmailRequest;
import com.digas.emailservice.core.Exceptions.EmailServiceException;

@Controller
@RequestMapping("/api/email")
public class EmailSenderController {
    private final EmailSenderService emailSenderService;


    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request){
        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());

            return ResponseEntity.ok("Email send!");
        } catch (EmailServiceException e) {
           
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failure to send email");
        }
    }
}
