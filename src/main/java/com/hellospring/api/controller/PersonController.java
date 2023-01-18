package com.hellospring.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellospring.api.dto.PersonDTO;

@RestController
@RequestMapping("/api/person")
public class PersonController {

  @PostMapping
  public void create(@RequestBody PersonDTO req) {
    System.out.println(req);
  }
}
