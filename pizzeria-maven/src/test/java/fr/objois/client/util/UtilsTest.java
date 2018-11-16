package fr.objois.client.util;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilsTest {
	
	private static Logger LOGGER = LoggerFactory.getLogger(UtilsTest.class);
	
	@Before
	public void avantChaqueTest() {
		LOGGER.info("DEBUT du test");
	}
	
	@After
	public void apresChaqueTest() {
		LOGGER.info("FIN du test");
	}
	
	@Test
	public void verifTelPortableKOEqualsNull() {
		
		String telPortable = null;
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		
		assertEquals(false, verifTelPortable);
		
	}
	
	@Test
	public void verifTelPortableKOEqualsEmpty() {
		
		String telPortable = "";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		
		assertEquals(false, verifTelPortable);
		
	}
	
	@Test
	public void verifTelPortableKOEquals10() {
		
		String telPortable = "123456789";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		
		assertEquals(false, verifTelPortable);
		
	}
	
	@Test
	public void verifTelPortableKOStartWith06() {
		
		String telPortable = "3697863214";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		
		assertEquals(false, verifTelPortable);
		
	}
	@Test
	public void verifTelPortableKOStartWith07() {
		
		String telPortable = "1236544788";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		
		assertEquals(false, verifTelPortable);
		
	}
	@Test
	public void verifTelPortableOK07() {
		
		String telPortable = "0736544788";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		LOGGER.info("veriftelPortableOK07");
		
		assertEquals(true, verifTelPortable);
		
	}
	@Test
	public void verifTelPortableOK06() {
		new Utils();
		String telPortable = "0636544788";
		Boolean verifTelPortable = Utils.verifTelPortable(telPortable);
		LOGGER.info("veriftelPortableOK06");
		
		assertEquals(true, verifTelPortable);
		
	}
	
	
}
