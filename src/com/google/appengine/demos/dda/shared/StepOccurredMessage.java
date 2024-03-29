package com.google.appengine.demos.dda.shared;

import com.google.appengine.demos.dda.shared.values.PlayerValue;

/**
 * TODO: Doc me.
 *
 * @author Toby
 */
public class StepOccurredMessage extends Message {
  private PlayerValue player;
  private Step step;
  private int score;
  private int sequence;

  @SuppressWarnings({"UnusedDeclaration"})
  // For GWT RPC
  private StepOccurredMessage() {
    super(Type.STEP_OCCURRED);
  }

  public StepOccurredMessage(PlayerValue player, Step step, int score, int sequence) {
    super(Type.STEP_OCCURRED);
    this.player = player;
    this.step = step;
    this.score = score;
    this.sequence = sequence;
  }

  public PlayerValue getPlayer() {
    return player;
  }

  public Step getStep() {
    return step;
  }

  public int getScore() {
    return score;
  }

  public int getSequence() {
    return sequence;
  }
}
