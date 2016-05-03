package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private final SpeedController leftShooterMotor = RobotMap.leftShooterMotor;
	private final SpeedController rightShooterMotor = RobotMap.rightShooterMotor;

	public void initDefaultCommand() {
		
	}

	public void stop() {
		spin(0);
	}

	public void spin(double speed) {
		rightShooterMotor.set(speed);
		leftShooterMotor.set(-speed);
	}

	public void spinReverse(double speed) {
		spin(-speed);
	}
}
