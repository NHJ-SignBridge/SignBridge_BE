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
public class QuizProgress {

  private String quizProgressId;
  private Category category;
  private User userId;
  private double correctRate;
  private LocalDateTime attemptDate;
}
