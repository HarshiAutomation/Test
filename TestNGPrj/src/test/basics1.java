package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics1 {
	
		@BeforeTest
		public void BeforeTestm1()
		{
			System.out.println("BeforeTestm1 ");
		}
		@Test(groups= {"smoke"})
		public void WebCreditCardMethod1()
		{
			System.out.println("WebCCMethod1 ");
		}
		
		@Test
		public void WebCreditCardMethod2()
		{
			System.out.println("WebCCMethod2 ");
		}
		@BeforeClass
		public void BeforeClass()
		{
			System.out.println("@BeforeClassm1 ");
		}
		
		@BeforeMethod
		public void BeforeMethodm1()
		{
			System.out.println("@BeforeMethodm1 ");
		}
	
		@AfterMethod
		public void AfterMethodm1()
		{
			System.out.println("MethodAm1 ");
		}
	
		
		
		
		
}
