package co.edu.udea.appempresariales.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	calculator c;
	int r=0;
	
	@Test
	public void add_1_1() {
		c = new calculator(); //Arrange
		r = c.add(1,1); //Act
		assertEquals(2, r); //Assert
	}
	
	@Test
	public void add_2_2() {
		c = new calculator(); //Arrange
		r = c.add(2,2); //Act
		assertEquals(4, r); //Assert
	}
}
