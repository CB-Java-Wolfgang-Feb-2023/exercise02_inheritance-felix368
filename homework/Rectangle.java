package unit12.homework;

public class Rectangle extends Shapes{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    int area(){
        return length *width;
    }

    int scope(){
        return (length * width) * 2;
    }





}
