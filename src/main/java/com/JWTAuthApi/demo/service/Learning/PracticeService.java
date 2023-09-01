package com.JWTAuthApi.demo.service.Learning;

import com.JWTAuthApi.demo.config.JwtProperties;
import com.JWTAuthApi.demo.domain.Category;
import com.JWTAuthApi.demo.domain.Word;
import com.JWTAuthApi.demo.domain.user.User;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto.Problem;
import com.JWTAuthApi.demo.dto.learning.PracticeSaveDto;
import com.JWTAuthApi.demo.mapper.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.SecretKey;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PracticeService {

  private final LearningService learningService;
  private final JwtProperties jwtProperties;
  private final UserRepository userRepository;

  @Transactional
  public PracticeCategoryResponseDto returnWordList(PracticeCategoryDto practiceCategoryDto){
    List<Word> wordList = learningService.findWordByCG(practiceCategoryDto.getCategory());

    List<Problem> wordPairs = new ArrayList<>();
    for (Word word : wordList) {
      Problem problem = new Problem(word.getImageUrl(), word.getKeyword(), word.getNumber());
      wordPairs.add(problem);
    }

    return PracticeCategoryResponseDto.builder()
        .problems(wordPairs)
        .build();
  }

  //학습 진행 기록(일시, 진행률, 학습한 단어)
//  @Transactional
//  public User saveAndCalculateProgress(String token, PracticeSaveDto practiceSaveDto) {
//    //1. token으로 user email 확인
//    String secretKeyString = jwtProperties.getSecretKey();
//    byte[] secretKeyBytes = secretKeyString.getBytes();
//    SecretKey key = Keys.hmacShaKeyFor(secretKeyBytes);
//
//    Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
//    String email = claims.getSubject();
//
//    //2. email로 user테이블에서 userid 가져오기.
//    User user = userRepository.findByEmail(email);
//
//    if(user != null) {
//      List<String> wordList = practiceSaveDto.getWordList();
//      String categoryName = practiceSaveDto.getCategoryName();
//
//      System.out.println(wordList);
//
//      List<Long> test = learningService.findWordByKW(wordList);
//
//
////      //3. word 정보 가져오기
////      for(String keyword : wordList){
////        List<Word> hihi = learningService.findWordByKW(keyword);
////
////        System.out.println(wordEntity);
////      }
//
//    }
//
//    return user;
////    3. pracitceSaveDto로 사용자가 학습한 단어 리스트 DB에 저장(
//
//  }
}
