/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.nerdherd.lib.drivetrain.experimental.Drivetrain;
import com.nerdherd.lib.motor.motorcontrollers.NerdyTalon;
import com.nerdherd.lib.motor.motorcontrollers.CANMotorController;

public class Drive extends Drivetrain {
  /**
   * Creates a new Drive.
   */
  public Drive() {
    super(new NerdyTalon(0), new NerdyTalon(1), new CANMotorController[]{}, new CANMotorController[]{}, false, true, 0.5);
    super.m_leftMaster = (NerdyTalon) super.m_leftMaster;
    super.configSensorPhase(false, false);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    super.reportToSmartDashboard();
  }
}
