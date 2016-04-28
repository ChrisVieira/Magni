package org.usfirst.frc5112.Magni;

import edu.wpi.first.wpilibj.*;

public class RobotMap {
	public static SpeedController obstacleArmMotor;
	public static SpeedController intakeMotor;
	public static SpeedController leftShooterMotor;
	public static SpeedController rightShooterMotor;
	public static SpeedController rightFrontDriveTrainMotor;
	public static SpeedController rightBackDriveTrainMotor;
	public static SpeedController leftFrontDriveTrainMotor;
	public static SpeedController leftBackDriveTrainMotor;
	public static SpeedController kickerMotor;
	public static RobotDrive driveTrainRobotDrive;

	public static void init() {
		driveTrainRobotDrive = new RobotDrive(rightFrontDriveTrainMotor, leftBackDriveTrainMotor,
				rightFrontDriveTrainMotor, rightBackDriveTrainMotor);
		obstacleArmMotor = new Victor(1);
		intakeMotor = new Victor(3);
		leftShooterMotor = new CANTalon(4);
		rightShooterMotor = new CANTalon(5);
		rightFrontDriveTrainMotor = new CANTalon(6);
		rightBackDriveTrainMotor = new CANTalon(7);
		leftFrontDriveTrainMotor = new CANTalon(8);
		leftBackDriveTrainMotor = new CANTalon(9);
		kickerMotor = new Victor(0);

	}
}
