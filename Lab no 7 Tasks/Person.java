
class Person {
    String personName;
    int age;

    public void print() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + age);
    }
}


class Patient extends Person {
    String diseaseType;
    String recommendedMedicine;


    public void print() {
        super.print();
        System.out.println("Disease Type: " + diseaseType);
        System.out.println("Recommended Medicine: " + recommendedMedicine);
    }
}


class MedicarePatient extends Patient {
    String hospitalName;
    String wardName;
    int roomNumber;


    public void print() {
        super.print();
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Ward Name: " + wardName);
        System.out.println("Room Number: " + roomNumber);
    }
}


 class Main {
    public static void main(String[] args) {

        MedicarePatient patient = new MedicarePatient();


        patient.personName = "Sharjeel";
        patient.age = 45;
        patient.diseaseType = "Diabetes";
        patient.recommendedMedicine = "Pianadol";
        patient.hospitalName = "Al Shifah";
        patient.wardName = "General";
        patient.roomNumber = 102;


        patient.print();
    }
}
