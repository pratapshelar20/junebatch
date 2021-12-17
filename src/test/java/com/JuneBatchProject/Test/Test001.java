package com.JuneBatchProject.Test;

import org.testng.annotations.Test;

import com.JuneBatch.Project.Utility.BaceClass;

public class Test001  extends BaceClass{
	@Test(groups={"Sanity"})
	public void Verify_001() {
		System.out.println("Tc_001");
	}
	@Test(groups={"Regression"})
	public void Verify_002() {
		System.out.println("Tc_002");
	}
	@Test(groups={"Sanity"})
	public void Verify_003() {
		System.out.println("Tc_003");
	}
	@Test(groups={"Regression"})
	public void Verify_004() {
		System.out.println("Tc_004");
	}
	@Test(groups={"Regression","Sanity"})
	public void Verify_005() {
		System.out.println("Tc_005");
	}
}
