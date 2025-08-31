package br.com.smtp_showcase.service;

import br.com.smtp_showcase.model.Email;
import br.com.smtp_showcase.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailRepository emailRepository;

    public void enviarEmail(String destinatario, String assunto, String corpo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destinatario);
        message.setSubject(assunto);
        message.setText(corpo);
        mailSender.send(message);
    }

    public Email salvarEmail(Email email) {
        email.setDataEnvio(LocalDateTime.now());
        return emailRepository.save(email);
    }
}
