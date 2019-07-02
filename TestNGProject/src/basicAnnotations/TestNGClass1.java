package basicAnnotations;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClass1 {

	
		@Test(dependsOnMethods={"test2","test3"})
		public void test1()
		{
			System.out.println("Testing first testing method");
		}

		@Test(priority=0)
		public void test2()
		{
			
			System.out.println("Testing second testing method");
			throw new SkipException("Testing");
		}

		@Test(priority=1)
		public void test3()
		{
			System.out.println("Testing third testing method");
			Assert.fail("Testing failure");
			
			
		}

	
		@Test
		public void test4()
		{
			System.out.println("Testing forth testing method");
			Assert.assertEquals("Kalyani", "Shirbhate");
		}

}
