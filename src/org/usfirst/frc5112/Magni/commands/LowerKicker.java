package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LowerKicker extends Command {

	@Override
	protected void initialize() {
		setTimeout(0.5);
	}

	@Override
	protected void execute() {
		Robot.kicker.up(0.5);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		Robot.kicker.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
