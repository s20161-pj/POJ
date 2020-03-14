
public class Triangle {
	double a;
	double b;
	double c;
	private double perimeter;
	private double h;

	public void setPerimeter() {
		this.perimeter = (1 / 2) * (this.a + this.b + this.c);
	}

	public double getPermiter() {
		return this.perimeter;
	}

	public void seth() {
		this.h = Math.sqrt(c * c - ((1 / 2) * a * (1 / 2) * a));
	}

	public double geth() {
		return this.h;
	}

	double area() {
		this.seth();
		if (this.isEquilateral()) {
			return (this.a * this.a * Math.sqrt(3)) / 4;
		}
		if (this.isScalene()) {
			return Math.sqrt(
					this.perimeter * (this.perimeter - this.a) * (this.perimeter - this.b) * (this.perimeter - this.c));
		}
		if (this.isIsosceles()) {
			return (1 / 2) * this.c * this.h;
		}

		return -1;
	}

	boolean isEquilateral() {
		return this.a == this.b && this.b == this.c && this.a == this.c;
	}

	boolean isIsosceles() {
		return this.a == this.b && this.a != this.c && this.b != this.c;
	}

	boolean isScalene() {
		return this.a != this.b && this.b != this.c && this.a != this.c;
	}
}
