class Complex {

    double real;
    double image;

    void add(Complex num) {
        this.real = this.real + num.real;
        this.image = this.image + num.image;
    }

    void subtract(Complex num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
    }
}