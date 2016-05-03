package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class DriveTrainBackwards extends Command {

	public DriveTrainBackwards(double time) {
		super(time);
		requires(Robot.drivetrain);
	}

	protected void initialize() {
		Robot.drivetrain.backward(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();
	}
}
