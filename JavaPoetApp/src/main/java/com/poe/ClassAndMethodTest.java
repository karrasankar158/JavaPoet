package com.poe;

import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
/**
 *  Generating class and Method using JavaPoet API
 * @author Sankar Karra
 *
 */
public class ClassAndMethodTest {
	public static void main(final String[] args) throws IOException {
		/**
		 $S is for strings so we don’t need to add quotes,
         $N references by a name
		 */
		MethodSpec greetCustomer = MethodSpec.methodBuilder("display").addModifiers(Modifier.PUBLIC).returns(String.class).addParameter(String.class, "name")
				.addStatement("return $S+$N", "Welcome, ", "name").build();
		TypeSpec customerService = TypeSpec.classBuilder("TestApp").addModifiers(Modifier.PUBLIC).addMethod(greetCustomer).build();
		JavaFile javaFile = JavaFile.builder("com.poe", customerService).build();
		//printing output
		javaFile.writeTo(System.out);
	}
}
/**Output
package com.poe;

import java.lang.String;

public class TestApp {
  public String display(String name) {
    return "Welcome, "+name;
  }
}
 */
