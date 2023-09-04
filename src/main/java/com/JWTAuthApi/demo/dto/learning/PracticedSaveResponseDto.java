package com.JWTAuthApi.demo.dto.learning;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticedSaveResponseDto {
  private Long userId;
  private double progressRate;
  private LocalDateTime learned_date;
  private String categoryId;
}
