package com.gabriel.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dominio.Pessoa;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
		Pessoa p1 = new Pessoa("Anna", 1, "anna@gmail.com");
		Pessoa p2 = new Pessoa("Carlos", 1, "carlos@gmail.com");
		Pessoa p3 = new Pessoa("Henrique", 1, "henrique@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
