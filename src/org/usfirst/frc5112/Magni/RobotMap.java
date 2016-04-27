package org.usfirst.frc5112.Magni;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

public class RobotMap {
	public static DigitalInput obstacleArmLimitSwitch;
	public static SpeedController obstacleArmMotor;
	public static SpeedController leftIntakeMotor;
	public static SpeedController rightIntakeMotor;
	public static SpeedController leftShooterMotor;
	public static SpeedController rightShooterMotor;
	public static SpeedController rightFrontDriveTrainMotor;
	public static SpeedController rightBackDriveTrainMotor;
	public static SpeedController leftFrontDriveTrainMotor;
	public static SpeedController leftBackDriveTrainMotor;
	public static SpeedController kickerMotor;

	public static void init() {
		// I remember everything...
		obstacleArmLimitSwitch = new DigitalInput(0);
		LiveWindow.addSensor("Obstacle Arm", "Limit Switch", obstacleArmLimitSwitch);
		obstacleArmMotor = new Victor(1);
		leftIntakeMotor = new Victor(2);
		rightIntakeMotor = new Victor(3);
		leftShooterMotor = new CANTalon(4);
		rightShooterMotor = new CANTalon(5);
		rightFrontDriveTrainMotor = new CANTalon(6);
		rightBackDriveTrainMotor = new CANTalon(7);
		leftFrontDriveTrainMotor = new CANTalon(8);
		leftBackDriveTrainMotor = new CANTalon(9);
		kickerMotor = new Victor(0);

	}
}
