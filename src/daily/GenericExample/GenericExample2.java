package GenericExample;

public class GenericExample2 {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setData("Hello");
        String str = box.getData();
    }
}
class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
