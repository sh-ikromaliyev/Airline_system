public class Account {
    private int id;
    private String password;
    private AccountStatus status;


    public Account(int id, String password, AccountStatus status){
        this.id = id;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public boolean resetPassword(String newPass){
        this.password = newPass;
        return true;
    }
}
