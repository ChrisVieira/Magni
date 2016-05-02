package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	private final SpeedController rightBackDriveTrainMotor = RobotMap.rightBackDriveTrainMotor;
	private final SpeedController rightFrontDriveTrainMotor = RobotMap.rightFrontDriveTrainMotor;
	private final SpeedController leftBackDriveTrainMotor = RobotMap.leftBackDriveTrainMotor;
	private final SpeedController leftFrontDriveTrainMotor = RobotMap.leftFrontDriveTrainMotor;
	private final RobotDrive driveTrainRobotDrive = RobotMap.driveTrainRobotDrive;

	public void initDefaultCommand() {
	}

	public void leftDriveTrain(double speed) {
		leftBackDriveTrainMotor.set(speed);
		leftFrontDriveTrainMotor.set(speed);
	}

	public void rightDriveTrain(double speed) {
		rightBackDriveTrainMotor.set(-speed);
		rightFrontDriveTrainMotor.set(-speed);
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
		driveTrainRobotDrive.arcadeDrive(0,speed);
	}

	public void rotateCounterClockwise(double speed) {
		driveTrainRobotDrive.arcadeDrive(0, -speed);
	}

	public void arcadeDrive(Joystick joystick) {
		driveTrainRobotDrive.arcadeDrive(joystick.getY(), joystick.getZ());
	}
}