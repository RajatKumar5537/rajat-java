package com.rajat.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClassContent{
	@Test
	public void createProject() {
		Reporter.log("Create Project in Generic",true);
	}
	@Test
	public void modifyProject() {
		Reporter.log("Modify Project in Generic",true);
		String text = d.getTitle();
		Reporter.log(text, true);
	}
	@Test
	public void deleteProject() {
		Reporter.log("Delete Project in Generic",true);
	}
}
