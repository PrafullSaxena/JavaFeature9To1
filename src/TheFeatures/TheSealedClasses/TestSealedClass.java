package TheFeatures.TheSealedClasses;

    /*
        By using sealed we can permit who can extend out class,
        Every class that extends our sealed class has to inherit at-least one of these three keywords
        * sealed - this means another child class can extend it, and we have to give access to that child class
        * non-sealed - this means any class can extend it
        * final - this means no one can extend the class
    */


public class TestSealedClass {
    public static void main(String[] args) {

        Car car = new Car();

        car.engien();

    }
}
