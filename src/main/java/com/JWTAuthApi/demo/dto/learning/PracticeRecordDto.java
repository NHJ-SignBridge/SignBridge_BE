package com.JWTAuthApi.demo.dto.learning;

import com.JWTAuthApi.demo.domain.Category;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeRecordDto {

  private List<String> wordList;
  private Category categoryName;
}