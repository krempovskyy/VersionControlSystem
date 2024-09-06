public class App {
    public static void main(String[] args) throws Exception {

        String creator = "Dima";
        Integer number1 = 10;
        Integer number2 = 3;
        Integer multiplication = number1 * number2;
        Integer addition = number1 + number2;
        double division = number1 / number2;
        Integer substraction = number1 - number2;

        
        System.out.println("Printer app");
        System.out.print("This app is made by: ");
        System.out.println(creator);

        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        System.out.print(number1 + " * " + number2);
        System.out.println(" = " + multiplication);

        System.out.print(number1 + " + " + number2);
        System.out.println(" = " + addition);

        System.out.print(number1 + " / " + number2);
        System.out.println(" = " + division);

        System.out.print(number1 + " - " + number2);
        System.out.println(" = " + substraction);


    }
}
