package EnumSingleton;

public class EnumSingletonMain {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton);
        System.out.println(singleton2);
        singleton.doSomething();
    }
}
