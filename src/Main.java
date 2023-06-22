
public class Main {
    public static void main(String[] args) {

        String str = args[0];
        String[] string = str.split(" ");
        String operation = string[0];
        String[] numbersStr = string[1].split(",");
        double[] numbers = new double[numbersStr.length];


        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Double.parseDouble(numbersStr[i]);
        }

        double x = numbers[0];
        double y = numbers[1];


        switch (operation) {
            case "sum" -> System.out.println(Calculator.sum(numbers));
            case "div" -> System.out.println(Calculator.div(x, y));
            case "mul" -> System.out.println(Calculator.mul(x, y));
            case "sub" -> System.out.println(Calculator.sub(x, y));
            default -> System.out.println("Wrong input");
        }
    }
}