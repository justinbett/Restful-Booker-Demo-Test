package com.justinbett.restful_booker_demo;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;

@Listeners(resources.Listeners.class)
public class HelloWorld extends Hooks {

	public HelloWorld() throws IOException {
		super();
	}
	
	@Test
	public void StartProject() throws IOException {
		System.out.println("Hello World");
	}
	
}
