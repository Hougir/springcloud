package com.sx.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private Status status;

	@Getter
	enum Status{
		FREE,
		BUSY,
		VOCATION;
	}

}
