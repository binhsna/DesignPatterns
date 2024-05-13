package EnumSingleton;

public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton() {
        // Khởi tạo đối tượng Singleton
    }

    public void doSomething() {
        // Thực hiện các thao tác
        System.out.println("Đang thực hiện công việc...");
    }
}
