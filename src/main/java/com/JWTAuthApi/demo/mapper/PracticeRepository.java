package com.JWTAuthApi.demo.mapper;

import com.JWTAuthApi.demo.domain.PracticeBestProgress;
import com.JWTAuthApi.demo.domain.PracticedProgress;
import com.JWTAuthApi.demo.domain.PracticedWordList;
import com.JWTAuthApi.demo.domain.Word;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PracticeRepository {
  List<Word> findWordByCG(String category);

  List<Word> findWordByKW(@Param("wordList") List<String> wordList);

  void saveWord(PracticedWordList practicedWordList);

  int wordCount(String wordId);

  void saveProgress(PracticedProgress practicedProgress);

  List<PracticeBestProgress> bestProgress(Long userId);
}
