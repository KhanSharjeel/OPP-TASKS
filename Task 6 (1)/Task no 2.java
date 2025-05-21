public class RemoveWords {
    public static void main(String[] args) {
        String str = "abrambabasc";
        System.out.println("The given string is: " + str);


        str = str.replace("b", "");

        str = str.replace("ac", "");

        System.out.println("After removing the new string is: " + str);
    }
}
