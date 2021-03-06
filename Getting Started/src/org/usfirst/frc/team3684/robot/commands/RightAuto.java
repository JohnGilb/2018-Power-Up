package org.usfirst.frc.team3684.robot.commands;

import org.usfirst.frc.team3684.robot.*;
import org.usfirst.frc.team3684.robot.commands.LeftAuto.LeftAutoKind;
import org.usfirst.frc.team3684.robot.subsystems.FlipUp;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * 
 */
public class RightAuto extends CommandGroup {

	
	public enum RightAutoKind {
		placeOnRightScale,
		placeOnRightSwitch,
		driveForward
	}
	
	public RightAutoKind autoKind;
    public RightAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.RightAutoFinished = false;
    	if (Robot.switchselected) {
    		if (Robot.ourswitchright) {
    			autoKind = RightAutoKind.placeOnRightSwitch;
    			//if we are on the right, prefer the switch, and the switch is on the right, place a block on the right switch.
    		} else {
    			if (Robot.scaleright) {
    				autoKind = RightAutoKind.placeOnRightScale;
    				//if we are on the right, prefer the switch, the switch is on the left, and the scale is on the right, place a block on the right scale.
    			} else { 
    				autoKind = RightAutoKind.driveForward;
    				//if we are on the right, prefer the switch, the switch is on the left, and the scale is on the left, drive forward.
    			}
    		} 
    	} else { 
    		if (Robot.scaleright) {
    			autoKind = RightAutoKind.placeOnRightScale;
    			//If we are on the right, prefer the scale, and the scale is on the right, place a block on the right scale.
    		}else {
    			if (Robot.ourswitchright) {
    				autoKind = RightAutoKind.placeOnRightSwitch;
    				//if we are on the right, prefer the scale, the scale is on the left, and the switch is on the right, place a block on the right switch.
    			}else {
    				autoKind = RightAutoKind.driveForward;
    				//if we are on the right, prefer the scale, the scale is on the left, and the switch is on the left, drive forward.
    			}
    		}
    	}
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch (autoKind) {
    	case placeOnRightScale:
    		RightScaleAuto ScaleAuto = new RightScaleAuto();
    		ScaleAuto.start();
    		/*
    		addSequential(new DriveForward(1));
    		addParallel (new AutoLiftFlip(true));
    		addSequential(new AutoLift(.75, 1000));
    		addSequential(new AutoLiftFlip(false));
    		addSequential(new DriveForward(7));
    		addSequential(new AutoLift(.75, 1000));
    		addSequential(new Turn90Left());
    		addSequential(new ClawOutput());
    		Timer.delay(1);
    		Robot.clawRollers.stop();
    		Robot.RightAutoFinished = true;
    		
    		Robot.driveTrain.setMotors(.5,.5);
        	FlipUp.flipMotor.set(.1);
        	Timer.delay(1);
        	Robot.driveTrain.setMotors(0, 0);
        	Robot.forkLift.setMotors(.5,.5);
        	Timer.delay(1);
        	Robot.forkLift.setMotors(0, 0);
        	FlipUp.flipMotor.set(-.10);
        	Timer.delay(1);
        	FlipUp.flipMotor.set(0);
    		Robot.driveTrain.setMotors(.5, .5);
    		//start claw motors, move forward 25 feet, move lift up
    		Timer.delay(6);
    		Robot.forkLift.setMotors(.5, .5);
    		//stop lift
    		Timer.delay(1);
    		Robot.driveTrain.setMotors(.5, -.5);
    		Timer.delay(1);
    		Robot.forkLift.setMotors(0, 0);
    		Timer.delay(.525);
    		Robot.driveTrain.setMotors(0, 0);
    		new ClawOutput();
    		//stop moving and shoot a box
    		Timer.delay(1);
    		Robot.clawRollers.stop();
    		Timer.delay(30);
    		//stop the lift moving down
    		break;
    		*/
    	case placeOnRightSwitch:
    		RightSwitchAuto SwitchAuto = new RightSwitchAuto();
    		SwitchAuto.start();
    		/*
    		addSequential(new DriveForward(1));
    		addParallel (new AutoLiftFlip(true));
    		addSequential(new AutoLift(.75, 1000));
    		addSequential(new AutoLiftFlip(false));
    		addSequential(new turn90right());
    		addSequential(new DriveForward(1));
    		addSequential(new Turn90Left());
    		addParallel(new AutoLift(.75, 1000));
    		addSequential(new DriveForward(2));
    		addParallel(new AutoLift(.05, 2000));
    		addSequential(new ClawOutput());
    		Timer.delay(1);
    		Robot.clawRollers.stop();
    		Robot.RightAutoFinished = true;
    		
    		
    		Robot.driveTrain.setMotors(.5,.5);
        	FlipUp.flipMotor.set(.1);
        	Timer.delay(1);
        	Robot.driveTrain.setMotors(0, 0);
        	Robot.forkLift.setMotors(.5,.5);
        	Timer.delay(1);
        	Robot.forkLift.setMotors(0, 0);
        	FlipUp.flipMotor.set(-.10);
        	Timer.delay(1);
        	FlipUp.flipMotor.set(0);
        	Robot.driveTrain.setMotors(.5, -.5);
    		//turn right
    		Timer.delay(1);
    		Robot.driveTrain.setMotors(.5, .5);
    		Robot.forkLift.setMotors(.1, .1);
    		Timer.delay(1);
    		Robot.driveTrain.setMotors(.5, -.5);
    		//turn left
    		Timer.delay(1);
    		Robot.forkLift.setMotors(0, 0);
    		Timer.delay(.525);
    		Robot.driveTrain.setMotors(.5, .5);
    		//drive forward, stop the lift motors
    		Timer.delay(2);
    		Robot.driveTrain.setMotors(0, 0);
    		new ClawOutput();
    		//stop turning, shoot a box
    		Timer.delay(1);
    		Robot.clawRollers.stop();
    		Timer.delay(30);
    		break;
    		*/
    	case driveForward:
    		Robot.driveTrain.setMotors(.5,.5);
        	FlipUp.flipMotor.set(.1);
        	Timer.delay(1);
        	Robot.driveTrain.setMotors(0, 0);
        	Robot.forkLift.setMotors(.5,.5);
        	Timer.delay(1);
        	Robot.forkLift.setMotors(0, 0);
        	FlipUp.flipMotor.set(-.10);
        	Timer.delay(1);
        	FlipUp.flipMotor.set(0);
    		Robot.driveTrain.setMotors(.5, .5);
    		//drive forward slowly
    		Timer.delay(4);
    		Robot.driveTrain.setMotors(0, 0);
    		Robot.RightAutoFinished = true;
    		//stop
    	default:
    		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.RightAutoFinished)
        return true;
    	else {
    		return false;
    	}
    }
    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
