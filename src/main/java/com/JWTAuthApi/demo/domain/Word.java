package com.JWTAuthApi.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Word {
  private Long wordId;
  private int number;
  private Category categoryId;
  private String imageUrl;
  private String keyword;
}
