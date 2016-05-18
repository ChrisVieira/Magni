package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private final SpeedController intakeMotor = RobotMap.intakeMotor;

	public void initDefaultCommand() {
		stop();
	}

	public void stop() {
		intakeMotor.set(0);
	}

	public void intakeIn(double speed) {
		intakeMotor.set(speed);
	}

	public void intakeOut(double speed) {
		intakeMotor.set(-speed);
	}
}