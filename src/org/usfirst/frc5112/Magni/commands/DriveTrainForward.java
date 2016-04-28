
package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class DriveTrainForward extends Command {

	public DriveTrainForward() {
		requires(Robot.drivetrain);
	}

	protected void initialize() {
		Robot.drivetrain.forward(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();
	}
}
