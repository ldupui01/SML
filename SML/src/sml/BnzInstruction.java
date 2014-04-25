package sml;


/**
 * This class ....
 * 
 * @author someone
 */

public class BnzInstruction extends Instruction {
	private int register;
	private String nextLabel;

	/*completely unnecessary code ?
	public OutInstruction(String label, String opcode) {
		super(label, opcode);
	}
	*/

	

	public BnzInstruction(String label, int s1, String nextLabel) {
		super(label, "bnz");
		this.register = s1;
		this.nextLabel = nextLabel;
	}

	@Override
	public void execute(MachineInterface m) {
		if(register != 0){
			m.setPc(m.getProg().indexOf(nextLabel));
			m.execute();
		}
	}

	@Override
	public String toString() {
		return super.toString() + " next label being called is " + nextLabel;
	}
}
