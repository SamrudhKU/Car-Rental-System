public class Main {

    public static void main(String[] args) {
        CarRentalSystem cr = new CarRentalSystem();

        Car c1 = new Car("C001", "Mustang1969", "Ford", 2000);
        Car c2 = new Car("C002", "G-Wagon", "Merceds", 2500);
        Car c3 = new Car("C003", "Chimera", "Koenigsegg", 3500);

        cr.car.add(c1);
        cr.car.add(c2);
        cr.car.add(c3);
        
        cr.menu();
    }
}
