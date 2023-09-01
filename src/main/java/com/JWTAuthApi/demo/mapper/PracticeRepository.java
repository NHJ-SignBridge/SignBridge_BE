package com.JWTAuthApi.demo.mapper;

import com.JWTAuthApi.demo.domain.PracticedProgress;
import com.JWTAuthApi.demo.domain.PracticedWordList;
import com.JWTAuthApi.demo.domain.Word;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PracticeRepository {
  List<Word> findWordByCG(String category);

  List<Word> findWordByKW(@Param("wordList") List<String> wordList);

  void saveWord(PracticedWordList practicedWordList);

  int wordCount(Word wordId);

  void saveProgress(PracticedProgress practicedProgress);
}
