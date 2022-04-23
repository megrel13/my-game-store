package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Game;

import java.util.*;

public class GameServiceImplTest {
    List<Game> games = new ArrayList<>();


    @DisplayName("Проверка метода buyGamesByName")
    @Test
    public void checkBuyGamesByNameMethod() {

        Game expectedGames = new Game("Warcraft", "Blizzard");
        games.add(expectedGames);

        GamesServiceImpl service = new GamesServiceImpl(games);
        Assertions.assertEquals(expectedGames, service.buyGamesByName("Warcraft"));
    }

    @DisplayName("Проверка метода sellGames")
    @Test
    public void checkSellGamesMethod() {

        Game expectedGames1 = new Game("Warcraft", "Blizzard");
        Game expectedGames2 = new Game("Battlefield", "EA");
        games.add(expectedGames1);
        games.add(expectedGames2);

        Assertions.assertEquals(expectedGames1, games.get(0));
        Assertions.assertEquals(expectedGames2, games.get(1));
    }

    @DisplayName("Проверка метода hasGames")
    @Test
    public void checkHasGamesMethod() {

        Game expectedGames = new Game("Warcraft", "Blizzard");
        games.add(expectedGames);

        Assertions.assertTrue(games.contains(expectedGames));
    }

    }
