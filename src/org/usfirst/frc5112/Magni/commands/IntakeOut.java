package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class IntakeOut extends Command {

	public IntakeOut() {
		requires(Robot.intake);
	}

	protected void initialize() {
		Robot.intake.intakeOut(0.5);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.intake.stop();
	}

	protected void interrupted() {
		end();
	}
}
