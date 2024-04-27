package _06_frogger;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogHopDist = 50;
    int frogX = 400;
    int frogY = 575;
    Car car;
    Car cra;
    Car arc;
    Car rac;
    Car crar;
    Car raca;
    Car carc;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car = new Car(800,550,50,20);
    	cra = new Car(800,0,50,1);
    	arc = new Car(50,500,100,35);
    	rac = new Car(100,450,100,35);
    	crar = new Car(300,250,100,35);
    	raca = new Car(200,200,50,30);
    	
    	}
    boolean intersects(Car car) {
    	 if ((frogY > car.getY() && frogY < car.getY()+50) &&
    	                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    }

    @Override
    public void draw() {
    background(0,0,200);
    fill(0,200,0);
    ellipse(frogX,frogY,50,50);
    car.moveLeft();
    cra.moveLeft();
    car.display();
    cra.display();
    arc.moveRight();
    arc.display();
    rac.moveRight();
    rac.display();
    crar.moveLeft();
    raca.moveRight();
    crar.display();
    raca.display();
    if(intersects(car)) {
    	frogX = 400;
    	frogY = 575;
    }
    if(intersects(rac)) {
    	frogX = 400;
    	frogY = 575;
    }
    if(intersects(arc)) {
    	frogX = 400;
    	frogY = 575;
    }
    if(intersects(cra)) {
    	JOptionPane.showMessageDialog(null, "you win!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	exit();
    }
    if(intersects(crar)) {
    	frogX = 400;
    	frogY = 575;
    }
    if(intersects(raca)) {
    	frogX = 400;
    	frogY = 575;
    }


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
    	int speed;
    	Car(int carX, int carY, int carSize,int carSpeed){
    		this.x = carX;
    		this.y = carY;
    		this.size = carSize;
    		this.speed = carSpeed;
    	}
    	void display()
    	{
    	  fill(0,255,0);
    	  rect(x , y,  size, 50);
    	}
    	void moveLeft() {
    		x -= speed;
    		if(x<-size) {
    			x=800;
    		}
    	}
    	void moveRight() {
    		x+= speed;
    		if (x>800) {
    			x = 0;
    		}
    	}
    	int getX() {
    		return x;
    	}
    	int getY() {
    		return y;
    	}
    	int getSize() {
    		return size;
    	}
    	}

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
