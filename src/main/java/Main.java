import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
       //Follow the instructions in the lab. We need a certain number of certain things.
        System.out.println("Ol' McFroilan Had a Farm...");
        System.out.println();

        //Set up People
        // OLE MC' FROILAN
        Farmer Froilan = new Farmer("Froilan");
        Tractor mcFroilanTractor = new Tractor("Big Green Tractor");
        Tomato tomato = new Tomato("red tomato");

        Froilan.makeNoise();
        Froilan.eat(tomato);
        Froilan.mount(mcFroilanTractor);
        Froilan.dismount(mcFroilanTractor);

        //SISTER FROILANDA
        CropDuster froilandaCropDuster = new CropDuster("Pink Crop Duster");
        Pilot Froilanda = new Pilot("Froilanda",froilandaCropDuster);
        EarCorn corn = new EarCorn("buttery corn");

        Froilanda.makeNoise();
        Froilanda.eat(corn);
        Froilanda.mount(froilandaCropDuster);
        Froilanda.dismount(froilandaCropDuster);


        //Set up Buildings and Fields (Farm)
        Farm farm = new Farm();
        Field field = new Field();
        FarmHouse farmHouse = new FarmHouse();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        CropRow croprow1 = new CropRow();
        CropRow croprow2 = new CropRow();
        CropRow croprow3 = new CropRow();
        CropRow croprow4 = new CropRow();
        CropRow croprow5 = new CropRow();
        //DALLAS I MOVED YOUR CHICKEN COOP :)
        field.getCropRows().add(croprow1);
        field.getCropRows().add(croprow2);
        field.getCropRows().add(croprow3);
        field.getCropRows().add(croprow4);
        field.getCropRows().add(croprow5);

        farm.setField(field);
        farm.setOurFarmHouse(farmHouse);



        farm.getStables().add(stable1);
        farm.getStables().add(stable2);
        farm.getStables().add(stable3);
















        //Set up Animals

        ArrayList<Horse> horseStable1 = new ArrayList<Horse>();
        ArrayList<Horse> horseStable2 = new ArrayList<Horse>();
        ArrayList<Horse> horseStable3 = new ArrayList<Horse>();

        Horse horse1 = new Horse("Jumpin' Jack");
        Horse horse2 = new Horse("Choco");
        Horse horse3= new Horse("Thunder");
        Horse horse4= new Horse("Diesel");
        Horse horse5 = new Horse("Mustang");
        Horse horse6 = new Horse("Blazer");
        Horse horse7 = new Horse("White Pegasus");
        Horse horse8 = new Horse("Bella");
        Horse horse9 = new Horse("Black Knight");
        Horse horse10 = new Horse("Maximus");

        horseStable1.add(horse1);
        horseStable1.add(horse2);
        horseStable1.add(horse3);

        //CHICKENS & COOP
        Chicken chicken1 = new Chicken("Clucky",false);
        Chicken chicken2 = new Chicken("Chubby",true);
        Chicken chicken3 = new Chicken("Feathers",false);
        Chicken chicken4 = new Chicken("Big Momma Chicken",false);
        Chicken chicken5 = new Chicken("Cheddar",true);
        Chicken chicken6 = new Chicken("Brownie",false);
        Chicken chicken7 = new Chicken("Boo Boo",true);
        Chicken chicken8 = new Chicken("Sunshine",false);
        Chicken chicken9 = new Chicken("Chicky",true);
        Chicken chicken10 = new Chicken("Little One",true);
        Chicken chicken11 = new Chicken("Cedar",true);
        Chicken chicken12 = new Chicken("Birdy",false);
        Chicken chicken13 = new Chicken("Zazu",true);
        Chicken chicken14 = new Chicken("Deanie",true);
        Chicken chicken15 = new Chicken("Big Daddy Chicken",true);

        ArrayList<Chicken> group1 = new ArrayList<Chicken>();
        group1.add(chicken1);
        group1.add(chicken2);
        group1.add(chicken3);

        ArrayList<Chicken> group2 = new ArrayList<Chicken>();
        group2.add(chicken4);
        group2.add(chicken5);
        group2.add(chicken6);
        group2.add(chicken7);
        group2.add(chicken8);

        ArrayList<Chicken> group3 = new ArrayList<Chicken>();
        group3.add(chicken9);
        group3.add(chicken10);
        group3.add(chicken11);
        group3.add(chicken12);

        ArrayList<Chicken> group4 = new ArrayList<Chicken>();
        group4.add(chicken13);
        group4.add(chicken14);
        group4.add(chicken15);

        ChickenCoop coop1 = new ChickenCoop("Fun Coop");
        ChickenCoop coop2 = new ChickenCoop("Warm Coop");
        ChickenCoop coop3 = new ChickenCoop("Pretty Coop");
        ChickenCoop coop4 = new ChickenCoop("Big Coop");


        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        chickenCoops.add(coop1);
        chickenCoops.add(coop2);
        chickenCoops.add(coop3);
        chickenCoops.add(coop4);

        farm.setCoops(chickenCoops);

        coop1.setChickens(group1);
        coop2.setChickens(group2);
        coop3.setChickens(group3);
        coop4.setChickens(group4);

        System.out.println("\n" +"Welcome to our chicken coops...");
        System.out.println(coop1);
        System.out.println(coop2);
        System.out.println(coop3);
        System.out.println(coop4);

        System.out.println("\n" +"Now the chickens will lay eggs...");
        farmHouse.addFood(chicken1.yield());
        chicken2.yield();
        farmHouse.addFood(chicken3.yield());
        farmHouse.addFood(chicken4.yield());
        chicken5.yield();
        farmHouse.addFood(chicken6.yield());
        chicken7.yield();
        farmHouse.addFood(chicken8.yield());
        chicken9.yield();
        chicken10.yield();
        chicken11.yield();
        farmHouse.addFood(chicken12.yield());
        chicken13.yield();
        chicken14.yield();
        chicken15.yield();







        horseStable2.add(horse4);
        horseStable2.add(horse5);
        horseStable2.add(horse6);

        horseStable3.add(horse7);
        horseStable3.add(horse8);
        horseStable3.add(horse9);
        horseStable3.add(horse10);















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
        farm.getStables().add(stable1);
        farm.getStables().add(stable2);
        farm.getStables().add(stable3);
        farm.getField().add(croprow1);
        stable1.setHorses(horseStable1);
        stable2.setHorses(horseStable2);
        stable3.setHorses(horseStable3);
















        //Set up Vehicles
      //ASHER I ALSO MOVED YOUR TRACTOR TO THE PERSON SECTION :)
      mcFroilanTractor.operate();
      mcFroilanTractor.makeNoise();

      //ASHER I MOVED YOUR CROP DUSTER TO THE PERSON SECTION :)
      froilandaCropDuster.fly();
        froilandaCropDuster.operate();
      froilandaCropDuster.makeNoise();

      //froilandaCropDuster.fertilize();
















        //Set up Produce
        















        
    }
}
