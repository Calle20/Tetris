package game;

import java.util.ArrayList;

public class Game {
	
	public static int score, highscore, scoreToAdd=0, sleeptime=1000, pointsAdded=0;
	public static boolean spanNewBlock, speedup=false;
	
	public static ArrayList<Block> blocks=new ArrayList<Block>();
	public static Block currentBlock, nextBlock;
	
	public static int [][] map=new int[10][18];
	
	public static GameState gamestate= GameState.start;
	public static void clear() {
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				map[x][y] = 0;
			}
		}
		score = 0;
		sleeptime=1000;
	}
}