public class ComplexNumber {
    private double real; // represents the real part of the complex number
    private double imaginary; // represents the imaginary part of the complex number

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //Adds this complex number with any real and imaginary number passed
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    //Adds this complex number with another complex number
    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }
}
