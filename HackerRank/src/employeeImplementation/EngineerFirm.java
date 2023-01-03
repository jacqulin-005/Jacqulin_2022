package employeeImplementation;

class EngineerFirm {
    int[] income;
    int n;
    boolean Acc = false;
    
    public EngineerFirm(int n) { 
        this.n = n;      
        income = new int[n];
        for (int i = 0; i < n; i++) {
            income[i] = 0;
        }
    }

    public void assignSalaries(int[] salaries) {
        int newLen = 0;   
        if (income.length < salaries.length)   
            newLen = income.length;        
        
        if (income.length >= salaries.length)  
            newLen = salaries.length;    
        
        for (int i = 0; i < newLen; i++) {
                income[i] = salaries[i];
        }
        
        if (Acc == false) 
            System.out.println("Incomes of engineers credited");
        else
            System.out.println("Incomes of accountants credited");
    }
    
    public void averageSalary() {
        double avgsal = 0;
        double sum = 0;
        for (int i = 0; i < income.length; i++) {
                sum += income[i];
        }
        avgsal = sum / income.length;
        if (Acc == false) 
           System.out.println("Average salary of engineers is " + String.format("%.2f" , avgsal));
        else
           System.out.println("Average salary of accountants is " + String.format("%.2f" , avgsal));      
    }
   
    public void maxSalary() {
        int maxsal = -2147483648;
        for (int i = 0; i < income.length; i++) {
            if (income[i] > maxsal) 
                maxsal = income[i];
        } 
        if (Acc == false)       
            System.out.println("Maximum salary amongst engineers is " + maxsal); 
        else
            System.out.println("Maximum salary amongst accountants is " + maxsal); 
    }
    
    public void minSalary() {
        int minsal = 2147483647;
        for (int i = 0; i < income.length; i++) {
            if (income[i] < minsal)
                minsal = income[i];
        } 
        if (Acc == false) 
            System.out.println("Minimum salary amongst engineers is " + minsal); 
        else
            System.out.println("Minimum salary amongst accountants is " + minsal);
    }        
}

