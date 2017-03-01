package org.springbyexample.di.xml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
	final static Logger logger = LoggerFactory.getLogger(MessageRunner.class);
	private static ApplicationContext applicationContext;
	
	public static void main(String[] args)
	{
		logger.info("Initializing spring context");
		
		applicationContext = new ClassPathXmlApplicationContext("./spring.xml");
		
		logger.info("spring context initialized");
		
		DefaultMessage message = (DefaultMessage) applicationContext.getBean("message");
		logger.warn("message='"+ message.getMessage() + "'");
	}
}