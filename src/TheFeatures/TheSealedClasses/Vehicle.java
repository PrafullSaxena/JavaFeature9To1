package TheFeatures.TheSealedClasses;

public sealed class Vehicle permits Car{

    Vehicle(){
        System.out.println("Inside Vehicle");
    }

    public void engien(){
        System.out.println("HasEngien");
    }


}
