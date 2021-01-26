package definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@mobiletest")
	public void beforevalidation()
	{
		System.out.println("before validation");
	}
	@After("@mobiletest")
	public void afterevalidation()
	{
		System.out.println("After validation");
	}
	@Before("@regtest")
	public void beforewebvalidation()
	{
		System.out.println("before web validation");
	}
	@After("@regtest")
	public void afterewebvalidation()
	{
		System.out.println("After web validation");
	}
}
