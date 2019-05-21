import static spark.Spark.*;

class SparkAppMain {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}