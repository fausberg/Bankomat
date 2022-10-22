public class User {

    private final String firstName;
    private final String lastName;
    private final String cardNumber;

    public User(String firstName, String lastName, String cardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
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

}
