public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber n1, ComplexNumber n2){

        ComplexNumber res = new ComplexNumber(0, 0);

        res.real = n1.real + n2.real;
        res.imaginary = n1.imaginary + n2.imaginary;

        return res;
    }

    public  ComplexNumber subtract(ComplexNumber n1, ComplexNumber n2){

        ComplexNumber sub = new ComplexNumber(0, 0);

        sub.real = n1.real - n2.real;
        sub.imaginary = n1.imaginary - n2.imaginary;

        return sub;
    }

}
