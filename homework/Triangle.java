package unit12.homework;

public class Triangle extends Shapes {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        super(a, b);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    void area(){
        System.out.println("I don't know it");
    }

    int scope() {
        return a + b + c;
    }




}
