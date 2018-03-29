package com.example.patientportal.cucumber.stepdefs;

import com.example.patientportal.PatientPortalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PatientPortalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
