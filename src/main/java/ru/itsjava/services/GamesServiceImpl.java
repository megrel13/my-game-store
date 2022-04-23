package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Game;

import java.util.List;

@RequiredArgsConstructor
public class GamesServiceImpl implements GameService {
    private final List<Game> gamesFromStore;


    @Override
    public Game buyGamesByName (String name) {
        Game resGames = null;
        for (Game games : gamesFromStore){
            if (games.getName().equals(name)){
                resGames = games;
            }
        }
        if (resGames != null) {
            gamesFromStore.remove(resGames);
            return resGames;
        }
        return null;
    }

    @Override
    public void sellGames(Game games) {
        gamesFromStore.add(games);
    }

    @Override
    public boolean hasGames(String name) {
        for (Game games : gamesFromStore){
            if (games.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void printGames() {
        for (Game games : gamesFromStore){
            System.out.println(games.getName() + " " + games.getAuthor());
        }
    }
}
