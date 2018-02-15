
public class VariableAndNames {
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        // num of cars
        cars = 100;
        // num space in car
        space_in_a_car = 4; // floating point is a decimal number
        // num drivers 
        drivers = 30;
        // num passengers
        passengers = 90;
        // empty cars without drivers
        cars_not_driven = cars - drivers;
        // cars being drived is num of drivers
        cars_driven = drivers;
        // num of spots available
        carpool_capacity = cars_driven * space_in_a_car;
        // passengers in each car
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
