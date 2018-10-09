package seedu.address.model.account;

public class AccountManager {
    private static AccountList accountList;
    /**
     * Indicate if user has successfully logged in.
     */
    private static boolean loginSuccess;

    public static Account getRootAccount() {
        return new Account("rootUser", "rootPassword");
    }

    public static AccountList getDefaultAccountList() {
        AccountList accountList = new AccountList();
        accountList.addAccount(getRootAccount());
        AccountManager.accountList = accountList;

        return accountList;
    }

    public AccountManager() {
        loginSuccess = false;
    }

    /**
     * After user has successfully logged in, set loginSuccess field to true.
     */
    public void setLoginSuccess() {
        loginSuccess = true;
    }

    /**
     * Return true if user has successfully logged in, else return false.
     * @return True if user has successfully logged in, false otherwise.
     */
    public static boolean isLoginSuccess() {
        return loginSuccess;
    }
}
