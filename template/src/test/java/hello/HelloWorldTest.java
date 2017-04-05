package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void helloWorldSaysHello() {
		assertThat(new HelloWorld().sayHello(), containsString("Hello"));
	}

}
