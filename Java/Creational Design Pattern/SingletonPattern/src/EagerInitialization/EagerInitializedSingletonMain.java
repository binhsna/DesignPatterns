package EagerInitialization;

import test.Student;

public class EagerInitializedSingletonMain {
    public static void main(String[] args) {
        EagerInitializedSingleton e = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton e1 = EagerInitializedSingleton.getInstance();
        System.out.println(e);
        System.out.println(e1);

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s2);
    }
}
