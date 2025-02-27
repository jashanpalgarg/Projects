public class Alloywheels extends Add_on {

    Cars cars;
    public Alloywheels(Cars cars){
        this.cars = cars;
    }

    public String getDesc(){
        return cars.getDesc() + " including Alloy Wheels";
    }

    public int getcost(){
        return cars.getcost() + 2000;
    }
}

