package TheFeatures.EnhanchedSwitchStatement;

public class TheEnhanchedSwitch {

    public static void main(String[] args) {

        String val = "b";

        switch (val){
            case "One", "Two", "Three" -> System.out.println("String");
            case "4", "5", "6" -> System.out.println("Number");
            case "a", "b", "c" -> System.out.println("Alphabet");
            default -> System.out.println("Enter valid choise");
        }


    }
}
