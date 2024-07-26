package nilam;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 123.456789f;
        System.out.printf("Formated String is %.2f", a); //round off till 2 decimal place
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("Pie is : .2f",Math.PI);

        System.out.println();
        System.out.printf("Hello I am %s and I am %s","Nilam", "Mad");
    }
}
