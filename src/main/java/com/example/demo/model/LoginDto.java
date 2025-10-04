package com.example.demo.model;


import lombok.*;

@Data
public class LoginDto {
	private String usernameOrEmail;
	private String password;
}
