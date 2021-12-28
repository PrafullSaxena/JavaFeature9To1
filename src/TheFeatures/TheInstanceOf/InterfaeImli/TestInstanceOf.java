package TheFeatures.TheInstanceOf.InterfaeImli;

public class TestInstanceOf {
    public static void main(String[] args) {

        Bike bike = new RoyalEnfield();
//        Bike bike = new Duke();
        printInstance(bike);

    }

    public static void printInstance(Bike bike){
        if (bike instanceof RoyalEnfield)
            System.out.println("it's a royalEnfield");

        if (bike instanceof Duke)
            System.out.println("It's a Duke");
    }
}
