package creationalDesignPattern.singleton;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        System.out.println(dbSingleton);
        DbSingleton anotherinstance = DbSingleton.getInstance();
        System.out.println(anotherinstance);
    }
}
