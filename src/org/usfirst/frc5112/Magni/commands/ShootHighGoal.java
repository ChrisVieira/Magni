package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootHighGoal extends CommandGroup {
	public ShootHighGoal() {
		addSequential(new AlignWithTarget());
		addSequential(new fireShooter());
	}
}