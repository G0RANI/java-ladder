package game.ladder;

import game.ladder.domain.*;
import game.ladder.view.InputView;
import game.ladder.view.OutputView;

public class ConsoleMain {

    public static void main(String[] args) {
        Participants participants = InputView.readParticipant();
        Expects expects = InputView.readExpects();
        UserInputs userInputs = new UserInputs(participants, expects);

        LevelGenerator levelGenerator = new LevelGenerator(new RandomStrategy());

        Level level = levelGenerator.generate();

        OutputView.printLevel(level);

        Ladder ladder = new Ladder(userInputs, new LadderLines(HightConverter.convert(level), userInputs.partipantsSize()));

        OutputView.printLadder(ladder);

        GameResultCache gameResultCache = new GameResultCache(ladder);

        Name name;
        while (true) {
            name = InputView.readExpectParticipantName();
            GameResults gameResults = gameResultCache.getGameResults(name);
            OutputView.printGameResults(gameResults);

            if (name.equals(Name.ALL)) {
                break;
            }
        }

    }

}