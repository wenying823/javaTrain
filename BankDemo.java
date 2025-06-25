class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // 只讀取帳戶擁有者（getter）
    public String getOwner() {
        return owner;
    }

    // 只讀取餘額（getter）
    public int getBalance() {
        return balance;
    }

    // 存錢（setter）
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // 提款（setter）
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }        git push -u origin main
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("小明", 1000);
        System.out.println("擁有者: " + acc.getOwner());
        System.out.println("目前餘額: " + acc.getBalance());

        acc.deposit(500); // 存錢
        System.out.println("存錢後餘額: " + acc.getBalance());

        acc.withdraw(300); // 提款
        System.out.println("提款後餘額: " + acc.getBalance());
    }
}