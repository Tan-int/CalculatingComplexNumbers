public class Main {
    public static void main(String[] args) {
        ComplexNumber expressionOne = new ComplexNumber(3, -5.2);
        ComplexNumber expressionTwo = new ComplexNumber(3, 9);

        System.out.println("Calculating: " + "(" + expressionOne.getReal() + " + " + expressionOne.getImaginary() + "i)" + " + ("
                + expressionTwo.getReal() + " + " + expressionTwo.getImaginary() + "i)");

        expressionOne.add(expressionTwo);
        System.out.println("Result: " + expressionOne.getReal() + " + " + expressionOne.getImaginary() + "i\n");

        System.out.println("Now Calculating: " + "(" + expressionOne.getReal() + " + " + expressionOne.getImaginary() + "i)" + " - (" + "4.0 - 2.7i)");
        expressionOne.subtract(4,-2.7);

        System.out.println("Result: " + expressionOne.getReal() + " + " + expressionOne.getImaginary() + "i");
    }
}
