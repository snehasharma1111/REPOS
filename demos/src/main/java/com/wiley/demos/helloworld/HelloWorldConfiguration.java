package com.wiley.demos.helloworld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String city) {};
record Person(String name, int age, Address address) {};
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Sneha";
	}
	@Bean
	public int age() {
		return 22;
	}
	@Bean
	public Person person() {
		return new Person("Vansh",19, new Address("Brahampuri", "Meerut"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, Address myAddress1){
		return new Person(name, age, myAddress1);
	}
	
	@Bean(name = "myAddress")
	public Address address() {
		return new Address("Brahampuri", "Meerut");
	}
	@Bean(name = "myAddress1")
	@Primary
	public Address address2() {
		return new Address("Shashtri nagar", "Agra");
	}
	
}
