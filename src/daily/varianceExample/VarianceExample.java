package varianceExample;

public class VarianceExample {
    Number[] numArr;
    Integer[] intArr = new Integer[]{1,2,3};

    public static void main(String[] args) {
        VarianceExample ve = new VarianceExample();

        ve.numArr = ve.intArr;
    }
}
