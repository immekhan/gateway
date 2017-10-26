package com.itob.cucumber.stepdefs;

import com.itob.MsgatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MsgatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
