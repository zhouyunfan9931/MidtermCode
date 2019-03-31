package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	private int iWidth;
	private int iLength;
	public Rectangle(int iwidth , int ilength) {
		this.iWidth = iwidth;
		this.iLength = ilength;
	}
	public int getWidth(){
		return iWidth;
	}
	public void setWidth(int iwidth) {
		try{
			if (iwidth<=0) {
				throw new IllegalArgumentException();
			}
		}catch(NumberFormatException e) {
			throw e;
		}finally {
			iWidth = iwidth;
		}
	}
	public int getLength(){
		return iLength;
	}
	public void setLength(int ilength){
		try{
			if (ilength<=0) {
				throw new IllegalArgumentException();
			}

		}finally {
			iLength = ilength;
		}
	}
	
	@Override
	public double area() {
		double area;
		area = this.getLength() * this.getWidth();
		return area;
	};
	
	@Override
	public double perimeter() {
		double perimeter;
		perimeter = (this.getLength() + this.getWidth()) * 2 ;
		return perimeter;
	}
	
	
	@Override
	public int compareTo (Object r) {
		if(this.area()>((Rectangle)r).area()) {
			return 1;
		}else if(this.area()<((Rectangle)r).area()) {
			return -1;
		}else {
			return 0;
		}
	}

}
