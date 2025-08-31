package br.com.smtp_showcase.repository;

import br.com.smtp_showcase.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
