/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class Trajectory{
        public static final String three    = "output/ThreeBall.wpilib.json";
        public static final String two      = "output/TwoBall.wpilib.json";
        public static final String OneMeter = "output/OneMeter.wpilib.json";
    }
    public static class Motor{
        public static final int leftMaster    = 19;
        public static final int leftFollewer  = 21;
        public static final int rightMaster   = 18;
        public static final int rightFollower = 20;
        public static final double distancePerPulse = 0.1524 * Math.PI / 2048 / 9.7;
        public static final double wheelPitch = 0.7407;

        public static final boolean isRightMotorInvert = true;
        public static final boolean isLeftMotorInvert = false;
        public static final boolean isRightPhaseInvert = true;
        public static final boolean isLeftPhaseInvert = false;
    }
    public static class PowCon{
        public static final int flywheel = 4;
        public static final int conveyor = 1;
        public static final int aimer = 8;
        // public static final int intakearmer = 0;
        public static final int wideright = 2;
        public static final int wideleft = 5;
        public static final double flywheel_kP = 0.01; //0.1
        public static final double flywheel_kF = 0.0506;
        public static final int tower = 6;
    }
    public static class Pne{
        public static final int Solenoid = 0;
        public static final int ArmDS_1 = 1;
        public static final int ArmDS_2 = 2;
    }
    public static class Button{
        //Driverstation
        /**____________________
         * |                  |
         * |    1 2  3  4     |              
         * |                  |                      
         * |    5 6  7  8     |
         * |                  |
         * ____________________
         */
        public static final int flySpin     = 1;
        public static final int conveyor    = 2;
        public static final int turretleft  = 3;
        public static final int turretright = 4;
        public static final int armOut      = 5;
        public static final int armIn       = 6;
        public static final int intake      = 7;
        public static final int autoAim     = 8;

        //Joystick
        //trigger be used to curvature drive
        public static final int towerZero   = 2;
    }
}
