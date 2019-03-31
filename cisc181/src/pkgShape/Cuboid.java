package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	public Cuboid(int iwidth, int ilength , int idepth) {
		super(iwidth, ilength);
		this.iDepth = idepth;
	}
	public int getDepth(){
		return iDepth;
	}
	public void setDepth(int idepth) {
		try{
			if (idepth<=0) {
				throw new IllegalArgumentException();
			}

		}finally {
			iDepth = idepth;
		}
	}
	
	public double volume() {
		double volume;
		volume = super.area() * this.iDepth;
		return volume;
	}
	
	@Override
	public double area() {
		double area;
		area = 2*(this.getLength() * this.getWidth() + this.getLength() * this.getDepth() + this.getWidth() * this.getDepth());
		return area;
	};
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo (Object c) {
		if(this.area()>((Cuboid)c).area()) {
			return -1;
		}else if(this.area()<((Cuboid)c).area()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public class SortByArea implements Comparator<Cuboid> {
		SortByArea(){ }
		
		@Override
		public int compare(Cuboid arg0, Cuboid arg1) {
			return (int) (arg0.area()-arg1.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		SortByVolume(){}
		
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			return (int)(o1.volume() - o2.volume());
		}
	}
}


