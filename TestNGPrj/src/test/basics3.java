package test;

import org.testng.annotations.Test;

public class basics3 {
	@Test(groups= {"smoke"})
	public void WebDebitCardMethod1()
	{
		System.out.println("WebDCMethod1 ");
	}
	
	@Test
	public void WebDebitCardMethod2()
	{
		System.out.println("WebDCMethod2 ");
	}
	
}
