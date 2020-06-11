package mavenproect1;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.POMActitimeLoginMaven;

public class TestActitimeLoginMaven extends BaseTest
{
	@Test
	public void login1() throws IOException, InterruptedException
	{
		POMActitimeLoginMaven poom=new POMActitimeLoginMaven(driver);
		poom.loginintoactitime();
		poom.creatework();
		
	}
	

}
