package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AlignWithTarget extends CommandGroup {
	public AlignWithTarget() {
		addParallel(new TargetGoal());
	}

}
