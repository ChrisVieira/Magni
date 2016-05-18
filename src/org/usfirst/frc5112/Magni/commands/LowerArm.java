package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class LowerArm extends Command {

	public LowerArm() {
		requires(Robot.obstacleArm);
	}

	protected void initialize() {
		Robot.obstacleArm.down(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.obstacleArm.stop();
	}

	protected void interrupted() {
		end();
	}
}
