package edu.ua.ucu;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        String content = mailInfo.getMailStrategy().generateContent(mailInfo.getClient());
        System.out.println("Sending mail: " + content);
    }
}