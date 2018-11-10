
public class Rectangle extends Shapes {
	
	double width;
	double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width*2+height*2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
