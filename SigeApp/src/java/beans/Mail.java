package beans;

import java.util.Properties;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
@RequestScoped
public class Mail {

    String gorus="teste";
    String ad="";
    String mailAdresi="";

    public String getGorus() {
        return gorus;
    }

    public void setGorus(String gorus) {
        this.gorus = gorus;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMailAdresi() {
        return mailAdresi;
    }

    public void setMailAdresi(String mailAdresi) {
        this.mailAdresi = mailAdresi;
    }
    private void enviarMensagem(FacesMessage.Severity sev, String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(sev, msg, ""));
    }

    public void mailAt() throws MessagingException {

        final String username = ""; 
        final String password = "";

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
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailAdresi));
            message.setSubject(ad);
            message.setText(gorus);
            transport.connect();
            Transport.send(message, message.getRecipients(Message.RecipientType.TO));
            enviarMensagem(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso");
            transport.close();
        } catch (MessagingException ex) {
            enviarMensagem(FacesMessage.SEVERITY_INFO, "Erro ao tntar enviar E-mail");
            System.err.println("hata: "+ex);
        }
    }

}
