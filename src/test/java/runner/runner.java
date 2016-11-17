package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by mitchell on 30/10/16.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/steps"},glue={"specs"})
public class runner {
}
