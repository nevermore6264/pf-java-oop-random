import java.util.Random;

public class RandomInt {
    private int min;
    private int max;

    public RandomInt() {
    }

    public RandomInt(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int randomInterger() {
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum = min + rn.nextInt(range);
        return randomNum;
    }
}
