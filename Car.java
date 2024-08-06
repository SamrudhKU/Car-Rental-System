class Car{
    private String carId;
    private String carName;
    private String carBrand;
    private int cost;
    private boolean isAvaliable;

    public Car(String carId, String carName, String carBrand, int cost){
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.cost = cost;
        isAvaliable = true;
    }

    public String getCarId(){
        return carId;
    }

    public String getCarName(){
        return carName;
    }

    public String getCarBrand(){
        return carBrand;
    }

    public int getCost(){
        return cost;
    }

    public boolean isAvaliable(){
        return isAvaliable;
    }

    public void rented(){
        this.isAvaliable = false;
    }

    public void carReturned(){
        this.isAvaliable = true;
    }
}