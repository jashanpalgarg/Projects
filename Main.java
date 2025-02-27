public class Main {

    public static void main(String[] args) {

        //Bare Sedan, no options
        Cars baresedan = new Sedan();
        System.out.println("The car is " + baresedan.getDesc() + " And the cost of bare sedan with no add on is  = " + baresedan.getcost());

        //Sedan with a Moon roof
        Cars smf = new Sedan();
        smf = new Moon_roof(smf);
        System.out.println("The car is " + smf.getDesc() + " And the cost of sedan with moonroof is  = " + smf.getcost());

        //Sports car with sound, wheels and navigation
        Cars SpSWN = new Sportscar();
        SpSWN = new Sound(SpSWN);
        SpSWN = new Alloywheels(SpSWN);
        SpSWN = new Navigation(SpSWN);
        System.out.println("The car is " + SpSWN.getDesc() + " And the cost of Sports Car with sound, wheels and navigation is  = " + SpSWN.getcost());

        //Suv with wheels and moon roof
        Cars SUVWM =  new Suv();
        SUVWM = new Alloywheels(SUVWM);
        SUVWM = new Moon_roof(SUVWM);
        System.out.println("The car is " + SUVWM.getDesc() + " And the cost of SUV with Alloy wheels and Moonroof is  = " + SUVWM.getcost());

        //Suv Loaded
        Cars SUVL = new Suv();
        SUVL = new Moon_roof(SUVL);
        SUVL = new Alloywheels(SUVL);
        SUVL = new Navigation(SUVL);
        SUVL = new Sound(SUVL);
        System.out.println("The car is " + SUVL.getDesc() + " And the cost of SUV Loaded is  = " + SUVL.getcost());




    }
}