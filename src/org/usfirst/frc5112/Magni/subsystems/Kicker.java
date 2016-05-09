package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Kicker extends Subsystem {
	private final SpeedController kickerMotor = RobotMap.kickerMotor;

	public void initDefaultCommand() {
		stop();
	}

	public void stop() {
		kickerMotor.set(0);
	}

	public void up(double speed) {
		kickerMotor.set(speed);
	}

	public void down(double speed) {
		kickerMotor.set(-speed);
	}
}
