package unit12.homework;

public class Square extends Rectangle{

    public Square(int length) {
        super(length, length);
    }

    @Override
    int area() {
        return length *length;
    }

    @Override
    int scope() {
        return length * 4;
    }
}
