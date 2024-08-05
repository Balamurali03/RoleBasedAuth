package com.study.practice_springSecurity_app.JwtResponse;

import com.study.practice_springSecurity_app.Entity.UserData;

import lombok.Data;

@Data
public class UserJwtResponse {

	private UserData signupData;
	private String message;
	private String jwtToken;
}
