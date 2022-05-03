package com.revature.pnwgolf.util;

import java.io.Serializable;

public class JWTReponseModel implements Serializable {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private final String token;

	public JWTReponseModel(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
