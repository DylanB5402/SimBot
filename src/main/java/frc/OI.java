/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc;

import com.nerdherd.lib.oi.DefaultOI;
import com.nerdherd.lib.oi.GameOI;

/**
 * Add your docs here.
 */
public class OI extends DefaultOI {

    public OI() {
        super();
    }

    @Override
    public double getDriveJoyLeftX() {
        return super.driveJoyLeft.getRawAxis(1);
    }

    @Override
    public double getDriveJoyRightY() {
        return super.driveJoyLeft.getRawAxis(0);
    }
}
