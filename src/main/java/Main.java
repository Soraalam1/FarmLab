public class Main {
    public static void main(String[] args) {
       //Follow the instructions in the lab. We need a certain number of certain things.

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
        farm.getStables().add(stable1);
        farm.getStables().add(stable2);
        farm.getStables().add(stable3);
        farm.getField().add(croprow1);














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
