import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        People person = new People();
//        get("/hello", (req, res) -> person.name);
        get("/brandon",          (req, res)      -> person.name);
        post("/sign-in", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("username", req.queryParams("username"));
            return new ModelAndView(model, "Sign-in.vue");
        });
    }

}

