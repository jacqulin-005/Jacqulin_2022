package employeeImplementation;

class AccountantFirm extends EngineerFirm implements Company {
    AccountantFirm(int n1) {
        super(n1);
        this.n = n1;
        Acc = true;
    }
}
