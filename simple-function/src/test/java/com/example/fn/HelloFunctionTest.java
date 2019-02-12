package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;

public class HelloFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldGreetTheWorldWhenNoNamePassed() {
        testing.givenEvent().withBody("{}").enqueue();
        testing.thenRun(HelloFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("{\"greeting\":\"Hello, world!\"}", result.getBodyAsString());
    }

    @Test
    public void shouldGreetThePersonWhenNamePassed() {
        testing.givenEvent().withBody("{\"name\":\"Janusz\"}").enqueue();
        testing.thenRun(HelloFunction.class, "handleRequest");

        FnResult result = testing.getOnlyResult();
        assertEquals("{\"greeting\":\"Hello, Janusz!\"}", result.getBodyAsString());
    }

}