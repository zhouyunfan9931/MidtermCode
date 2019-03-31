package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;

public class CuboidTest {

	@Test
	public void Cuboid_test1() {
		Cuboid cuboid = new Cuboid(1,2,3);
		assertTrue(cuboid.volume()==6);
	}
	
	@Test
	public void Cuboid_test2() {
		Cuboid cuboid = new Cuboid(1,2,3);
		assertFalse(cuboid.volume()==8);
	}
	
	@Test
	public void getDepth_test1() {
		Cuboid cuboid = new Cuboid(1,2,3);
		assertTrue(cuboid.getDepth()==3);
	}
	
	@Test
	public void getDepth_test2() {
		Cuboid cuboid = new Cuboid(1,2,3);
		assertFalse(cuboid.getDepth()==5);
	}
	
	
	@Test
	public void setDepth_test1() {
		Cuboid cuboid = new Cuboid(1,2,3);
		int idepth = 5;
		cuboid.setDepth(idepth);
		assertTrue(cuboid.getDepth()==5);
	}
	
	@Test
	public void setDepth_test2() {
		Cuboid cuboid = new Cuboid(1,2,3);
		int idepth = 5;
		cuboid.setDepth(idepth);
		assertFalse(cuboid.getDepth()==6);
	}
	
	@Test
	public void area_test1() {
		Cuboid cuboid = new Cuboid(1,2,3);
		double expectarea = 22;
		double area = cuboid.area();
		assertTrue(expectarea==area);
	}
	
	@Test
	public void area_test2() {
		Cuboid cuboid = new Cuboid(1,2,3);
		double expectarea = 23;
		double area = cuboid.area();
		assertFalse(expectarea==area);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void GetUnsupportException() {
		Cuboid c = new Cuboid(1,2,3);
		c.perimeter();
	}
	
	@Test
	public void compareto_test1() {
		Cuboid cuboid = new Cuboid(1,2,3);
		Cuboid cuboid2 = new Cuboid(1,2,3);
		assertTrue(cuboid.compareTo(cuboid2)==0);
	}
	
	@Test
	public void compareto_test2() {
		Cuboid cuboid = new Cuboid(1,2,3);
		Cuboid cuboid2 = new Cuboid(1,2,4);
		assertTrue(cuboid.compareTo(cuboid2)==1);
	}

	@Test
	public void compareto_test3() {
		Cuboid cuboid = new Cuboid(1,2,3);
		Cuboid cuboid2 = new Cuboid(1,2,2);
		assertTrue(cuboid.compareTo(cuboid2)==-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void GetException1() {
		Cuboid c = new Cuboid(1,2,3);
		c.setDepth(-1);
	}
	
	@Test
	public void SortByArea_test1() {
		Cuboid a = new Cuboid(1,2,3);
		Cuboid arg0 = new Cuboid(1,2,4);
		Cuboid arg1 = new Cuboid(1,2,5);
		ArrayList<Cuboid> al = new ArrayList<Cuboid>();
		al.add(arg0);
		al.add(arg1);
		al.add(a);
		SortByArea s = a.new SortByArea();
		assertTrue((s.compare(arg0, arg1))<0);
		Collections.sort(al, a.new SortByArea());
		
		for(int i=0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
	}
		
	@Test
		public void SortByVolume_test1() {
		Cuboid a = new Cuboid(1,2,3);
		Cuboid arg0 = new Cuboid(1,2,4);
		Cuboid arg1 = new Cuboid(1,2,5);
		ArrayList<Cuboid> al = new ArrayList<Cuboid>();
		al.add(arg0);
		al.add(arg1);
		al.add(a);
		SortByVolume s = a.new SortByVolume();
		assertTrue((s.compare(arg0, arg1))<0);
		Collections.sort(al, a.new SortByVolume());
		
		for(int i=0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
