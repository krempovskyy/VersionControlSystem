public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Printer app");
        Integer number1 = 10;
        Integer number2 = 3;
        String creator = "Dima";
        System.out.print("This app is made by: ");
        System.out.println(creator);

        Integer addition = number1 + number2;
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        
        Integer multiplication = number1 * number2;
        System.out.print(number1 + " * " + number2);
        System.out.println(" = " + multiplication);

        System.out.print(number1 + " + " + number2);
        System.out.println(" = " + addition);

        double division = number1 / number2;
        System.out.print(number1 + " / " + number2);
        System.out.println(" = " + division);

        Integer substraction = number1 - number2;
        System.out.print(number1 + " - " + number2);
        System.out.println(" = " + substraction);

    }
}
