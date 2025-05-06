
interface Display {
    void show();
}


interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}


class PassengerJet implements Aircraft {
    int rows;
    int seatsPerRow;

    PassengerJet(int r, int s) {
        rows = r;
        seatsPerRow = s;
    }

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity());
    }
}


class CargoPlane implements Aircraft {
    int length;
    int width;

    CargoPlane(int l, int w) {
        length = l;
        width = w;
    }

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        return (length * width) / 2;  // estimate
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity());
    }
}


class PrivateJet implements Aircraft {
    int seats;

    PrivateJet(int s) {
        seats = s;
    }

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println("Type: " + aircraftType());
        System.out.println("Capacity: " + calculateCapacity());
    }
}


public class Main {
    public static void main(String[] args) {
        PassengerJet p = new PassengerJet(10, 6);
        CargoPlane c = new CargoPlane(20, 10);
        PrivateJet pj = new PrivateJet(5);

        p.show();
        System.out.println();
        c.show();
        System.out.println();
        pj.show();
    }
}
