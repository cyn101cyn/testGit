package com.cloud.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
  private int age;
  private String name;
  public User(){}

  public User(int age,String name){
      this.age=age;
      this.name=name;
  }
}
