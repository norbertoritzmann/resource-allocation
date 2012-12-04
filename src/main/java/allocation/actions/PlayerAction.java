package allocation.actions;

import allocation.Agent;

abstract class PlayerAction extends TimestampedAction {

	Agent player;

	PlayerAction() {
		super();
	}

	PlayerAction(int t, Agent player) {
		super(t);
		this.player = player;
	}

	public Agent getPlayer() {
		return player;
	}

	public void setPlayer(Agent player) {
		this.player = player;
	}

}
