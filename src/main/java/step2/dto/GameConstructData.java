package step2.dto;

import step2.domain.ladder.LadderHeight;
import step2.domain.participant.Participants;

public class GameConstructData {

	private final Participants participants;
	private final LadderHeight ladderHeight;

	public GameConstructData(Participants participants, LadderHeight ladderHeight) {
		this.participants = participants;
		this.ladderHeight = ladderHeight;
	}

	public Participants getParticipants() {
		return participants;
	}

	public LadderHeight getLadderHeight() {
		return ladderHeight;
	}
}