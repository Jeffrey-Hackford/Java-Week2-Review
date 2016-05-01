import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Dictionary");
  }

  @Test
  public void userWordIsEntered() {
    goTo("http://localhost:4567/");
    fill("#userWord").with("word");
    click(".btn");
    assertThat(pageSource()).contains("word");
  }

  @Test
  public void userDefinitionIsEntered() {
    goTo("http://localhost:4567/");
    fill("#userWord").with("word");
    click(".btn");
    fill("#userDefinition").with("definition");
    click(".btn");
    assertThat(pageSource()).contains("definition");
  }
}
