public class Calculator {
    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int add(){
        return this.numberOne + this.numberTwo;
    }

    public int subtract() {
        return this.numberTwo - this.numberOne;
    }

    public int multiply() {
        return this.numberOne * this.numberTwo;
    }

    public double divide(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
}
