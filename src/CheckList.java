public class CheckList {

    private int balance;

    private String cardNumber = "2345 4324 5293 4923";
    private String PIN = "1234";

    public CheckList(){}

    public CheckList(String cardNumber){
        this.cardNumber = setCardNumber(cardNumber);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void minusBalance(int balance) {
        this.balance -= balance;
    }

    public String setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPIN() {
        return PIN;
    }
}
