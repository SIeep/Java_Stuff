import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        People person = new People();
        get("/hello", (req, res) -> person.name);
    }
}