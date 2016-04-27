package org.usfirst.frc5112.Magni;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc5112.Magni.commands.*;
import org.usfirst.frc5112.Magni.subsystems.*;

public class Robot extends IterativeRobot {

	Command autonomousCommand;

	public static OI oi;
	public static Drivetrain drivetrain;
	public static Shooter shooter;
	public static Intake intake;
	public static ObstacleArm obstacleArm;
	public static Kicker kicker;

	public void robotInit() {
		RobotMap.init();
		drivetrain = new Drivetrain();
		shooter = new Shooter();
		intake = new Intake();
		obstacleArm = new ObstacleArm();
		kicker = new Kicker();

		oi = new OI();

		autonomousCommand = new AutonomousCommand();
	}

	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {

		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
}
