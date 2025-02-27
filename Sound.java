public class Sound extends Add_on{

    Cars cars;

    public Sound(Cars cars){
        this.cars = cars;
    }

    public String getDesc(){
        return cars.getDesc() + " including Sound System";
    }

    public int getcost(){
        return cars.getcost() + 1000;
    }
}





