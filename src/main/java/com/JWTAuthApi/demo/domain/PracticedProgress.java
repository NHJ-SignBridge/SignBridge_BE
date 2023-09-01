package com.JWTAuthApi.demo.domain;

import com.JWTAuthApi.demo.domain.user.User;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticedProgress {

  private Long practiced_progress_id;
  private Long userId;
  private double progressRate;
  private LocalDateTime learned_date;
}
