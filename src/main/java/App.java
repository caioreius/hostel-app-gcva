import init.DataLoader;

public class App {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        dataLoader.loadDataInDatabase();

        System.out.println("Hello World! MySQL transaction successful");
    }
}
