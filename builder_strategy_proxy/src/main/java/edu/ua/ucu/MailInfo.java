package edu.ua.ucu;

import lombok.Getter;

@Getter
public class MailInfo {
    private final Client client;
    private final MailContentStrategy mailStrategy;

    public MailInfo(Client client, MailContentStrategy mailStrategy) {
        this.client = client;
        this.mailStrategy = mailStrategy;
    }
}