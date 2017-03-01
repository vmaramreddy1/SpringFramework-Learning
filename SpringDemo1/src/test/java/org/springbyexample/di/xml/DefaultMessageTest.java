package org.springbyexample.di.xml;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springbyexample.di.xml.DefaultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DefaultMessageTest {
	final Logger logger = LoggerFactory.getLogger(DefaultMessageTest.class);
	
	@Autowired
	private DefaultMessage message = null;
	
	@Test
	public void testMessage()
	{
		assertNotNull("Setter message instance is null", message);
		
		String msg = message.getMessage();
		
		assertNotNull("Message is null.",msg);
		
		String expectedMessage = "Spring is fun.";
		
		assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage,msg);
		
		logger.info("message='{}'",msg);
		
	}
}
