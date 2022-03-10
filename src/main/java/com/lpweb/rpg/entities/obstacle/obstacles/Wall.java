package com.lpweb.rpg.entities.obstacle.obstacles;

import com.lpweb.rpg.entities.obstacle.Obstacle;

/**
 * Walls can not be detroyed and block the player.
 */
public class Wall extends Obstacle {
    private static final int LIFE_POINTS = -1; // Undestructile
    private static final int DAMAGES = 0;
    private static final int KILL_REWARD = 0;

    public Wall() {
        super(LIFE_POINTS, DAMAGES, KILL_REWARD);
    }

    @Override
    public String mapRepresentation() {
        return "##";
    }

    // Can't add lifepoints to Walls.
    @Override
    public int addLifePoints(int points) {
        return 0;
    }

    // Can't remove lifepoints to Walls.
    @Override
    public int removeLifePoints(int points) {
        return 0;
    }
}
