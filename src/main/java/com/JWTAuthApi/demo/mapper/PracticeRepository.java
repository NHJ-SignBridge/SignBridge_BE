package com.JWTAuthApi.demo.mapper;

import com.JWTAuthApi.demo.domain.Word;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PracticeRepository {
  List<Word> findWordByCG(String category);

//  List<Word> findWordByKW(List<String> wordList);
}
