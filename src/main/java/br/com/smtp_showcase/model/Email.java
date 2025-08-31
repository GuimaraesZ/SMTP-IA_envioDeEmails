package br.com.smtp_showcase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destinatario;
    private String assunto;
    private String corpo;
    private LocalDateTime dataEnvio;

    public Email() {}

    public Email(String destinatario, String assunto, String corpo) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    // getters and setters omitted for brevity
}
