class Computer {
    String companyName;
    double price;

    public void show() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Price:" + price);
    }
}

class Desktop extends Computer {
    String color;
    String monitorSize;
    String processorType;

    public void show() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Price:" + price);
        System.out.println("Color: " + color);
        System.out.println("Monitor Size: " + monitorSize);
        System.out.println("Processor Type: " + processorType);
    }
}

class Laptop extends Computer {
    String color;
    String size;
    double weight;
    String processorType;

    public void show() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Price:" + price);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Processor Type: " + processorType);
    }
}

class Main {
    public static void main(String[] args) {

        Computer comp1 = new Desktop();
        comp1.companyName = "Dell";
        comp1.price = 900.00;
        ((Desktop) comp1).color = "Black";
        ((Desktop) comp1).monitorSize = "15 inches";
        ((Desktop) comp1).processorType = "Pavilion";


        comp1.show();
        System.out.println();


        Computer comp2 = new Laptop();
        comp2.companyName = "Asus rog";
        comp2.price = 1300.00;
        ((Laptop) comp2).color = "Silver";
        ((Laptop) comp2).size = "15.6 inches";
        ((Laptop) comp2).weight = 1.5;
        ((Laptop) comp2).processorType = "gen itel";

        comp2.show();
        System.out.println();
    }
}
