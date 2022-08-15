package game;

import java.util.concurrent.ThreadLocalRandom;

public enum BlockType {
	I,O,T,J,L,Z,S;
	
	public static BlockType random() {
		return values()[ThreadLocalRandom.current().nextInt(0,values().length)];
	}
}