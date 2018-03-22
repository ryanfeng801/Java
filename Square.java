package Ren060;

public class Square implements Shape 
{
	private double l;
	public Square(double l1)
	{
		l=l1;
	}
	public double getPerimeter()
	{
		double perimeter;
		perimeter=4*l;
		return perimeter;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		if (Double.doubleToLongBits(l) != Double.doubleToLongBits(other.l))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Square {l=" + l + "}has perimeter:" +getPerimeter();
	}
			
}
