package kataFizzBuzzTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import kataFizzBuzz.FizzBuzz;
import kataFizzBuzz.Printer;

public class FizzBuzzCollabTest {

	@Test
	public void unit_scenario_expectation() {
		Printer printer = mock(Printer.class);
		FizzBuzz instance = new FizzBuzz(printer);
		instance.fizzBuzz(1);
		verify(printer).print("1");
		}
}
