import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethTest {

	@Test 
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testadd()
	{
		Meth objAdd=new Meth();
		int expected =6;
		int actual=objAdd.add(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testmult()
	{
		Meth objmult=new Meth();
		int expected =9;
		int actual=objmult.mult(3, 3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testdiv()
	{
		Meth objdiv=new Meth();
		int expected =1;
		int actual=objdiv.div(3, 3);
		assertEquals(expected, actual);
		
	}
}
