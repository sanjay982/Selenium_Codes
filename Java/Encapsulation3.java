package src.test.java.Selenium;
public class Encapsulation3 {

    private String aadharnum;
    private String pannum;
    private String accountnum;
    private String loandetails;

    public String getLoandetails() {
        return loandetails;
    }

    public void setLoandetails(String loandetails) {
        this.loandetails = loandetails;
    }

    public String getAadharnum() {
        return aadharnum;
    }

    public void setAadharnum(String aadharnum) {
        this.aadharnum = aadharnum;
    }

    public String getPannum() {
        return pannum;
    }

    public void setPannum(String pannum) {
        this.pannum = pannum;
    }

    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }

}
