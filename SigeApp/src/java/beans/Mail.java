package beans;

import java.util.Properties;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ManagedBean
@SessionScoped
public class Mail {

    String conteudoEmail="teste";
    String assunto="";
    String destinatarios="";

    public String getConteudoEmail() {
        return conteudoEmail;
    }

    public void setConteudoEmail(String conteudoEmail) {
        this.conteudoEmail = conteudoEmail;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }
    private void enviarMensagem(FacesMessage.Severity sev, String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(sev, msg, ""));
    }

    public void mailAt() throws MessagingException {

        final String username = "eventosdev1@gmail.com"; 
        final String password = "evento2016";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username , password);
            }
        });
        try {
            Transport transport = session.getTransport();

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatarios));
            message.setSubject(assunto);
            message.setText(conteudoEmail);
            transport.connect();
            Transport.send(message, message.getRecipients(Message.RecipientType.TO));
            enviarMensagem(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso");
            setAssunto("");
            setConteudoEmail("");
            setDestinatarios("");            
            transport.close();
        } catch (MessagingException ex) {
            enviarMensagem(FacesMessage.SEVERITY_INFO, "Erro ao tentar enviar E-mail");
            System.err.println("erro"+ex);
        }
    }

}
