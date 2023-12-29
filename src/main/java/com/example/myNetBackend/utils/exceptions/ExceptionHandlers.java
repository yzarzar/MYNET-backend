package com.example.myNetBackend.utils.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {
    
    private static final Map<Class<? extends AuthenticationException>, String> MESSAGES = new HashMap<>();

    static {
        MESSAGES.put(UsernameNotFoundException.class, "Please check your login id.");
        MESSAGES.put(BadCredentialsException.class, "Please check your password.");
        MESSAGES.put(AccountExpiredException.class, "Your account has been expired.");
        MESSAGES.put(DisabledException.class, "Your account is unable to access.");
        MESSAGES.put(LockedException.class, "Your account has been locked");
    }
}
