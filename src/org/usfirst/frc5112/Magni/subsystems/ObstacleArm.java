package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ObstacleArm extends Subsystem {
	private final SpeedController obstacleArmMotor = RobotMap.obstacleArmMotor;

	public void initDefaultCommand() {
		stop();
	}

	public void stop() {
		obstacleArmMotor.set(0);
	}

	public void up(double speed) {
		obstacleArmMotor.set(speed);
	}

	public void down(double speed) {
		obstacleArmMotor.set(-speed);
	}
}
