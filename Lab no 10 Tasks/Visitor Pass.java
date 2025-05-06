
abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPpass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 500;
    }
}


class FamilyPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 300;
    }
}


class GeneralPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 200;
    }
}

public class Main {
    public static void main(String[] args) {
        VIPpass vip = new VIPpass();
        FamilyPass family = new FamilyPass();
        GeneralPass general = new GeneralPass();

        System.out.println("VIP Pass Price: " + vip.calculateTicketPrice(10));
        System.out.println("Family Pass Price: " + family.calculateTicketPrice(4));
        System.out.println("General Pass Price: " + general.calculateTicketPrice(2));
    }
}
