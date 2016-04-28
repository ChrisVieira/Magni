package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinFlyWheeelBackwards extends Command {

	public SpinFlyWheeelBackwards() {
		requires(Robot.shooter);
	}

	@Override
	protected void initialize() {
		Robot.shooter.spinReverse(0.5);
	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return false;
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
