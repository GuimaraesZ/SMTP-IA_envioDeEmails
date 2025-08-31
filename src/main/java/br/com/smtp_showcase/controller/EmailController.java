package br.com.smtp_showcase.controller;

import br.com.smtp_showcase.dto.EmailRequest;
import br.com.smtp_showcase.model.Email;
import br.com.smtp_showcase.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviar(@RequestBody EmailRequest request) {
        emailService.enviarEmail(request.getDestinatario(), request.getAssunto(), request.getCorpo());
        Email email = new Email(request.getDestinatario(), request.getAssunto(), request.getCorpo());
        email.setDataEnvio(LocalDateTime.now());
        emailService.salvarEmail(email);
        return ResponseEntity.ok("Enviado");
    }
}
