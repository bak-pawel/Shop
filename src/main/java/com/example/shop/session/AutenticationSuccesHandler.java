package com.example.shop.session;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@SessionScope
public class AutenticationSuccesHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private final UserSessionProvider userSessionProvider;

    public AutenticationSuccesHandler(UserSessionProvider userSessionProvider) {
        this.userSessionProvider = userSessionProvider;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        super.onAuthenticationSuccess(request, response, authentication);
        userSessionProvider.saveLoggedUser(authentication.getName());
    }
}
