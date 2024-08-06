import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalSystem {

    Scanner s = new Scanner(System.in);

    ArrayList<Car> car = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Rental> rentals = new ArrayList<>();

    public void menu() {

        while (true) {
            System.out.println("---Car Rental System---");
            System.out.println("Menu \n 1. Rent Car \n 2. Return Car \n 3. exit.");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    rentCar();
                    break;
                case 2:
                    returnCar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private void rentCar() {

        System.out.print("Enter the Name: ");
        String userName = s.next();
        System.out.print("Enter the Phone: ");
        int userPhone = s.nextInt();
        System.out.print("Enter the Adhar Card Number: ");
        int userAdhar = s.nextInt();

        System.out.println("Available Cars");

        for (Car c : car) {
            System.out.println(c.getCarId() + " " + c.getCarName() + " " + c.getCarBrand() + "  Cost: " + c.getCost()
                    + " isAvailable: " + c.isAvaliable());
        }

        System.out.print("Enter the carID: ");
        String carId = s.next();
        System.out.print("Enter the Days to rent: ");
        int rentDays = s.nextInt();

        Car rentCar = null;
        for (Car c : car) {
            if (c.getCarId().equalsIgnoreCase(carId) && c.isAvaliable() == true) {
                rentCar = c;
                break;
            } else if (c.getCarId().equalsIgnoreCase(carId) && c.isAvaliable() == false) {
                System.out.println("Car is not available");
                break;
            }  
        }

        if (rentCar!=null) {
            Rental rent = new Rental(rentCar, new Customer("CUS" + customers.size() + 1, userName, userPhone, userAdhar), rentDays);
            System.out.println("Rental cost: " + rent.rentCost());
            System.out.println("Enter 'y' for Conformation else n: ");
            char confromation = s.next().charAt(0);
            if (confromation == 'y') {
                rentals.add(rent);
                rentCar.rented();
                System.out.println("Your car booking is conformed. \n Thank you ");
            } else {
                System.out.println("Renting is Cancelled");
            }
        } else {
            System.out.println("Enterd the wrong Car Id");
        }
    }

    private void returnCar() {
        System.out.print("Enter the returning carId: ");
        String carId = s.next();

        Car returnCar = null;
        for (Car c : car) {
            if (c.getCarId().equalsIgnoreCase(carId) && c.isAvaliable() == false) {
                returnCar = c;
                break;
            } 
        }

        if (returnCar != null) {
            returnCar.carReturned();
            System.out.println("Thank You ");
        } else {
            System.out.println("Enterd the wrong Car Id");
        }
    }
}
