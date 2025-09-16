package net.javaguides.todo;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;

@SpringBootTest
public class TodoManagementApplicationTests {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();

	}

	@Test
	void contextLoads() {
	}

}
