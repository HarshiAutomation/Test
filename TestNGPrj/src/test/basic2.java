package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic2 
{

	@Test(groups= {"smoke"})
	public void MobCreditCardMethod1()
	{
		System.out.println("MobCCMethod1");
	}
	
	@Test
	public void MobCreditCardMethod2()
	{
		System.out.println("MobCCMethod2");
	}
	@AfterTest
	public void AfterTestm1()
	{
		
		System.out.println("AfterTest1 ");
	}
	@BeforeClass
	public void BeforeClassm2()
	{
		System.out.println("@BeforeClassm2 ");
	}
	@AfterClass
	public void AfterClassm1 ()
	{
		System.out.println("@After Class m2 ");
	}
}
