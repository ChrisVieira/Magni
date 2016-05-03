package org.usfirst.frc5112.Magni.commands;

import org.usfirst.frc5112.Magni.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ReadyShooter extends Command {

	public ReadyShooter() {
		requires(Robot.shooter);
	}

	@Override
	protected void initialize() {
		setTimeout(3);
		Robot.shooter.spin(0.75);
	}

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {
		Robot.shooter.stop();
	}

}