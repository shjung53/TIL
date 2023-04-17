package GenericExample;

public class GenericExample {

    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        String[] strArray = {"Hello", "World"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        printArray(strArray);
        printArray(intArray);
    }

}



