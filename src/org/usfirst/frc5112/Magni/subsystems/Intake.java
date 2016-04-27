package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import org.usfirst.frc5112.Magni.commands.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private final SpeedController rightIntakeMotor = RobotMap.rightIntakeMotor;
	private final SpeedController leftIntakeMotor = RobotMap.leftIntakeMotor;

	public void initDefaultCommand() {
		rightIntakeMotor.set(0);
		leftIntakeMotor.set(0);
	}
}
