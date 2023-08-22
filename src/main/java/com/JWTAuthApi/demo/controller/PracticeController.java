package com.JWTAuthApi.demo.controller;

import com.JWTAuthApi.demo.domain.Word;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto;
import com.JWTAuthApi.demo.service.Learning.ImageService;
import com.JWTAuthApi.demo.service.Learning.PracticeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("signbridge/learning")
@Slf4j
public class PracticeController {

  private final PracticeService practiceService;

  // 1. learning -> practice -> 선택 카테고리 문제 리스트 반환
  @PostMapping("/practice")
  public ResponseEntity practiceStart(@RequestBody PracticeCategoryDto practiceCategoryDto) {
    PracticeCategoryResponseDto practiceCategoryResponseDto = practiceService.returnWordList(practiceCategoryDto);
    return new ResponseEntity<>(practiceCategoryResponseDto, HttpStatus.FOUND);
  }

  // 진행 종료 버튼 -> 진행한 학습 기록 저장
//  @PostMapping("/practice/save")
//  public ResponseEntity savepractice(@RequestHeader("Authorization") String authorizationHeader, @RequestBody
//  PracticeRecordDto practiceRecordDto){
//    // Authorization 헤더에서 토큰 추출
//    String token = authorizationHeader.replace("Bearer ", "");
//    practiceService.saveAndCalculateProgress(token, practiceRecordDto);
//
//
//
//
//  }
  // 내 정보 -> 학습 기록 들어가면 카테고리별로 {최고 학습 진행률+그게 기록된 일시+가장 최근 학습 단어} 리턴
  // 학습 기록 -> 더보기 -> 선택한 카테고리에 해당하는 기록의 일자 리턴
  // 더보기 -> 일자 선택 -> 선택한 일자에 해당하는 기록{시간+진행률+단어} 리턴
}
