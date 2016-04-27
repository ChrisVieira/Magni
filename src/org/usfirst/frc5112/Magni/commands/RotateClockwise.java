package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class RotateClockwise extends Command {

	@Override
	protected void initialize() {
		Robot.drivetrain.rotateClockwise(0);
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
		Robot.drivetrain.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
