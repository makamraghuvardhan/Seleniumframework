package testCases;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnn {
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("BeforeSuit is executing");
	}
	@AfterSuite
	public void Aftersuit()
	{
		System.out.println("AfterSuit is executing");
	}
	@BeforeTest
	public void beforTest()
	{
		System.out.println("BeforeTest is executing");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest is executing");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass is executing");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass is executing");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod is executing");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod is executing");
	}
	
	@BeforeGroups
	public void beforegroups()
	{
		System.out.println("Beforegroups is executing");
	}
	@AfterGroups
	public void Aftergroups()
	{
		System.out.println("Aftergroups is executing");
	}
	@Test(priority=5,groups= {"Sanity"})
	public void test1() {
		System.out.println("test1 method");
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("test2 method");
	}
	@Test(groups= {"Sanity"})
	public void test3() {
		System.out.println("test3 method");
	}
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("test4 method");
	}
	@Test(groups= {"Sanity","regression"})
	public void test5() {
		System.out.println("test5 method");
	}
}
