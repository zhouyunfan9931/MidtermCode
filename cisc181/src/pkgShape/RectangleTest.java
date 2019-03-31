package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void constructtest() {
		Rectangle r = new Rectangle(1, 2);
		int expectlength = 2;
		int length = r.getLength();
		assertEquals(expectlength,length);
	}
	
	@Test
	public void getwidth_test() {
		Rectangle r = new Rectangle(1, 2);
		int expectwidth = 1;
		int width = r.getWidth();
		assertEquals(expectwidth,width);
	}
	
	@Test
	public void setwidth_test() {
		Rectangle r = new Rectangle(1, 2);
		int expectwidth = 3;
		int iwidth = 3;
		r.setWidth(iwidth);
		int width = r.getWidth();
		assertEquals(expectwidth,width);
	}
	
	@Test
	public void setlength_test() {
		Rectangle r = new Rectangle(1, 2);
		int expectlength = 3;
		int ilength = 3;
		r.setLength(ilength);
		int length = r.getLength();
		assertEquals(expectlength,length);
	}

	

	@Test
	public void area_test1() {
		Rectangle r = new Rectangle(1, 2);
		double expectarea = 2;
		double area = r.area();
		assertTrue(expectarea==area);
	}
	
	@Test
	public void area_test2() {
		Rectangle r = new Rectangle(1, 2);
		double expectarea = 3;
		double area = r.area();
		assertFalse(expectarea==area);
	}
	
	@Test
	public void perimeter_test1() {
		Rectangle r = new Rectangle(1,2);
		double expectperimeter = 6;
		double perimeter = r.perimeter();
		assertTrue(expectperimeter==perimeter);
	}
	
	@Test
	public void perimeter_test2() {
		Rectangle r = new Rectangle(1,2);
		double expectperimeter = 5;
		double perimeter = r.perimeter();
		assertFalse(expectperimeter==perimeter);
	}
	
	@Test
	public void compareto_test1() {
		Rectangle r = new Rectangle(1,2);
		Rectangle e = new Rectangle(2,3);
		assertTrue(r.compareTo(e)==-1);
	}
	
	@Test
	public void compareto_test2() {
		Rectangle r = new Rectangle(1,2);
		Rectangle e = new Rectangle(1,1);
		assertTrue(r.compareTo(e)==1);
	}
	
	@Test
	public void compareto_test3() {
		Rectangle r = new Rectangle(1,2);
		Rectangle e = new Rectangle(1,2);
		assertTrue(r.compareTo(e)==0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void GetException1() {
		Rectangle r = new Rectangle(1,2);
		r.setLength(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void GetException2() {
		Rectangle r = new Rectangle(1,2);
		r.setWidth(-1);
	}

}
