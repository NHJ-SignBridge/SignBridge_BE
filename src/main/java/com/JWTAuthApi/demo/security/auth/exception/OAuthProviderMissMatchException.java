package com.JWTAuthApi.demo.security.auth.exception;

public class OAuthProviderMissMatchException extends RuntimeException {

  // OAuth 인증 과정에서 제공자가 일치하지 않을 때 발생하는 예외 정의
  public OAuthProviderMissMatchException(String message) {
    super(message);
  }
}
