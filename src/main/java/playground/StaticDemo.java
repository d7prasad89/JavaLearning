package playground;

public class StaticDemo {

    private final String demo;

    public StaticDemo(String demo) {
        this.demo = demo;
    }

    public static void hello(){
        System.out.println(new StaticDemo("sdd").returnHello());
    }

    public String returnHello() {
        return demo;
    }
}
