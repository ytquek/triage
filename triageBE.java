import static spark.Spark.*;

public class triageBE {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World! 123 ");
    }
}
