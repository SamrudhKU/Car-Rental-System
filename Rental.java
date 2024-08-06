public class Rental {
    private Car car;
    private Customer customer;
    private int daysRented;

    public Rental(Car car, Customer customer, int daysRented) {
        this.car = car;
        this.customer = customer;
        this.daysRented = daysRented;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int rentCost(){
        return daysRented * getCar().getCost();
    }

}
