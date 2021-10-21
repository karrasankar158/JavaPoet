package com.poe;

import com.squareup.javapoet.TypeSpec;
/**
 * Generating class using javaPoet API
 * @author Sankar Karra
 *
 */
public class GenerateClassTest {

	public static void main(String[] args) {
		TypeSpec person = TypeSpec
				.classBuilder("Person")
				.build();
		//printing output
		System.out.println(person);
	}
}
/**Output
 class Person {
}
 */
