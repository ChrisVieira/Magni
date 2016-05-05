package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinFlyWheel extends Command {

	@Override
	protected void initialize() {
		setTimeout(3);
	}

	@Override
	protected void execute() {
		Robot.shooter.spin(.8);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		Robot.shooter.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
