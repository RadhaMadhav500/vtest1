package com.mcsv.hello.hello1.web;

import com.mcsv.hello.hello1.service.Hello1Service;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class Hello1RestControllerUnitTest {

    @Test
    void shouldWelcome() {
        Hello1Service hello1Service = Mockito.mock(Hello1Service.class);
        when(hello1Service.getWelcomeMessage("John")).thenReturn("Welcome John!");
        Hello1RestController hello1RestController = new Hello1RestController(hello1Service);
        assertEquals("Welcome John!",hello1RestController.welcome("John"));
    }
}