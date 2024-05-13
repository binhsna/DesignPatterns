package StaticBlockInitialization;


public class StaticBlockSingletonMain {
    public static void main(String[] args) {
        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
