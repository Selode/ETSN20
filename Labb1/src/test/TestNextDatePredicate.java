package test;

import static org.junit.Assert.*;

import org.junit.Test;

import wb.NextDate;

public class TestNextDatePredicate {
	
	@Test
	public void TC01(){
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(0, 1, 2020));
	}
	
	@Test
	public void TC02(){
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(1, 0, 2020));
	}
	
	@Test
	public void TC03(){
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(1, 1, 0));
	}
	@Test
	public void TC04(){
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(13, 1, 2020));
	}
	
	@Test
	public void TC05(){
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(1, 1, 2022));
	}



	@Test
	public void TC1() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("invalid Input Date", nx.run(0, 0, 0));
	}

	@Test
	public void TC2() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("3/4/1859", nx.run(3, 3, 1859));
	}

	@Test
	public void TC3() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("4/1/1859", nx.run(3, 31, 1859));
	}

	@Test
	public void TC4() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("4/30/2020", nx.run(4, 29, 2020));
	}

	@Test
	public void TC5() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("5/1/2020", nx.run(4, 30, 2020));
	}

	@Test
	public void TC6() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("Invalid Input Date", nx.run(4, 31, 2020));
	}

	@Test
	public void TC7() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("12/32/2020", nx.run(12, 31, 2020));
	}

	/**
	 * Black box borde ta detta, f�r nu testar vi day = 32. That is crazy
	 */
	@Test
	public void TC8() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("Invalid Next Year", nx.run(12, 32, 2021));
	}

	/**
	 * Black box borde ta detta, f�r nu testar vi day = 32. That is crazy
	 */
	@Test
	public void TC9() {
		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("1/1/2021", nx.run(12, 32, 2020));
	}

	@Test
	public void TC10() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("2/28/2020", nx.run(2, 27, 2020));
	}

	@Test
	public void TC11() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("2/29/2020", nx.run(2, 28, 2020));
	}

	@Test
	public void TC12() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("3/1/2018", nx.run(2, 28, 2018));
	}

	@Test
	public void TC13() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("3/1/2020", nx.run(2, 29, 2020));
	}

	@Test
	public void TC14() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("Invalid Input Date", nx.run(2, 29, 2018));
	}

	@Test
	public void TC15() {

		NextDate nx = new NextDate(0, 0, 0);

		assertEquals("Invalid Input Date", nx.run(2, 30, 2018));
	}

}
