package unit12.homework;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(10);
        Square s2 = new Square(30);
        Square s3 = new Square(20);
        Rectangle r1 = new Rectangle(20,40);
        Rectangle r2 = new Rectangle(30,50);
        Rectangle r3 = new Rectangle(60,20);

        Rectangle[] rectangleArr = {s1,s2,s3,r1,r2,r3};

        Triangle t1 = new Triangle(10,10,10);
        Triangle t2 = new Triangle(20,20,20);
        Triangle t3 = new Triangle(30,30,30);

        Triangle[] triangles = {t1,t2,t3};

        for (int i = 0; i < rectangleArr.length; i++) {

            System.out.println(rectangleArr[i].area());

        }


    }






}
