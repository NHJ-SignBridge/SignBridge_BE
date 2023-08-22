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

  private String practicedProgressId;
  private User userId;
  private Category categoryId;
  private double progressRate;
  private LocalDateTime practicedDate;
}
