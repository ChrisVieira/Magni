package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5112.Magni.Robot;

public class IntakeIn extends Command {

	public IntakeIn() {
		requires(Robot.intake);

	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.intake.intakeIn(0.5);
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
