<?php


interface GameFactory
{
    function createLevel(): Level;
    function createArena(): Arena;
    function createEnemy(): Enemy;
}

class GameFactoryEasy implements GameFactory {
    function createArena(): Arena
    {
        return new ArenaEasy();
    }

    function createLevel(): Level
    {
        return new LevelEasy();
    }

    function createEnemy(): Enemy
    {
        return  new EnemyEasy();
    }
}

class GameFactoryMedium implements GameFactory {
    function createArena(): Arena
    {
        return new ArenaMedium();
    }

    function createLevel(): Level
    {
        return new LevelMedium();
    }

    function createEnemy(): Enemy
    {
        return new EnemyMedium();
    }


}

class GameFactoryHard implements GameFactory {
    function createArena(): Arena
    {
        return new ArenaHard();
    }

    function createLevel(): Level
    {
        return new LevelHard();
    }

    function createEnemy(): Enemy
    {
       return new EnemyHard();
    }


}