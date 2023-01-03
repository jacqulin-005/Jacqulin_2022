package buildingImplementation;

class Hospital extends School implements Building {
    Hospital(int n1) {
        super(n1);
        this.n = n1;
        hos = true;
        System.out.println("A school is being constructed");
        System.out.println("A hospital is being constructed");
    }
}
