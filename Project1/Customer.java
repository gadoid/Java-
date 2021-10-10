public class Customers {
    private String firstName ;
    private String lastName ;
    private Account account = new Account(0001, 10000, 0.03);
    public Customer(String f , String l ){
        this.firstName = f;
        this.lastName = l ;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account=account;
    }
}
