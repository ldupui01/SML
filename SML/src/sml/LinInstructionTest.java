package sml;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinInstructionTest {
	Instruction lin;
	String example;
	@Before
	public void setUp() throws Exception {
		lin = new LinInstruction("L1",0,5);
		example = lin.toString();
	}

	@Test
	public final void testToString() {
		String expected = "L1: lin register 0 value is 5";
		String input = example;
		assertEquals("ToString Overriding not working properly or not implemented", expected, input);
	}

	@Test
	public final void testExecute() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLinInstruction() {
		String[] expected = new String[3];
		expected[0] = "L1:";
		expected[1] = "0";
		expected[2] = "5";
		String[] exampleArray = example.split(" ");
		String[] input = new String[3];
		input[0] = exampleArray[0];
		input[1] = exampleArray[3];
		input[2] = exampleArray[6];
		
		assertTrue("LinInstruction is not an instance of instruction", lin instanceof Instruction);
		assertArrayEquals("label, register and parameter are not being translated properly",expected, input);
	}

	@Test
	public final void testInstruction() {
		String[] expected = new String[2];
		expected[0] = "L1:";
		expected[1] = "lin";
		String[] exampleArray = example.split(" ");
		String[] input = new String[2];
		input[0] = exampleArray[0];
		input[1] = exampleArray[1];
	
		
		assertTrue("LinInstruction is not an instance of instruction", lin instanceof Instruction);
		assertArrayEquals("label and opcode are not being translated properly",expected, input);
	}

}
