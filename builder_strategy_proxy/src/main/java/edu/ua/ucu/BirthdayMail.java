package edu.ua.ucu;

public class BirthdayMail implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Happy Birthday, " + client.getName() + "!";
    }
}
