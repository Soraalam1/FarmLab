import java.util.ArrayList;


public class Monday {
    public static void main(String[] args) {
        //Follow the instructions in the lab. We need a certain number of certain things.
        System.out.println("Ol' McFroilan Had a Farm...");
        System.out.println();

        //Set up People
        // OLE MC' FROILAN
        Farmer Froilan = new Farmer("Froilan");
        Tractor mcFroilanTractor = new Tractor("Big Green Tractor");


        Froilan.makeNoise();


        //SISTER FROILANDA
        CropDuster froilandaCropDuster = new CropDuster("Pink Crop Duster");
        Pilot Froilanda = new Pilot("Froilanda", froilandaCropDuster);
        Froilanda.makeNoise();


        //Set up Buildings and Fields (Farm)
        Farm farm = new Farm();
        Field field = new Field();
        FarmHouse farmHouse = new FarmHouse();
        Stable stable1 = new Stable("Thee Stallion's ");
        Stable stable2 = new Stable("Speed Demon's ");
        Stable stable3 = new Stable("Polo Assassin's ");
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


        Horse horse1 = new Horse("Bella");
        Horse horse2 = new Horse("Choco");
        Horse horse3 = new Horse("LaFronda");
        Horse horse4 = new Horse("Diesel");
        Horse horse5 = new Horse("Mustang");
        Horse horse6 = new Horse("Blazer");
        Horse horse7 = new Horse("White Pegasus");
        Horse horse8 = new Horse("Jumpin Jack");
        Horse horse9 = new Horse("Black Knight");
        Horse horse10 = new Horse("Maximus");

        horseStable1.add(horse1);
        horseStable1.add(horse2);
        horseStable1.add(horse3);
        horseStable2.add(horse4);
        horseStable2.add(horse5);
        horseStable2.add(horse6);
        horseStable3.add(horse7);
        horseStable3.add(horse8);
        horseStable3.add(horse9);
        horseStable3.add(horse10);

        stable1.setHorses(horseStable1);
        stable2.setHorses(horseStable2);
        stable3.setHorses(horseStable3);

        System.out.println('\n' + "Welcome to our Horse Stables...");
        System.out.println(stable1);
        System.out.println(stable2);
        System.out.println(stable3);


        //CHICKENS & COOP
        Chicken chicken1 = new Chicken("Clucky", false);
        Chicken chicken2 = new Chicken("Chubby", true);
        Chicken chicken3 = new Chicken("Feathers", false);
        Chicken chicken4 = new Chicken("Big Momma Chicken", false);
        Chicken chicken5 = new Chicken("Cheddar", true);
        Chicken chicken6 = new Chicken("Brownie", false);
        Chicken chicken7 = new Chicken("Boo Boo", true);
        Chicken chicken8 = new Chicken("Sunshine", false);
        Chicken chicken9 = new Chicken("Chicky", true);
        Chicken chicken10 = new Chicken("Little One", true);
        Chicken chicken11 = new Chicken("Cedar", true);
        Chicken chicken12 = new Chicken("Birdy", false);
        Chicken chicken13 = new Chicken("Zazu", true);
        Chicken chicken14 = new Chicken("Deanie", true);
        Chicken chicken15 = new Chicken("Big Daddy Chicken", true);

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

        System.out.println("\n" + "Welcome to our chicken coops...");
        System.out.println(coop1);
        System.out.println(coop2);
        System.out.println(coop3);
        System.out.println(coop4);

        System.out.println("\n" + "Now the chickens will lay eggs...");
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


        //Set up Vehicles
        //ASHER I ALSO MOVED YOUR TRACTOR TO THE PERSON SECTION :)

        //ASHER I MOVED YOUR CROP DUSTER TO THE PERSON SECTION :)
        System.out.println("\n" + "Testing Basic Vehicle Operation...");
        mcFroilanTractor.operate();
        mcFroilanTractor.makeNoise();

        froilandaCropDuster.fly();
        froilandaCropDuster.makeNoise();
        froilandaCropDuster.operate();

        //Set up Produce
        System.out.println("\n" + "Here are my crops!");
        CornStalk cornStalk1 = new CornStalk(true, false);
        CornStalk cornStalk2 = new CornStalk(true, false);
        CornStalk cornStalk3 = new CornStalk(true, false);
        CornStalk cornStalk4 = new CornStalk(true, false);
        CornStalk cornStalk5 = new CornStalk(true, false);
        CornStalk cornStalk6 = new CornStalk(false, false);
        CornStalk cornStalk7 = new CornStalk(false, false);
        CornStalk cornStalk8 = new CornStalk(false, false);
        CornStalk cornStalk9 = new CornStalk(false, false);
        CornStalk cornStalk10 = new CornStalk(false, false);
        CornStalk cornStalk11 = new CornStalk(false, false);
        CornStalk cornStalk12 = new CornStalk(false, false);
        CornStalk cornStalk13 = new CornStalk(false, false);
        CornStalk cornStalk14 = new CornStalk(false, false);
        CornStalk cornStalk15 = new CornStalk(false, false);
        croprow1.getListOfCrops().add(cornStalk1);
        croprow1.getListOfCrops().add(cornStalk2);
        croprow1.getListOfCrops().add(cornStalk3);
        croprow1.getListOfCrops().add(cornStalk4);
        croprow1.getListOfCrops().add(cornStalk5);
        croprow1.getListOfCrops().add(cornStalk6);
        croprow1.getListOfCrops().add(cornStalk7);
        croprow1.getListOfCrops().add(cornStalk8);
        croprow1.getListOfCrops().add(cornStalk9);
        croprow1.getListOfCrops().add(cornStalk10);
        croprow1.getListOfCrops().add(cornStalk11);
        croprow1.getListOfCrops().add(cornStalk12);
        croprow1.getListOfCrops().add(cornStalk13);
        croprow1.getListOfCrops().add(cornStalk14);
        croprow1.getListOfCrops().add(cornStalk15);
        croprow1.setName("Corn Row");
        System.out.println(croprow1);

        TomatoPlant tomato1 = new TomatoPlant(false, false);
        TomatoPlant tomato2 = new TomatoPlant(false, false);
        TomatoPlant tomato3 = new TomatoPlant(false, false);
        TomatoPlant tomato4 = new TomatoPlant(false, false);
        TomatoPlant tomato5 = new TomatoPlant(false, false);
        TomatoPlant tomato6 = new TomatoPlant(false, false);
        TomatoPlant tomato7 = new TomatoPlant(false, false);
        TomatoPlant tomato8 = new TomatoPlant(false, false);
        TomatoPlant tomato9 = new TomatoPlant(false, false);
        TomatoPlant tomato10 = new TomatoPlant(false, false);
        TomatoPlant tomato11 = new TomatoPlant(false, false);
        TomatoPlant tomato12 = new TomatoPlant(false, false);
        croprow2.getListOfCrops().add(tomato1);
        croprow2.getListOfCrops().add(tomato2);
        croprow2.getListOfCrops().add(tomato3);
        croprow2.getListOfCrops().add(tomato4);
        croprow2.getListOfCrops().add(tomato5);
        croprow2.getListOfCrops().add(tomato6);
        croprow2.getListOfCrops().add(tomato7);
        croprow2.getListOfCrops().add(tomato8);
        croprow2.getListOfCrops().add(tomato9);
        croprow2.getListOfCrops().add(tomato10);
        croprow2.getListOfCrops().add(tomato11);
        croprow2.getListOfCrops().add(tomato12);
        croprow2.setName("Red Boys");
        System.out.println(croprow2);

        Crop crop1 = new Crop();
        Crop crop2 = new Crop();
        Crop crop3 = new Crop();
        Crop crop4 = new Crop();
        Crop crop5 = new Crop();
        croprow3.getListOfCrops().add(crop1);
        croprow3.getListOfCrops().add(crop2);
        croprow3.getListOfCrops().add(crop3);
        croprow3.getListOfCrops().add(crop4);
        croprow3.getListOfCrops().add(crop5);
        croprow3.setName("Leafy Greens");
        System.out.println(croprow3);

        croprow4.getListOfCrops().add(crop1);
        croprow4.getListOfCrops().add(crop2);
        croprow4.getListOfCrops().add(crop3);
        croprow4.getListOfCrops().add(crop4);
        croprow4.getListOfCrops().add(crop5);
        croprow4.setName("Squash");
        System.out.println(croprow4);

        croprow5.getListOfCrops().add(crop1);
        croprow5.getListOfCrops().add(crop2);
        croprow5.getListOfCrops().add(crop3);
        croprow5.getListOfCrops().add(crop4);
        croprow5.getListOfCrops().add(crop5);
        croprow5.setName("Beans");
        System.out.println(croprow5);

        System.out.println("\n" + "**************It's Monday!**************" + "\n");

        System.out.println("Before breakfast...");
        System.out.println();
        for (Stable stable: farm.getStables()) {
            for(Horse currentHorse : stable.getHorses()){
                Froilan.mount(currentHorse);
                Froilan.ride(currentHorse);
                Froilan.dismount(currentHorse);
            }
        }
        System.out.println();
        System.out.println("Froilanda is feeding each horse 3 earcorns!");
        System.out.println();

        for (Stable stable: farm.getStables()) {
            for(Horse currentHorse : stable.getHorses()){
                currentHorse.eat(new EarCorn("buttery corn"));
                currentHorse.eat(new EarCorn("nasty corn"));
                currentHorse.eat((new EarCorn("big corn")));
            }
        }
        System.out.println();


        System.out.println("It's breakfast time...");

        EarCorn froisCorn = new EarCorn("sweet corn");
        Tomato froilandsTomato1 = new Tomato("red tomato");
        Tomato froilandsTomato2 = new Tomato("green tomato");
        EdibleEgg froisEgg1 = new EdibleEgg();
        EdibleEgg froisEgg2 = new EdibleEgg();
        EdibleEgg froisEgg3 = new EdibleEgg();
        EdibleEgg froisEgg4 = new EdibleEgg();
        EdibleEgg froisEgg5 = new EdibleEgg();

        ArrayList<IEdible> froilandsBreakfast = new ArrayList<IEdible>();
        froilandsBreakfast.add(froisCorn);
        froilandsBreakfast.add(froilandsTomato1);
        froilandsBreakfast.add(froilandsTomato2);
        froilandsBreakfast.add(froisEgg1);
        froilandsBreakfast.add(froisEgg2);
        froilandsBreakfast.add(froisEgg3);
        froilandsBreakfast.add(froisEgg4);
        froilandsBreakfast.add(froisEgg5);

        for (IEdible currentFood : froilandsBreakfast) {
            Froilan.eat(currentFood);
        }
        System.out.println();
        EarCorn corn = new EarCorn("buttery corn");
        EarCorn corn2 = new EarCorn("dry corn");
        Tomato froilandasTomato = new Tomato("cherry tomato");
        EdibleEgg froilandasEgg1 = new EdibleEgg();
        EdibleEgg froilandasEgg2 = new EdibleEgg();

        ArrayList<IEdible> froilandasBreakfast = new ArrayList<IEdible>();
        froilandasBreakfast.add(corn);
        froilandasBreakfast.add(corn2);
        froilandasBreakfast.add(froilandasTomato);
        froilandasBreakfast.add(froilandasEgg1);
        froilandasBreakfast.add(froilandasEgg2);

        for (IEdible currentFood1 : froilandasBreakfast) {
            Froilanda.eat(currentFood1);
        }
        System.out.println();
        System.out.println("Every Monday Froilanda fertilizes crops...");
        Froilanda.mount(froilandaCropDuster);
        for (CropRow currentCropRow:farm.getField().getCropRows()) {
            froilandaCropDuster.fertilize(currentCropRow);
        }
        Froilanda.dismount(froilandaCropDuster);
        System.out.println();
        System.out.println("Froilanda has fertilized all the crops! The day is over!");
    }
}

