package com.example.virtualthreadsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {

  @GetMapping("/name")
  public ThreadResponse getThreadName() {
    return new ThreadResponse(Thread.currentThread().toString());
  }
}
