package org.usfirst.frc5112.Magni.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoatAuto extends CommandGroup {
    
    public  MoatAuto() {
        addSequential(new DriveTrainForward(2));
    }
}
