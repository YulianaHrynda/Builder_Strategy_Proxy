package edu.ua.ucu;

public class GiftMail implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Hello, " + client.getName() + "! Enjoy your gift!";
    }
}
