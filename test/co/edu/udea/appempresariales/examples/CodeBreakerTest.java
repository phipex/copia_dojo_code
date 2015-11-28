package co.edu.udea.appempresariales.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodeBreakerTest {
	CodeBreaker c;
	
	@Test
	public void correcto() {
		c = new CodeBreaker();
		String correcto = "xxxx";
		c.setSecret("1234");
		StringBuffer r=c.test(new StringBuffer("1234"));
		assertEquals(correcto, r.toString());
	}

	@Test
	public void incorrecto() {
		c = new CodeBreaker();
		String inCorrecto = "";
		c.setSecret("1234");
		StringBuffer r=c.test(new StringBuffer("5678"));
		assertEquals(inCorrecto, r.toString());
	}
	
	@Test
	public void sinPosiciones() {
		c = new CodeBreaker();
		String correcto = "____";
		c.setSecret("1234");
		StringBuffer r=c.test(new StringBuffer("4321"));
		assertEquals(correcto, r.toString());
	}
	
	@Test
	public void algunasPosiciones() {
		c = new CodeBreaker();
		String correcto = "x_";
		c.setSecret("1234");
		StringBuffer r=c.test(new StringBuffer("1367"));
		assertEquals(correcto, r.toString());
	}
	
	@Test
	public void algunasPosiciones2() {
		c = new CodeBreaker();
		String correcto = "x";
		c.setSecret("1234");
		StringBuffer r=c.test(new StringBuffer("6537"));
		assertEquals(correcto, r.toString());
	}
	
	@Test
	public void algunasPosiciones3() {
		c = new CodeBreaker();
		String correcto = "x";
		c.setSecret("1111");
		StringBuffer r=c.test(new StringBuffer("1234"));
		assertEquals(correcto, r.toString());
	}
	
	@Test
	public void correcto2() {
		c = new CodeBreaker();
		String correcto = "xxxx";
		c.setSecret("0000");
		StringBuffer r=c.test(new StringBuffer("0000"));
		assertEquals(correcto, r.toString());
	}
	
	@Test
	public void correcto3() {
		c = new CodeBreaker();
		String correcto = "xx__";
		c.setSecret("0101");
		StringBuffer r=c.test(new StringBuffer("1001"));
		assertEquals(correcto, r.toString());
	}
}
