package banking_account;

public class Alert {
	private String transactionAlert;
	private String otpAlert;
	private String fraudAlert;
	private String lowBalanceAlert;
	public String getTransactionAlert() {
		return transactionAlert;
	}
	public void setTransactionAlert(String transactionAlert) {
		this.transactionAlert = transactionAlert;
	}
	public String getOtpAlert() {
		return otpAlert;
	}
	public void setOtpAlert(String otpAlert) {
		this.otpAlert = otpAlert;
	}
	public String getFraudAlert() {
		return fraudAlert;
	}
	public void setFraudAlert(String fraudAlert) {
		this.fraudAlert = fraudAlert;
	}
	public String getLowBalanceAlert() {
		return lowBalanceAlert;
	}
	public void setLowBalanceAlert(String lowBalanceAlert) {
		this.lowBalanceAlert = lowBalanceAlert;
	}
	

}
