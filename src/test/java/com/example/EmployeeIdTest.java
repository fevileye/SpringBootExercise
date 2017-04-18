package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import javax.validation.constraints.AssertTrue;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeIdTest {

	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc=MockMvcBuilders
				.standaloneSetup(new EmployeeController())
				.build();
	}
	
	@Test
	public void EmployeeIdTest() throws Exception{
		this.mockMvc.perform(get("/employees/3")).andExpect(status().isNotFound());
		
	}
	
}
