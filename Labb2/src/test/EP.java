package test;

import static org.junit.Assert.*;

import org.junit.Test;

import trianglepackage.Triangle;



public class EP {
	
	@Test
	public void TC01(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3, 4, 5);


		assertEquals(t.getSideLengths(), "3,4,5");
		
	}
	
	@Test
	public void TC02(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(-1, -2, -3);
		String[] numbers = t.getSideLengths().split(",");
		for(int i = 0; i < numbers.length; i++){
			assertTrue(Integer.parseInt(numbers[i])<=0);
		}
	}
	
	@Test
	public void TC03(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1, 1, 1);


		assertTrue(t.isEquilateral());
		
	}
	
	@Test
	public void TC04(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertFalse(t.isEquilateral());
		
	}
	
	@Test
	public void TC05(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1, 1, 1);


		assertTrue(t.isIsosceles());
		
	}
	
	@Test
	public void TC06(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertFalse(t.isIsosceles());
		
	}
	
	@Test
	public void TC07(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertTrue(t.isRightAngled());
		
	}
	
	@Test
	public void TC08(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1, 1, 1);


		assertFalse(t.isRightAngled());
		
	}
	
	@Test
	public void TC09(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1,2,3);


		assertTrue(t.isScalene());
		
	}
	
	@Test
	public void TC10(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(1, 1, 1);


		assertFalse(t.isScalene());
		
	}
	
	@Test
	public void TC11(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertFalse(t.isScalene());
		
	}
	
	@Test
	public void TC12(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(10,1,1);


		assertTrue(t.isImpossible());
		
	}
	
	@Test
	public void TC13(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertFalse(t.isImpossible());
		
	}


	@Test
	public void TC14(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertTrue(t.getArea() == 6.0);
		
	}
	
	@Test
	public void TC15(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(10,1,1);


		assertTrue(t.getArea() == -1.0);
		
	}
	
	@Test
	public void TC16(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3,4,5);


		assertEquals(t.getPerimeter(), 12);
		
	}
	
	@Test
	public void TC17(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(-1,-2,-3);


		assertEquals(t.getPerimeter(), -1);
		
	}
	
	@Test
	public void TC18(){
		Triangle t = new Triangle(3,4,5); 
		t.setSideLengths(3, 4, 5);


		assertEquals(t.getSideLengths(), "3,4,5");
		
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
