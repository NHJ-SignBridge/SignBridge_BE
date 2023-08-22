package com.JWTAuthApi.demo.service.Learning;

import com.JWTAuthApi.demo.domain.Word;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto.Problem;
import com.JWTAuthApi.demo.dto.learning.PracticeRecordDto;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PracticeService {

  private final LearningService learningService;

  @Transactional
  public PracticeCategoryResponseDto returnWordList(PracticeCategoryDto practiceCategoryDto){
    List<Word> wordList = learningService.findByWord(practiceCategoryDto.getCategory());

    List<Problem> wordPairs = new ArrayList<>();
    for (Word word : wordList) {
      Problem problem = new Problem();
      problem.setImageUrl(word.getImageUrl());
      problem.setKeyword(word.getKeyword());
      problem.setNumber(word.getNumber());
      wordPairs.add(problem);
    }

    return PracticeCategoryResponseDto.builder()
        .problems(wordPairs)
        .build();
  }

  //학습 진행 기록(일시, 진행률, 학습한 단어)
  @Transactional
  public void saveAndCalculateProgress(String token, PracticeRecordDto practiceRecordDto) {
    //token으로 User 확인

  }
}
