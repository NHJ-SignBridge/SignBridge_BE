package com.JWTAuthApi.demo.security.auth.userInfo;

import java.util.Map;
//OAuth로부터 사용자 정보를 추상화하는 추상클래스. 하위 클래스는 이를 확장하여 각 소셜 미디어 플랫폼에 맞게 정보 추출
public abstract class OAuth2UserInfo {

  protected Map<String, Object> attributes;

  public OAuth2UserInfo(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public abstract String getId();

  public abstract String getName();

  public abstract String getEmail();

}
