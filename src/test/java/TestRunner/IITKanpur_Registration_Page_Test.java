package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatures"},
		glue= {"StepDefination"},
		dryRun=true,
		monochrome=true
		)
public class IITKanpur_Registration_Page_Test {

	
}
