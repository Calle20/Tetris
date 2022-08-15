package Infrastructure;

import game.Block;
import game.Game;
import io.DataHandler;
import ui.GUI;

public class Main {

	public static void main(String[] args) {
		
		DataHandler.Load();
		Game.currentBlock=new Block();
		Game.blocks.add(Game.currentBlock);
		Game.nextBlock=new Block();
		
		
		GUI g= new GUI();
		g.create();
		
		startLoop();
	}
	
	public static void startLoop() {
		GameLoop loop = new GameLoop();
		loop.start();
	}

}