package com.JWTAuthApi.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeBestProgress {
  private String categoryName;
  private Double maxProgress;
}
