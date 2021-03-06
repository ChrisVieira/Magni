package org.usfirst.frc5112.Magni;

import org.usfirst.frc5112.Magni.commands.IntakeIn;
import org.usfirst.frc5112.Magni.commands.IntakeOut;
import org.usfirst.frc5112.Magni.commands.LowerArm;
import org.usfirst.frc5112.Magni.commands.LowerKicker;
import org.usfirst.frc5112.Magni.commands.RaiseArm;
import org.usfirst.frc5112.Magni.commands.RaiseKicker;

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
		xbox.B.whenPressed(new LowerArm());
		xbox.DPAD_UP.whenActive(new IntakeIn());
		xbox.DPAD_DOWN.whenActive(new IntakeOut());
		xbox.Y.whenPressed(new RaiseKicker());
		xbox.X.whenPressed(new LowerKicker());
	}

	public Joystick getJoystick() {
		return joystick;
	}

	public Joystick getXboxController() {
		return xbox;
	}

}