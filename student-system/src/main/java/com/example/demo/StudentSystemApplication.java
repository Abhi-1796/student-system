package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.StudentRepository;


@SpringBootApplication
public class StudentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
	}
    @Autowired
    private StudentRepository studentRepository;
    
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("abhi","yadav","ajdsafjf","aajhgg@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("abhijeet","yadav","asdfhf","ahgg@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("abhay","singh","dsjfqsuf","aajhgg@gmail.com");
		studentRepository.save(student3);
		*/
		
		
		
	}

}
