public class User {

    private final String firstName;
    private final String lastName;
    private final String cardNumber;

    private final String PIN;

    public User(String firstName, String lastName, String cardNumber, String PIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.PIN = PIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPIN() {
        return PIN;
    }
}
