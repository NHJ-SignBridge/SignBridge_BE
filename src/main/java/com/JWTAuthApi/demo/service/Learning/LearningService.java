package com.JWTAuthApi.demo.service.Learning;

import com.JWTAuthApi.demo.domain.PracticedWordList;
import com.JWTAuthApi.demo.domain.Word;
import com.JWTAuthApi.demo.domain.user.User;
import com.JWTAuthApi.demo.mapper.PracticeRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LearningService {

  private final PracticeRepository practiceRepository;

  @Transactional
  public List<Word> findWordByCG(String category){
    List<Word> wordList = (List<Word>) practiceRepository.findWordByCG(category);
    return wordList;
  }

  @Transactional
  public List<Word> findWordByKW(List<String> wordList){
    List<Word> wordIds = (List<Word>) practiceRepository.findWordByKW(wordList);
    return wordIds;
  }

}
