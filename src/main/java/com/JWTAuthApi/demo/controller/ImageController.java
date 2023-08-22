package com.JWTAuthApi.demo.controller;

import com.JWTAuthApi.demo.service.Learning.ImageService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
  @Autowired
  private ImageService imageService;

  @PostMapping("/generate-image-urls")
  public ResponseEntity<List<String>> generateImageUrls() throws IOException {
    List<String> imageUrls = imageService.generateImageUrls();
    return ResponseEntity.ok(imageUrls);
  }
}
