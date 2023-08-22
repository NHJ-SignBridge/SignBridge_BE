package com.JWTAuthApi.demo.service.Learning;

import com.JWTAuthApi.demo.domain.Word;
import com.JWTAuthApi.demo.mapper.PracticeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LearningService {

  private final PracticeRepository practiceRepository;

  @Transactional
  public List<Word> findByWord(String category){
    List<Word> wordList = (List<Word>) practiceRepository.findByWord(category);
    return wordList;
  }
}
