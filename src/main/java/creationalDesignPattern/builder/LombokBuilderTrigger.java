package creationalDesignPattern.builder;

public class LombokBuilderTrigger {
    public static void main(String[] args) {
        LombokBuilder builder =  LombokBuilder.builder().id(2).name("Test").build();
        System.out.println(builder);
    }
}
