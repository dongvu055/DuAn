package com.example.backendduan.securityconfig;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

//@Component
public class AuthenBasicProvider implements AuthenticationProvider {
    @Override
    public boolean supports(Class<?> authentication) {
        return ObjectAuthenticationBasic.class.isAssignableFrom(authentication);
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }
}
