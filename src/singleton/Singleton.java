package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton constructor");
    }

    public static Singleton hInstance() {
        if (Singleton.instance == null) Singleton.instance = new Singleton();
        return Singleton.instance;
    }
}
