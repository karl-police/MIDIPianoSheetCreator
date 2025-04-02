package com.lclion.midigui;

import java.awt.AWTException;
import java.awt.Robot;

public class KeySender {
	public void sendKey(int keycode) {
		try {
			Robot robot = new Robot();
			
			robot.keyPress(keycode);
			robot.keyRelease(keycode);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
