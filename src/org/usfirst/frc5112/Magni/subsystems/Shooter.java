package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.Robot;
import org.usfirst.frc5112.Magni.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	private final SpeedController leftShooterMotor = RobotMap.leftShooterMotor;
	private final SpeedController rightShooterMotor = RobotMap.rightShooterMotor;

	public void initDefaultCommand() {
		stop();
	}

	public void shooterMotors(double speed) {
		rightShooterMotor.set(speed);
		leftShooterMotor.set(-speed);
	}

	public void stop() {
		Robot.shooter.shooterMotors(0);
	}

	public void spin(double speed) {
		Robot.shooter.shooterMotors(speed);
	}

	public void spinReverse(double speed) {
		Robot.shooter.shooterMotors(-speed);
	}
}
