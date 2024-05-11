package _99_extra._04_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World gwd = new World();
	gwd.show();
	Location locA = new Location(1,1);
	Bug gub = new Bug();
	gwd.add(locA, gub);
	Random ran = new Random();
	int xRan =ran.nextInt(10);
	int yRan = ran.nextInt(10);
	Location locB = new Location(xRan,yRan);
	Bug goob = new Bug();
	goob.setColor(Color.blue);
	goob.turn();
	goob.turn();
	gwd.add(locB, goob);
	Location fLocA = new Location(xRan,yRan-1);
	Flower flrL = new Flower();
	gwd.add(fLocA, flrL);
	Location fLocB = new Location(xRan, yRan+1);
	Flower flrR = new Flower();
	gwd.add(fLocB, flrR);
	for(int i = 0;i<10;i++) {
		for(int j = 0; j<10;j++) {
			Location loc = new Location(i,j);
			Flower flr = new Flower();
			gwd.add(loc, flr);
			if (i%2 == 0) {
				flr.setColor(Color.white);
			}
			else {
				flr.setColor(Color.red);
			}
		}
	}
	for(int i = 0;i>6;i++) {
		for(int j = 0;j<6; j++) {
			
		}
	}
	
}
}
