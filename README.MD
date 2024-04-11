# Spring Email Microservice
## About
This is a RESTful API for sending emails using the Email Sender Service, using Spring!

## Technologies Used
- Java (https://www.java.com/en/)
- Spring Boot (https://spring.io/projects/spring-boot)
- Amazon Simple Email Service (https://aws.amazon.com/pt/ses/)

## Prerequisites
Before running this application, make sure you have the following:

1. Java Development Kit (JDK) installed in your machine
2. Apache Maven for building and managing the project
3. AWS SES credentials configured `application.properties`

## Setup

1. Clone repository
```bash
git clone https://github.com/DigaLugas/SpringEmailSender.git
```
2. Install dependencies with Maven

3. Update `aplication.properties` with your AWS credentials
```bash
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage
1. Start application with Maven
2. API will be located at http:localhost:8080

## Api Endpoints

# Send Email

* Url: `/api/email/send`
* Method : POST
* Request Body:
```bash
{
  "to": "johndude@example.com",
  "subject": "Hello from Email Sender API",
  "body": "This is a test email from the Email Sender API."
}
```
* Response
    Success (HTTP 200 OK):
    ```bash
    "Email sent!"
    ```
    Failure (HTTP 500 Internal Server Error):
     ```bash
    "Failure to send email"
    ```