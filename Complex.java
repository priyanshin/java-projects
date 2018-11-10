
public class Complex {
	// Create a class named Complex which implements Complex numbers.
	//
	// For a refresher:
	// https://www.khanacademy.org/math/algebra2/introduction-to-complex-numbers-algebra-2/adding-and-subtracting-complex-numbers-algebra-2/v/adding-complex-numbers
	//
	// Your class should have the
	// following members:
	// double imaginaryPart
	// double realPart
	//
	// Your class should have the following methods:
	// Complex add(Complex arg1, Complex arg2);
	// Complex subtract(Complex arg1, Complex arg2);
	// Complex multiply(Complex arg1, Complex arg2);
	// String toString()
	//
	// The toString method should produce a string like "20 + 3i" or generally;
	// "a + bi" format. Extra points if you avoid printing the real part when it
	// is 0;
	// or printing the imaginary part when it is 0.

	double imaginaryPart;
	double realPart;

	Complex(double realPartParam, double imaginaryPartParam) {
		realPart = realPartParam;
		imaginaryPart = imaginaryPartParam;
	}
	/**
	 * 
	 * @param arg1 first complex number without i
	 * @param arg2 second complex number without i
	 * @return sum of the complex numbers w/o i
	 */
	Complex add(Complex arg1, Complex arg2) {
		double r1 = arg1.realPart;
		double i1 = arg1.imaginaryPart;
		double r2 = arg2.realPart;
		double i2 = arg2.imaginaryPart;
		double totalR = r1 + r2;
		double totalI = i1 + i2;
		Complex sumC = new Complex(totalR, totalI);
		return sumC;
	}
	/**
	 * 
	 * @param arg1 first complex number without i
	 * @param arg2 second complex number without i
	 * @return difference of the complex numbers w/o i
	 */
	Complex subtract(Complex arg1, Complex arg2) {
		double r1 = arg1.realPart;
		double i1 = arg1.imaginaryPart;
		double r2 = arg2.realPart;
		double i2 = arg2.imaginaryPart;
		double totalR = r1 - r2;
		double totalI = i1 - i2;
		Complex differenceC = new Complex(totalR, totalI);
		return differenceC;
	}
	/**
	 * 
	 * @param arg1 first complex number without i
	 * @param arg2 second complex number without i
	 * @return product of the complex numbers w/o i
	 */
	Complex multiply(Complex arg1, Complex arg2) {
		double r1 = arg1.realPart;
		double i1 = arg1.imaginaryPart;
		double r2 = arg2.realPart;
		double i2 = arg2.imaginaryPart;
		// (r1+i1)(r2+i2)
		// r1r2+r1i2+i1r2+i1i2
		double totalr1 = r1 * r2;// real part
		double totalI = r1 * i2 + i1 * r2;// total imaginary
		double totalr2 = i1 * 12 * (-1);// imaginary==> becomes real because
										// (i)^2=-1
		double totalR = totalr1 + totalr2;
		Complex productC = new Complex(totalR, totalI);
		return productC;
	}
	/**
	 * @return the function result in a+bi or a-bi form
	 */
	public String toString() {
		String full;
		if (imaginaryPart == 0) {
			full = realPart + "";
		} 
		else if (realPart == 0) {
			full = imaginaryPart + "i";
		} 
		else if (imaginaryPart == 0 && realPart == 0) {
			full = "0";
		}
		else if (imaginaryPart<0){
			imaginaryPart= -imaginaryPart;
			full = realPart + " - " + imaginaryPart + "i";//to make it neater (a-bi format)
			}
		else {
			full = realPart + " + " + imaginaryPart + "i";
		}
		return full;
	}
	}
