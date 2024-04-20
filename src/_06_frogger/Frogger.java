package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogHopDist = 50;
    int frogX = 400;
    int frogY = 575;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    background(0,0,200);
    fill(0,200,0);
    ellipse(frogX,frogY,50,50);
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                frogY-= frogHopDist;
            }
            else if(keyCode == DOWN)
            {
                frogY+= frogHopDist;
            }
            else if(keyCode == RIGHT)
            {
                frogX+=frogHopDist;
            }
            else if(keyCode == LEFT)
            {
                frogX-= frogHopDist;
            }
            bounds();
        }
    }
    public void bounds() {
    	if(frogY<0) {
    		frogY = 25;
    		
    	}
    	if(frogY>600) {
    		frogY = 575;
    	}
    	if(frogX<0) {
    		frogX = 0;
    	}
    	if(frogX>800) {
    		frogX = 800;
    	}
    }
    public class Car {
    	int x;
    	int y;
    	int size;
    	Car(int carX, int carY, int carSize){
    		carX = this.x;
    		carY = this.y;
    		carSize = this.size;
    	}
    	void display()
    	{
    	  fill(0,255,0);
    	  rect(x , y,  size, 50);
    	}
    	}

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
