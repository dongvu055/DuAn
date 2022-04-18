package com.example.backendduan.securityconfig;

import org.springframework.security.core.GrantedAuthority;

public class AuthoritiesBasic implements GrantedAuthority {
    private String authorities;

    public AuthoritiesBasic(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public String getAuthority() {
        return authorities;
    }
}
