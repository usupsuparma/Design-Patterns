<?php


class Game
{
    private $level;

    private $arena;

    private $enemy;

    /**
     * Game constructor.
     * @param $level
     * @param $arena
     */
    public function __construct(GameFactory $gameFactory)
    {
        $this->level = $gameFactory->createLevel();
        $this->arena = $gameFactory->createArena();
        $this->enemy = $gameFactory->createEnemy();
    }

    public function start() {
        $this->level->start();
        $this->arena->start();
        $this->enemy->start();
    }


}