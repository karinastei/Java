package Week4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if(balance >= 2.50){
            balance = balance - 2.50;
        }
    }

    public void payGourmet() {
        if(balance >= 4.00){
            balance = balance - 4.00;
        }
    }
    public double getBalance() {
        return balance;
    }

    public void loadMoney(double amount) {
       if(balance + amount <= 150 && amount > 0){
            balance = balance + amount;
        } else if(balance + amount > 150 && amount > 0) {
            balance = 150;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            LyyraCard cardPekka = new LyyraCard(20);
            LyyraCard cardBrian = new LyyraCard(30);

            cardPekka.payGourmet();
            System.out.println("Pekka:" + cardPekka.getBalance());

            cardBrian.payEconomical();
            System.out.println("Brian:" + cardBrian.getBalance());

            cardPekka.loadMoney(20);
            System.out.println("Pekka:" + cardPekka.getBalance());

            cardBrian.payGourmet();
            System.out.println("Brian:" + cardBrian.getBalance());

            cardPekka.payEconomical();

            cardPekka.payEconomical();
            System.out.println("Pekka:" + cardPekka.getBalance());

            cardBrian.loadMoney(50);
            System.out.println("Brian:" + cardBrian.getBalance());

        }
    }
}

