/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.input;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class ManualMode extends InstantCommand {
  
  private boolean manual;
  
  /**
   * calls oi.setManualMode(manual)
   */
  public ManualMode(boolean manual) {
    super();
    this.manual = manual;
  }
  
  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.oi.setManualMode(manual);
  }
  
}
