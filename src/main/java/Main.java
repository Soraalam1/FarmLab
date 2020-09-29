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



















        //Set up Animals
        //CHICKENS


        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();

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

















        //Set up Buildings and Fields (Farm)


















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
