/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.nerdherd.lib.drivetrain.teleop.ArcadeDrive;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.SimOI;
import frc.robot.subsystems.Drive;

public class Robot extends TimedRobot {

    public Drive drive;
    public SimOI oi;

    @Override
    public void robotInit() {
        drive = new Drive();
        oi = new SimOI();
        drive.setDefaultCommand(new ArcadeDrive(drive, oi));
    }

    @Override
    public void robotPeriodic() {
        // always run the CommandScheduler during periodic
        CommandScheduler.getInstance().run();
        drive.reportToSmartDashboard();
    }

    
    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
        
    }

    public static Robot win() {
        return new Robot();
    }

}