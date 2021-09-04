package generics;


import generics.buffer.CircularBuffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");
        //buffer.offer(1); - Compile error due to usecase of Generics

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer buffer) {
        StringBuilder result = new StringBuilder();

        String value;
        while ((value = (String) buffer.poll())!= null) {
            result.append(value);
        }
        return result.toString();
    }
}
