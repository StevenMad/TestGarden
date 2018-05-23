package kataFizzBuzzTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import kataFizzBuzz.FizzBuzz;

public class FizzBuzzTest {

	private void verifyFizzBuzz(int number, String expected) {
		FizzBuzz instance = new FizzBuzz(null);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		instance.printFizzBuzz(number);
		String result = baos.toString();
		assertThat(result,is(expected));
	}
	
	
	@Test
	public void printFizzBuzz_1_is1() {
		verifyFizzBuzz(1, "1\n");
		}
	
	@Test
	public void printFizzBuzz_2_is1and2() {
		verifyFizzBuzz(2,"1\n2\n");
		}
	
	@Test
	public void printFizzBuzz_3_is1and2andFizz() {
		verifyFizzBuzz(3,"1\n2\nFizz\n");
		}
	
	@Test
	public void printFizzBuzz_5_shows1and2andFizzand4andBuzz() {
		verifyFizzBuzz(5,"1\n2\nFizz\n4\nBuzz\n");
		}
}
