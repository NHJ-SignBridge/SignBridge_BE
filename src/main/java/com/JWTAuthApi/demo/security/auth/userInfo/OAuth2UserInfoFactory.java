package com.JWTAuthApi.demo.security.auth.userInfo;

import com.JWTAuthApi.demo.domain.user.ProviderType;

import java.util.Map;

// OAuth2로부터 얻은 사용자 정보를 적절한 하위 클래스를 사용하여 생성하기 위한 팩토리 클래스. 제공자 유형에 따라 적절한 OAuth2UserInfo 하위 클래스를 반환
public class OAuth2UserInfoFactory {

  public static OAuth2UserInfo getOAuth2UserInfo(ProviderType providerType,
      Map<String, Object> attributes) {
    switch (providerType) {
      case GOOGLE:
        return new GoogleOAuth2UserInfo(attributes);
      case NAVER:
        return new NaverOAuth2UserInfo(attributes);
      case KAKAO:
        return new KakaoOAuth2UserInfo(attributes);
      default:
        throw new IllegalArgumentException("Invalid Provider Type.");
    }
  }
}
