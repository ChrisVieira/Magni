package org.usfirst.frc5112.Magni.subsystems;

import org.usfirst.frc5112.Magni.Robot;
import org.usfirst.frc5112.Magni.commands.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	private final SpeedController rightBackDriveTrainMotor = RobotMap.rightBackDriveTrainMotor;
	private final SpeedController rightFrontDriveTrainMotor = RobotMap.rightFrontDriveTrainMotor;
	private final SpeedController leftBackDriveTrainMotor = RobotMap.leftBackDriveTrainMotor;
	private final SpeedController leftFrontDriveTrainMotor = RobotMap.leftFrontDriveTrainMotor;

	public void initDefaultCommand() {
		arcadeDrive(Robot.oi.joystick);
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
		rightDriveTrain(0);
		leftDriveTrain(0);
	}

	public void forward(double speed) {
		rightDriveTrain(speed);
		leftDriveTrain(speed);
	}

	public void backward(double speed) {
		rightDriveTrain(speed);
		leftDriveTrain(speed);
	}

	public void rotateClockwise(double speed) {
		rightDriveTrain(speed);
		leftDriveTrain(-speed);
	}

	public void rotateCounterClockwise(double speed) {
		rightDriveTrain(-speed);
		leftDriveTrain(speed);
	}

	public void arcadeDrive(Joystick joystick) {
		Robot.drivetrain.arcadeDrive(joystick);
	}
}