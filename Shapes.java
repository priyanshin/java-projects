
public abstract class Shapes {
 static int numberOfSides;

public Shapes(int numberOfSides){
	this.numberOfSides= numberOfSides;
	//Shapes numSides= new Shapes ();
	}
public int getNumSides(){
	return numberOfSides;
}

public void setNumSides(int numberOfSides){
	this.numberOfSides=numberOfSides;
	
}
public abstract double getPerimeter();

public abstract double getArea();


}
