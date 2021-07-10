package com.az.jblog.cucumber;

import com.az.jblog.JblogApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JblogApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
