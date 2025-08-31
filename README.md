# SMTP-IA_envioDeEmails

Projeto de demonstração que gera o corpo de e-mails usando a API do OpenAI (via Spring AI) e envia os e-mails via SMTP com Spring Boot.

O que o projeto faz
- Gera textos para o corpo de e-mail a partir de um "tema" e um modelo/estilo fornecido pelo usuário (integração com OpenAI).
- Envia e-mails usando `JavaMailSender` conectado a um servidor SMTP.
- Persiste um histórico simples de e-mails via JPA (MySQL) — entidade `Email` e `EmailRepository`.
- Fornece um front-end estático mínimo (`index.html`) para testar geração e envio.

Principais tecnologias e bibliotecas usadas
- Java 21
- Spring Boot 3.5.x (Web, Data JPA, Mail)
- Spring AI (ChatClient) para chamar a API da OpenAI
- Hibernate / JPA para persistência (MySQL)
- JavaMail / Spring Mail (`JavaMailSender`) para envio SMTP
- Maven para build

Commits incluídos neste repositório
- Integração com banco de dados (JPA/Hikari/MySQL)
- Controller para integração com OpenAI (ChatClient)
- Model, service e controller para envio de e-mail
- Front-end simples para testar geração e envio de e-mails

Arquivo de configuração não incluso: use `application.properties` localmente para configurar chaves e credenciais.
