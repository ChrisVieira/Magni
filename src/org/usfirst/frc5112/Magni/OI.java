package org.usfirst.frc5112.Magni;

import org.usfirst.frc5112.Magni.commands.RaiseArm;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick joystick;
	public XboxController xbox;
	public JoystickButton joystickTrigger;
	public JoystickButton joystickSideButton;
	public JoystickButton joystickButton3;
	public JoystickButton joystickButton4;

	public OI() {

		xbox = new XboxController(1);
		joystick = new Joystick(0);
		joystickTrigger = new JoystickButton(joystick, 1);
		joystickSideButton = new JoystickButton(joystick, 2);
		joystickButton3 = new JoystickButton(joystick, 3);
		joystickButton4 = new JoystickButton(joystick, 4);

		xbox.A.whenPressed(new RaiseArm());
	}

	public Joystick getJoystick() {
		return joystick;
	}

	public Joystick getXboxController() {
		return xbox;
	}

}
