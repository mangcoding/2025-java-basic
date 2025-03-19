public class Gopay extends Emoney {
    
    public void topUp(String type, double amount) {
        if (type=="bank-transfer") {
            this._bankTransfer(amount);
        }else if (type=="deposit") {
            this._tellerDeposit(amount);
        }else if (type=="gojek") {
            this._depositbyGojek(amount);
        }
    }

    private void _bankTransfer(double amount) {
        //called some API and then update the amount
        this.amount += amount;
    }

    private void _tellerDeposit(double amount) {
        //check to the teller and then update the amount
        super.amount += amount;
    }

    private void _depositbyGojek(double amount) {
        //come to the driver and exchange money
        super.amount += amount;
    }

    public void transfer() {

    }

    public void withdraw() {
        
    }

    public void pay() {
        
    }
}
