package Ren060;

public class Rectangle implements Shape
{
	
	private double w,l;
	
	public Rectangle(double w1,double l1)
	{
		w=w1;
		l=l1;		
	}

	public double getPerimeter()
	{
		double perimeter;
		perimeter=(w+l)*2;
		return perimeter;
	}
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(w);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		if (Double.doubleToLongBits(w) != Double.doubleToLongBits(other.w))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangle {w=" + w + ", l=" + l + "}has perimeter: "+getPerimeter();
	}
	
}