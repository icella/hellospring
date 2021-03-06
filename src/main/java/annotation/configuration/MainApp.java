package annotation.configuration;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
	}

}
