package com.digas.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digas.emailservice.adapters.EmailSenderGateway;
import com.digas.emailservice.core.EmailServerUserCase;

/**
 * EmailSenderService
 */
@Service
public class EmailSenderService implements EmailServerUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
       emailSenderGateway.sendEmail(to, subject, body);
        
    }
    
}