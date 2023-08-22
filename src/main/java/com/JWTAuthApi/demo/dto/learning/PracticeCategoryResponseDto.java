package com.JWTAuthApi.demo.dto.learning;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeCategoryResponseDto {

  private List<Problem> problems;

  @Getter
  @Setter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Problem {

    private int number;
    private String imageUrl;
    private String keyword;

  }

}
