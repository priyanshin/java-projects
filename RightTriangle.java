
public class RightTriangle extends Shapes {
	double width;
	double height;
	double hypotenuse;

	public RightTriangle(double width, double height, double hypotenuse) {
		super(3);
		this.width=width;
		this.height= height;
		this.hypotenuse=hypotenuse;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+hypotenuse;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}

}
