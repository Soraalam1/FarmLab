public class Main {
    public static void main(String[] args) {
       //Follow the instructions in the lab. We need a certain number of certain things.

        //Set up People
        Farmer Froilan = new Farmer("Froilan");



















        //Set up Animals















        //Set up Buildings and Fields (Farm)
        Farm farm = new Farm();
        Field field = new Field();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        CropRow croprow1 = new CropRow();
        CropRow croprow2 = new CropRow();
        CropRow croprow3 = new CropRow();
        CropRow croprow4 = new CropRow();
        CropRow croprow5 = new CropRow();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();
        field.getCropRows().add(croprow1);
        field.getCropRows().add(croprow2);
        field.getCropRows().add(croprow3);
        field.getCropRows().add(croprow4);
        field.getCropRows().add(croprow5);



        farm.getStables().add(stable1);
        farm.getStables().add(stable2);
        farm.getStables().add(stable3);
        farm.getField().add(croprow1);














        //Set up Vehicles

















        //Set up Produce















        
    }
}
