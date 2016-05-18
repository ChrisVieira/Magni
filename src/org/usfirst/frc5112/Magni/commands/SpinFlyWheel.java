package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class SpinFlyWheel extends Command {

	protected void initialize() {
		setTimeout(3);
	}

	protected void execute() {
		Robot.shooter.spin(.8);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.shooter.stop();
	}

	protected void interrupted() {
		end();
	}
}