package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class SpinFlyWheeelBackwards extends Command {

	public SpinFlyWheeelBackwards() {
		requires(Robot.shooter);
	}

	protected void initialize() {
		Robot.shooter.spinReverse(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.shooter.stop();
	}

	protected void interrupted() {
		end();
	}
}