package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class fireShooter extends CommandGroup {
	public fireShooter() {
		addSequential(new SpinFlyWheel());
		addParallel(new IntakeIn());
		addParallel(new SpinFlyWheel());
	}
}