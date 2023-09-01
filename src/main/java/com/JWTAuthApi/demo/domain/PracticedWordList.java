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
public class PracticedWordList {
  private Long practiced_word_id;
  private Long userId;
  private Long wordId;
  private LocalDateTime learned_date;
}
