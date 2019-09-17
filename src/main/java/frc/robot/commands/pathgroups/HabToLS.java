/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.pathgroups;

import frc.robot.commands.FollowPath;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class HabToLS extends CommandGroup {
  /**
   * Add your docs here.
   */
  public HabToLS() {
    addSequential(new FollowPath("HtoCR-1"));
    addSequential(new FollowPath("CR-1toLS", new char[] {'r'}));
  }
}
