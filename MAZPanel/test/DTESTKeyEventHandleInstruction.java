package test;

import java.awt.event.KeyEvent;

import interfaces.IKeyEventHandleInstruction;

public class DTESTKeyEventHandleInstruction implements IKeyEventHandleInstruction{

	@Override
	public void pressAction(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {System.exit(0);}
	}

	@Override public void releaseAction(KeyEvent e) {}
}
