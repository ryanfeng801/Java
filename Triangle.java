package Ren060;

public class Triangle implements Shape 
{
    private double a,b,c;
    public  Triangle (double a1,double b1, double c1)    
    {	
        a=a1;
        b=b1;
        c=c1;	
    }
	public double getPerimeter()
	{
		double perimeter;
		perimeter=a+b+c;
		return perimeter;			
	}

	@Override
	public String toString() 
	{
		return "Triangle {a=" + a + ", b=" + b + ", c=" + c + "}has perimeter:" +getPerimeter();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}		

}
