package src.bank;

// class Account {
//     public String name;
//     protected String email;
//     private String password;
//     public void setPassword(String pwd) {
//         this.password = pwd;
//     }
//     public String getPassword() {
//         return this.password;
//     }
// }

// public class Bank {
//     public static void main(String[] args) {
//         Account a1 = new Account();
//         a1.name = "Sonali";
//         a1.email = "beingsonalisoni.work@gmail.com";
//         // a1.password = "123456";
//         a1.setPassword("123456");
//         System.out.println(a1.getPassword());
//     }
// }

/*
 * ENCAPSULATION 
 * data (propeties) + functions (methods) = inside one unit called CLASS
*/

public class Account {

    // Data Hiding using ACCESS MODIFIERS
    public String name;
    protected String email;
    private String password;

    // Getters and Setters
    private void setPassword(String pwd) {
        this.password = pwd;
    }

    public String getPassword() {
        setPassword("onlyGetMethodCanSetPwd");
        return this.password;
    }
}
