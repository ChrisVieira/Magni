package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class StopDriveTrain extends Command {

	public StopDriveTrain() {
		requires(Robot.drivetrain);
	}

	protected void initialize() {
		Robot.drivetrain.stop();
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
		Robot.drivetrain.stop();
	}
}