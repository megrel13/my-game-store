package ru.itsjava.services;

import ru.itsjava.domain.Game;

public interface GameService {
    Game buyGamesByName (String name);

    void sellGames (Game games);

    boolean hasGames (String name);

    void printGames();
}
