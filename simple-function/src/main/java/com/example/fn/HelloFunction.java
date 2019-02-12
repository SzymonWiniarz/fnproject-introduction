package com.example.fn;

public class HelloFunction {

    public Response handleRequest(Request input) {
        String name = (input.getName() == null || input.getName().isEmpty()) ? "world"  : input.getName();

        return new Response("Hello, " + name + "!");
    }

}