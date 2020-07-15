package singleton;

public class app {
    public static void main(String[] args) {
        Singleton stObj = Singleton.hInstance();
        Singleton stObj2 = Singleton.hInstance();
        Singleton stObj3 = Singleton.hInstance();
    }
}
