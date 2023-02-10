package com.josh.bracket.tournament;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TournamentRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    TournamentRepository tournamentRepository;

    @Test
    void testAddTournament() {

        Tournament tournament = new Tournament();
        tournament.setCode("WC2022");
        tournament.setName("World Cup");
        tournament.setYear(2022);
        Tournament tournamentRet = tournamentRepository.save(tournament);
        
        Tournament tournamentDb = entityManager.find(Tournament.class,"WC2022");
        assertEquals(tournamentDb.getCode(), tournament.getCode());
        assertEquals(tournamentDb.getName(), tournament.getName());

    }

}