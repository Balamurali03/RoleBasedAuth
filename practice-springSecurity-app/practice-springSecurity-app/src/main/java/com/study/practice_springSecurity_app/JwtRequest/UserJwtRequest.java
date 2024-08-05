package com.study.practice_springSecurity_app.JwtRequest;

import lombok.Data;

@Data
public class UserJwtRequest {

	private String email;
	private String password;
}
