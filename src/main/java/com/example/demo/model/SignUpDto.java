package com.example.demo.model;


import lombok.*;

@Data
public class SignUpDto {
	private String name;
	private String username;
	private String email;
	private String password;
	private boolean enabled;
}
