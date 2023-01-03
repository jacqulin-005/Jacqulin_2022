package genericInstances;

class NumericDataType<T extends Number> implements DataType<T> {
    private T a , b;
    private double add, sub, mul ,div;
    public void addition(T a, T b) {
        System.out.println("Adding 2 generic instances"); 
        this.a = a;
        this.b = b;
        System.out.println("The result is: " + getAdd());
    }
    public String getAdd() {
        add = a.doubleValue() + b.doubleValue();
        return String.format("%.2f", add);
    }
    
    public void subtraction(T a, T b) {
        System.out.println("Subtracting two generic instances"); 
        this.a = a;
        this.b = b;
        System.out.println("The result is: " + getSub());
    }
    
    public String getSub() {
        sub = a.doubleValue() - b.doubleValue();
        return String.format("%.2f", sub);
    }
    
    public void multiplication(T a, T b) {
        System.out.println("Multiplying two generic instances"); 
        this.a = a;
        this.b = b;
        System.out.println("The result is: " + getMul());
    }
    
    public String getMul() {
        mul = a.doubleValue() * b.doubleValue();
        return String.format("%.2f", mul);
    }
    
    public void division(T a, T b) {
        System.out.println("Dividing two generic instances"); 
        this.a = a;
        this.b = b;
        System.out.println("The result is: " + getDiv());
    }
    
    public String getDiv() {
        div = a.doubleValue() / b.doubleValue();
        return String.format("%.2f", div);
    }
    
    void performAll(T a , T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);    
    }
}
