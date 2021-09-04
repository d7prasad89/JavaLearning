package defensiveCoding.util;

public class FlowCheck {

    public void bigLoop() {
        for (int i =0; i< 10000; i ++) {
            System.out.println(i);
        }
    }

    public void smallFun() {
        System.out.println("Small Function call");
    }

}
