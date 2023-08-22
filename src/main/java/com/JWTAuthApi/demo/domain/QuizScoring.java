package com.JWTAuthApi.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuizScoring {

  public String scoringId;
  public QuizProgress quizProgressId;
  public PracticedWordList practiceWordId;
  public boolean scoring;

}
