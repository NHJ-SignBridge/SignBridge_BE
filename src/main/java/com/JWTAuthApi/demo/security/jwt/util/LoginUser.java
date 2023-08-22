package com.JWTAuthApi.demo.security.jwt.util;

import lombok.Data;

@Data
public class LoginUser {

  private String email;
  private String name;
  private Long userId;
  private String role;
}
