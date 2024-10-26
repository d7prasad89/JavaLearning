package completeReference.chapter8.inheritence;

public class WeightBox extends Box{

    int weight;

    public WeightBox(int height, int width, int weight) {
        super(height, width);
        this.weight = weight;
    }
}
