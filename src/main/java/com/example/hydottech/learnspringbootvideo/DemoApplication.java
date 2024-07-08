package com.example.hydottech.learnspringbootvideo;

import com.example.hydottech.learnspringbootvideo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> GetHello(){

		return List.of(
				new Student(
						1L,
						"Solomon Danso",
						30,
						LocalDate.of(1999, Month.DECEMBER, 31),
						"solomondanso@gmail.com"

				),
				new Student(
						2L,
						"Isaac Frimpong",
						20,
						LocalDate.of(2012, Month.DECEMBER, 31),
						"isaacfrimpong@gmail.com"

				)

		);
	}

}
