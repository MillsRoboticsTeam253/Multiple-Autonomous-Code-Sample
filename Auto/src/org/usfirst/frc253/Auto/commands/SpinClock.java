package org.usfirst.frc253.Auto.commands;

import org.usfirst.frc253.Auto.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinClock extends Command {
	
	public void spinClock() {
		requires(Robot.driveTrain);
		
	}
	
	 // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.spinClock();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}


