public class Navigation extends Add_on{

    Cars cars;

    public Navigation(Cars cars){
        this.cars = cars;
    }

    public String getDesc(){
        return cars.getDesc() + " including Navigation";
    }

    public int getcost(){
        return cars.getcost() + 1800;
    }
}



