package TheFeatures.TheInstanceOf.TheAbstract;

public class TestInstanceOf {
    public static void main(String[] args) {
//        Car car = new Audi();
        Car car = new BMW();

        printInstanceOf(car);
    }


    public static void printInstanceOf(Car car){

        if (car instanceof Audi)
            System.out.println("It's Instance of Audi");
        if (car instanceof BMW)
            System.out.println("It's Instance of BMW");
    }
}
