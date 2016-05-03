package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import org.usfirst.frc5112.Magni.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

	private final RobotDrive driveTrainRobotDrive = RobotMap.driveTrainRobotDrive;

	public void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}

	public void stop() {
		driveTrainRobotDrive.drive(0, 0);
	}

	public void forward(double speed) {
		driveTrainRobotDrive.drive(-speed, 0);
	}

	public void backward(double speed) {
		driveTrainRobotDrive.drive(speed, 0);
	}

	public void rotateClockwise(double speed) {
		driveTrainRobotDrive.arcadeDrive(0, speed);
	}

	public void rotateCounterClockwise(double speed) {
		driveTrainRobotDrive.arcadeDrive(0, -speed);
	}

	public void arcadeDrive(Joystick joystick) {
		driveTrainRobotDrive.arcadeDrive(joystick.getY(), joystick.getZ());
	}
}