package com.digas.emailservice.core;

/**
 * EmailRequest
 */
public record EmailRequest(String to, String subject, String body) {
}