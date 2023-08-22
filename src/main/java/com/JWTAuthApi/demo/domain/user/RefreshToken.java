package com.JWTAuthApi.demo.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class RefreshToken {

  private Long id;
  private Long userId;
  private String value;

  public RefreshToken(Long userId, String value) {
    this.userId = userId;
    this.value = value;
  }
}
