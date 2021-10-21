package com.poe;

import com.squareup.javapoet.TypeSpec;
/**
 * JavaPoet API used to generating interfcae
 * @author Sankar Karra
 *
 */
public class GenerateInterfaceTest {

	public static void main(String[] args) {
		TypeSpec person = TypeSpec
				.interfaceBuilder("Person")
				.build();
		//printing output
		System.out.println(person);
	}

}
/**
 Output
 interface Person {
}
 */
