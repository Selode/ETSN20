package test;

import static org.junit.Assert.*;

import org.junit.Test;

import trianglepackage.Triangle;

public class BoundryTest {
	
	@Test
	public void TC01(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(0,0,0);


		assertTrue(t.isImpossible());
		
	}
	
	@Test
	public void TC012(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,1);


		assertFalse(t.isImpossible());
		
	}
	@Test
	public void TC02(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(100,100,99);


		assertFalse(t.isEquilateral());
		
	}
	
	@Test
	public void TC022(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(100,100,100);


		assertTrue(t.isEquilateral());
		
	}
	
	@Test
	public void TC03(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(100,98,99);


		assertFalse(t.isIsosceles());
		
	}
	
	@Test
	public void TC032(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(100,99,99);


		assertTrue(t.isIsosceles());
		
	}
	
	@Test
	public void TC04(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,6);


		assertFalse(t.isRightAngled());
		
	}
	
	@Test
	public void TC042(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertTrue(t.isRightAngled());
		
	}
	
	@Test
	public void TC05(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertFalse(t.isScalene());
		
	}
	
	@Test
	public void TC052(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(100,100,50);


		assertFalse(t.isScalene());
		
	}
	
	
	@Test
	public void TC06(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,6);


		assertTrue(t.isScalene());
		
	}
	
	@Test
	public void TC07(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(-1,2,3);


		assertTrue(t.getArea() == -1.0);
		
	}
	
	@Test
	public void TC14(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,1);


		assertTrue(t.getArea() == 0.5);
		
	}
	
	
	@Test
	public void TC16(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,1);


		assertEquals(t.getPerimeter(), 3);
		
	}
	
	@Test
	public void TC17(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(0,0,0);


		assertEquals(t.getPerimeter(), -1);
		
	}
	
	@Test
	public void TC18(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,1);


		assertEquals(t.getSideLengths(), "1,1,1");
		
	}
	
	@Test
	public void TC19(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,1);


		assertEquals(t.classify(), "equilateral");
		
	}
	
	@Test
	public void TC20(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,1,2);


		assertEquals(t.classify(), "isosceles");
		
	}
	
	@Test
	public void TC21(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertEquals(t.classify(), "right-angled");
		
	}
	
	@Test
	public void TC22(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,2,3);


		assertEquals(t.classify(), "scalene");
		
	}
	
	@Test
	public void TC23(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(10,1,1);


		assertEquals(t.classify(), "impossible");
		
	}
	
	

}
