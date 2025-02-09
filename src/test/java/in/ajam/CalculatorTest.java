package in.ajam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import in.ajam.controller.Calculator;

@SpringBootTest
public class CalculatorTest {
	@Test
	public void addTest()
	{
		Calculator c =new Calculator();
		int actual= c.addition(3, 6);
		int exp=9;
		assertEquals(exp, actual);
		
	}

}
