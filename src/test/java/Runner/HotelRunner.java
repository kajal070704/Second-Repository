package Runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="StepDefination")

public class HotelRunner extends AbstractTestNGCucumberTests{
	

}
