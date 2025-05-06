

abstract class Marks {
    abstract float getPercentage();
}


class A extends Marks {
    int m1, m2, m3;


    A(int mark1, int mark2, int mark3) {
        if (mark1 < 0 || mark2 < 0 || mark3 < 0 || mark1 > 100 || mark2 > 100 || mark3 > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
    }


    float getPercentage() {
        return (m1 + m2 + m3) / 3.0f;
    }
}


class B extends Marks {
    int m1, m2, m3, m4;


    B(int mark1, int mark2, int mark3, int mark4) {
        if (mark1 < 0 || mark2 < 0 || mark3 < 0 || mark4 < 0 || mark1 > 100 || mark2 > 100 || mark3 > 100 || mark4 > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
        m4 = mark4;
    }


    float getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0f;
    }
}


public class Main {
    public static void main(String[] args) {
        try {

            A studentA = new A(85, 90, 111);
            B studentB = new B(80, 75, 85, 90);


            System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
            System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
