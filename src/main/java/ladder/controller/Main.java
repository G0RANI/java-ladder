package ladder.controller;

import ladder.domain.Ladder;
import ladder.domain.Persons;
import ladder.dto.response.LadderDto;
import ladder.view.ResponseView;

public class Main {

    public static void main(String[] args) {
        Persons persons = ModelMapper.getPersons();
        Ladder ladder = ModelMapper.getLadder(persons.getSize());

        LadderDto ladderDto = new LadderDto(persons, ladder);
        ResponseView.printLadder(ladderDto);
    }
}