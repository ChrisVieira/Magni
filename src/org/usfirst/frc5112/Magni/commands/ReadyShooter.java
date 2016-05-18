package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ReadyShooter extends Command {

	public ReadyShooter() {
		requires(Robot.shooter);
	}

	protected void initialize() {
		setTimeout(3);
		Robot.shooter.spin(0.75);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {

	}

	protected void interrupted() {
		Robot.shooter.stop();
	}

}