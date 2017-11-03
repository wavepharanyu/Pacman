package com.wave.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class Pacman {
	private Vector2 position;
    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
	 
	public Pacman(int x, int y) {
        position = new Vector2(x,y);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public void move(int dir) { 
    	position.x += 10 * DIR_OFFSETS[dir][0];
        position.y += 10 * DIR_OFFSETS[dir][1];
    }
}
