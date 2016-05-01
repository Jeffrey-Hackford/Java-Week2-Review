import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/word-list", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userWord = request.queryParams("userWord");
      Word newWord = new Word(userWord);
      request.session().attribute("userWord", newWord);
      model.put("userWord", userWord);
      model.put("template", "templates/word-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/definition", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userDefinition = request.queryParams("userDefinition");
      model.put("userWord", request.session().attribute("userWord"));
      model.put("userDefinition", userDefinition);
      model.put("template", "templates/word-definition-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
