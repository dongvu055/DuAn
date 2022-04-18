package com.example.backendduan.securityconfig;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class ObjectAuthenticationBasic implements Authentication {

    private String username;
    private String password;
    private List<String> authorities;
    private List<AuthoritiesBasic> authoritiesBasics;
    private boolean isAuthenticated;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        authorities.forEach(element -> authoritiesBasics.add(new AuthoritiesBasic(element)));
        return authoritiesBasics;
    }

    @Override
    public Object getCredentials() {
        return this.username;
    }

    @Override
    public Object getDetails() {
        return this.username;
    }

    @Override
    public Object getPrincipal() {
        return this.password;
    }

    @Override
    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

    }

    @Override
    public String getName() {
        return this.username;
    }
}
