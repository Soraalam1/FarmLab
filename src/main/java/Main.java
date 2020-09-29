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
