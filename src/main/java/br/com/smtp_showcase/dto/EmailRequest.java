package br.com.smtp_showcase.dto;

public class EmailRequest {
    private String destinatario;
    private String assunto;
    private String corpo;
    private String modelo;

    public String getDestinatario() { return destinatario; }
    public String getAssunto() { return assunto; }
    public String getCorpo() { return corpo; }
    public String getModelo() { return modelo; }

    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
    public void setAssunto(String assunto) { this.assunto = assunto; }
    public void setCorpo(String corpo) { this.corpo = corpo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
