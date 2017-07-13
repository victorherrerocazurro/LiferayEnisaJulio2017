package com.example.plugins.hook;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;

public class LoginListener extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		// Evaluar el token de CSRF
		System.out.println("En el pre Login");
		
		for(Cookie cookie : request.getCookies()){
			if(!cookie.getName().equals("TOKEN_CSRF")){
				try {
					response.getWriter().println("Error: TOKEN CSRF invalido");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
