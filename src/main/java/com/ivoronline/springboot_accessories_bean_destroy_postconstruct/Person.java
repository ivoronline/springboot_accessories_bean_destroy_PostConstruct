package com.ivoronline.springboot_accessories_bean_destroy_postconstruct;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //CONSTRUCT
  @PostConstruct
  public void construct() {
    System.out.println("Person Constructed");
  }

}
