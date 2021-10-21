package com.poe;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.FieldSpec;
/**
 * Field code generation using JavaPoet API
 * @author Sankar Karra
 *
 */
public class FieldSpecification {

	public static void main(String[] args) {
		FieldSpec name = FieldSpec
				.builder(String.class, "name")
				.addModifiers(Modifier.PRIVATE)
				.build();
		//print
		System.out.println(name);
	}

}
/**Output
 * private java.lang.String name;

 */
