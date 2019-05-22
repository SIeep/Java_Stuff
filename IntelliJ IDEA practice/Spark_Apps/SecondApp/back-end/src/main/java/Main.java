import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/brandon", (req, res) -> Person.name);
    }
}
