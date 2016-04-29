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
      model.put("userWord", userWord);
      model.put("template", "templates/word-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
