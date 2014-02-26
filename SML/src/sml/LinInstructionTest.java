package sml;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinInstructionTest {
	Instruction lin;
	@Before
	public void setUp() throws Exception {
		lin = new LinInstruction("L1",0,5);
	}

	@Test
	public final void testToString() {
		String expected = "L1: lin register 0 value is 5";
		String input = lin.toString();
		assertEquals("ToString Overriding not working properly or not implemented", expected, input);
	}

	@Test
	public final void testExecute() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLinInstruction() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testInstruction() {
		fail("Not yet implemented"); // TODO
	}

}
