
class Cylinder extends Circle_ii{

    private double height;

    Cylinder(double r , double h){
        radius = r;
        height = h;
    }

    double getArea(){
        return (2 * Math.PI * height) + (2 * Math.PI * (radius * radius));
    }
}

public class Circle_ii {
    double radius;

    double getArea(double radius){
        this.radius = radius;
        return  Math.PI * (radius * radius);
    }


    public static void main(String[] args) {

        // Question 2 ok in Ques 5

        Cylinder cal1 = new Cylinder(7,8);
        System.out.println(cal1.getArea());

    }
}
