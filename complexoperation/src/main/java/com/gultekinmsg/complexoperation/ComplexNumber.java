package com.gultekinmsg.complexoperation;

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

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void substrack(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void substrack(ComplexNumber number) {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }
}
