public class Moon_roof extends Add_on{

    Cars cars;

    public Moon_roof(Cars cars){
        this.cars = cars;
    }

    public String getDesc(){
        return cars.getDesc() + " including Moon roof";
    }

    public int getcost(){
        return cars.getcost() + 1500;
    }
}



