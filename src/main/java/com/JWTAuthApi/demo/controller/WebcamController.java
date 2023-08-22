package com.JWTAuthApi.demo.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webcam")
public class WebcamController {
  @PostMapping
  public ResponseEntity<String> runPythonScript(@RequestBody String requestBody) {
    String pythonScriptPath = "C:\\Users\\PC\\SignBridge\\SignBridge_AI\\skip.py"; // 파이썬 스크립트 경로
    String pythonInterpreter = "python"; // 파이썬 인터프리터 경로 (시스템 PATH에 등록되어 있다고 가정)

    try {
      ProcessBuilder processBuilder = new ProcessBuilder(pythonInterpreter, pythonScriptPath);
      processBuilder.directory(new File("C:\\Users\\PC\\SignBridge\\SignBridge_AI")); // 스크립트가 있는 폴더 경로

      Process process = processBuilder.start();

      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      StringBuilder output = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        output.append(line).append("\n");
      }

      int exitCode = process.waitFor();
      output.append("Python script execution completed with exit code: ").append(exitCode);

      return ResponseEntity.ok(output.toString());
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
      return ResponseEntity.badRequest().body("Error occurred: " + e.getMessage());
    }
  }
}
