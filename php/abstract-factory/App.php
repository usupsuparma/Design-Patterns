<?php

// cara biasa
//$gameEasy = new Game(new LevelEasy(), new ArenaEasy());
//$gameEasy->start();
//
//$gameMedium = new Game(new LevelMedium(), new ArenaMedium());
//$gameMedium->start();
//
//$gameHard = new Game(new LevelHard(), new ArenaHard());
//$gameHard->start();

$gameEasy = new Game(new GameFactoryEasy());
$gameEasy->start();

$gameMedium = new Game(new GameFactoryMedium());
$gameMedium->start();

$gameHard = new Game(new GameFactoryHard());
$gameHard->start();