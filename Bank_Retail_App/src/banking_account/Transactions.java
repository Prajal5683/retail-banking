package banking_account;

public class Transactions {
	private String UID;
	private String benficiaryName;
	private long beneficiaryAccountNumber;
	private int transactionAmount;
	private Date transactionDate = new Date();
	private Time transactionTime = new Time();
	private boolean success ;
	
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getBenficiaryName() {
		return benficiaryName;
	}
	public void setBenficiaryName(String benficiaryName) {
		this.benficiaryName = benficiaryName;
	}
	public long getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(long beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Time getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Time transactionTime) {
		this.transactionTime = transactionTime;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
	
}
