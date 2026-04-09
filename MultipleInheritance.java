interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: ₹" + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice for " + clientName + ": ₹" + amount);
    }

    void showSummary() {
        System.out.println("Commercial tasks completed successfully.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();

        ce.processSale(5000);
        ce.generateInvoice("ABC Pvt Ltd", 5000);
        ce.showSummary();
    }
}