package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String createGreeting() {
        return "Hello from the GreetingService1";
    }

}
