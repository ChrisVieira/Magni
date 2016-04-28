package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class RaiseArm extends Command {

	public RaiseArm() {
		requires(Robot.obstacleArm);
		setTimeout(1);
	}

	protected void initialize() {
		Robot.obstacleArm.up(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Robot.obstacleArm.stop();
	}

	protected void interrupted() {
		end();
	}
}
