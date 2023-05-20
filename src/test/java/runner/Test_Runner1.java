package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		
        features = "E:\\TruVisory\\Azure_DevOps_Cloned\\CareNode\\CareNode_BDD\\CareNode_BDD_2023\\src\\main\\java\\features",
        glue={"step_definitions"}, //the path of the step definition files
      //  plugin = {"pretty","html:test-output/", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting 
        
        plugin = {
        			    "pretty", 
        			    "html:target/cucumber", //this is telling cucumber to create a folder called cucumber
        			    "json:target/cucumber", //this is also telling cucumber to create a folder called cucumber 
        			                            //even though you just need a file called cucumber.json
        			 //   "com.cucumber.listener.ExtentCucumberFormatter: target/report.html" 
        			    //there is an unnecessary white space before "target" that is causing another issue
        			},
        
        monochrome = true, //display the console output in a proper readable format
      //  strict = true, //it will check if any step is not defined in step definition file
        dryRun = false, //to check the mapping is proper between feature file and step def file
        tags= "@LoginPage_UI"
      )

public class Test_Runner1 extends AbstractTestNGCucumberTests {
	
	
	
}



