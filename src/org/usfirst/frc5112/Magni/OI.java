package org.usfirst.frc5112.Magni;

import org.usfirst.frc5112.Magni.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;

public class OI {

	public Joystick joystick;
	public Joystick xboxController;

	public OI() {

		xboxController = new Joystick(1);
		joystick = new Joystick(0);

		// SmartDashboard Buttons
		SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
		SmartDashboard.putData("IntakeIn", new IntakeIn());
		SmartDashboard.putData("MoatAuto", new MoatAuto());
		SmartDashboard.putData("IntakeOut", new IntakeOut());
		SmartDashboard.putData("RaiseArm", new RaiseArm());
		SmartDashboard.putData("RaiseKicker", new RaiseKicker());
		SmartDashboard.putData("LowerArm", new LowerArm());
		SmartDashboard.putData("StopDriveTrain", new StopDriveTrain());
		SmartDashboard.putData("DriveTrainForward", new DriveTrainForward());
		SmartDashboard.putData("DriveTrainBackwards", new DriveTrainBackwards());
	}

	public Joystick getJoystick() {
		return joystick;
	}

	public Joystick getXboxController() {
		return xboxController;
	}

}
