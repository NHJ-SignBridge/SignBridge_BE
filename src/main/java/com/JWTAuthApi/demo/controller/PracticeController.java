package com.JWTAuthApi.demo.controller;

import com.JWTAuthApi.demo.dto.learning.PracticeCategoryDto;
import com.JWTAuthApi.demo.dto.learning.PracticeCategoryResponseDto;
import com.JWTAuthApi.demo.dto.learning.PracticedSaveDto;
import com.JWTAuthApi.demo.dto.learning.PracticedSaveResponseDto;
import com.JWTAuthApi.demo.service.Learning.PracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/Learning")
@Slf4j
public class PracticeController {

  private final PracticeService practiceService;


  // learning > practice > 선택 카테고리 문제 리스트 반환
  @PostMapping("/Learning/practice")
  public ResponseEntity practiceStart(@RequestBody PracticeCategoryDto practiceCategoryDto) {
    PracticeCategoryResponseDto practiceCategoryResponseDto = practiceService.returnWordList(practiceCategoryDto);
    System.out.println("Data successfully returned to the frontend.");
    return new ResponseEntity<>(practiceCategoryResponseDto, HttpStatus.FOUND);
  }

  // 진행 종료 버튼 -> 진행한 학습 기록(practicedWordList, practicedProgress) 저장
  @PostMapping("/save-practice")
  public ResponseEntity practicedSave(@RequestHeader("Authorization") String authorizationHeader, @RequestBody PracticedSaveDto practicedSaveDto) {
    String token = authorizationHeader.replace("Bearer ", "");
    //학습 진행률 반환
    PracticedSaveResponseDto practicedSaveResponseDto = practiceService.savePracticedList(token, practicedSaveDto);

    return new ResponseEntity<>(practicedSaveResponseDto, HttpStatus.OK);
  }

  // 내 정보 -> 학습 기록 들어가면 카테고리별로 {최고 학습 진행률+그게 기록된 일시+가장 최근 학습 단어} 리턴
  // 학습 기록 -> 더보기 -> 선택한 카테고리에 해당하는 기록의 일자 리턴
  // 더보기 -> 일자 선택 -> 선택한 일자에 해당하는 기록{시간+진행률+단어} 리턴
}
