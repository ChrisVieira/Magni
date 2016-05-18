package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class LowerKicker extends Command {

	protected void initialize() {
		setTimeout(0.5);
	}

	protected void execute() {
		Robot.kicker.up(0.5);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.kicker.stop();
	}

	protected void interrupted() {
		end();
	}

}
