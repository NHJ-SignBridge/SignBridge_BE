package com.JWTAuthApi.demo.service.Learning;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

  private final ResourceLoader resourceLoader;

  public ImageService(ResourceLoader resourceLoader) {
    this.resourceLoader = resourceLoader;
  }

  public List<String> generateImageUrls() throws IOException {
    Resource resource = new ClassPathResource("static/images/"); // 이미지 폴더에 대한 클래스패스 리소스 경로 설정
    File imageFolder = resource.getFile();
    File[] imageFiles = imageFolder.listFiles();

    List<String> imageUrls = new ArrayList<>();
    if (imageFiles != null) {
      for (File imageFile : imageFiles) {
        if (imageFile.isFile()) {
          String imageUrl = "http://localhost:8080/images/" + imageFile.getName(); // 이미지 URL 생성
          imageUrls.add(imageUrl);
        }
      }
    }

    return imageUrls;
  }

}

