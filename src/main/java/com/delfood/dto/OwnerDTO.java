package com.delfood.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
public class OwnerDTO {
  public enum Status {
    DEFAULT, DELETED
  }
  
  @NonNull
  private String id;
  @NonNull
  private String password;
  @NonNull
  private String name;
  @NonNull
  private String mail;
  @NonNull
  private String tel;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private Status status;
  
  /**
   * 회원가입 전 null 정보 체크 메서드
   * @author jun
   * @param ownerInfo nullCheck할 사장님 정보
   * @return null이 존재할 시 true
   */
  public static boolean hasNullDataBeforeSignUp(OwnerDTO ownerInfo) {
    if (ownerInfo.getId() == null
        || ownerInfo.getPassword() == null
        || ownerInfo.getName() == null
        || ownerInfo.getTel() == null
        || ownerInfo.getTel() == null)
      return true;
    
    return false;
  }
  
  
}