package com.example.swaggerfoxbug;

import lombok.Data;

@Data
public class Animal {
	private Desc desc;

	@Data
	public class Desc {
		private String i_am_animal_inner_class;
	}
}
