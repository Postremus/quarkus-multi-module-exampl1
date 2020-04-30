package com.acme.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.acme.service.GreetingService;

@ApplicationScoped
@Path("hello")
public class HelloResource {

    @Inject
    GreetingService service;

    @GET
    public String greet() {

        return service.createGreeting();
    }
}
