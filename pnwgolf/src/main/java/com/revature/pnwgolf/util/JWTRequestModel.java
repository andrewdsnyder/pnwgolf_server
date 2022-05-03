package com.revature.pnwgolf.util;


	import java.io.Serializable;

	public class JWTRequestModel implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -6308906540360011769L;
		private String username;
		private String password;

		public JWTRequestModel() {
		}

		public JWTRequestModel(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
