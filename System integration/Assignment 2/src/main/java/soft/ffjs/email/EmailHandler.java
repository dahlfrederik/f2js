package soft.ffjs.email;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class EmailHandler {

    public static void createMessage(String to, String from, String subject, String body, List<File> attachments, String filename) {
        try {
            Message message = new MimeMessage(Session.getInstance(System.getProperties()));
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            // create the message part
            MimeBodyPart content = new MimeBodyPart();
            // fill message
            content.setText(body, "utf-8", "html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(content);
            // add attachments
            for(File file : attachments) {
                MimeBodyPart attachment = new MimeBodyPart();
                DataSource source = new FileDataSource(file);
                attachment.setDataHandler(new DataHandler(source));
                attachment.setFileName(file.getName());
                multipart.addBodyPart(attachment);
            }
            // integration
            message.setContent(multipart, "text/html; charset=utf-8");
            // store file
            message.writeTo(new FileOutputStream(new File("mails/" + filename +".eml")));
        } catch (MessagingException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
