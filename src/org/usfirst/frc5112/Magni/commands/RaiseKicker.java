package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class RaiseKicker extends Command {

	public RaiseKicker() {
		requires(Robot.kicker);

	}

	protected void initialize() {
		setTimeout(0.5);
		Robot.kicker.up(0.5);
	}

	protected void execute() {
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