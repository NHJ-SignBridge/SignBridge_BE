package com.JWTAuthApi.demo.service.Learning;

import com.JWTAuthApi.demo.domain.Word;
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

//  @Transactional
//  public List<Long> findWordByKW(List<String> wordList){
//    List<Word> TTTT = practiceRepository.findWordByKW(wordList);
//
//    List<Long> wordIds = new ArrayList<>();
//    for (Word word : TTTT) {
//      wordIds.add(word.getWordId());
//    }
//
//    return wordIds;
//  }
}
