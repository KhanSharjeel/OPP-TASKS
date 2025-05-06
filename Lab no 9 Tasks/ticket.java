
abstract class Seat {

    abstract int calculateSeatPrice(int noofSeats);
}


class BusinessClass extends Seat {
    public int calculateSeatPrice(int noofSeats) {
        return noofSeats * 5000;
    }
}


class FirstClass extends Seat {
    public int calculateSeatPrice(int noofSeats) {
        return noofSeats * 3500;
    }
}


class EconomyClass extends Seat {
    public int calculateSeatPrice(int noofSeats) {
        return noofSeats * 2000;
    }
}


class Main {
    public static void main(String[] args) {

        BusinessClass business = new BusinessClass();
        FirstClass first = new FirstClass();
        EconomyClass economy = new EconomyClass();

        System.out.println("Business Class Price:" + business.calculateSeatPrice(1));
        System.out.println("First Class Price:" + first.calculateSeatPrice(1));
        System.out.println("Economy Class Price:" + economy.calculateSeatPrice(1));
    }
}
