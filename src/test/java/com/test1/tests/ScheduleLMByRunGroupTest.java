package com.test1.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleLMByRunGroupTest extends TestBase
{
	public String UtilityCompany1;
	
	@Test (dataProvider = "dataProvider")
	public void testSuccessfulLoadMgmtRunGroupAdd(String username, String password, String RunGroup, 
			String LMduration, String LMhour, String LMminute, String LMnotes, String LoadMgmtByRunGroup) 
			throws InterruptedException, IOException 
			
		  {
		    
		  //The entry point LogInPage object below can now be removed because its added to TestBase can now inherit this
		  // LogInPage loginPage = new LogInPage(driver);
			  
		  boolean testResults = logInPage.loginAs(username, password)
				  						 .clickLoadMgmtLink()
				  						 .scheduleLMbyRunGroup(RunGroup, LMduration, LMhour, LMminute, LMnotes, LoadMgmtByRunGroup)
				  						 .clickScheduledLM()
				  						 .isCreateLMbyRunGroupSuccessful(RunGroup);
				  						 
				  						   						 
				  						 
			System.out.println(testResults);	
			 
			Assert.assertTrue(testResults, "Test has not been successfully added for " + UtilityCompany1);				  						 
				  						 
		
		  }
	
	
	
	
	
}
