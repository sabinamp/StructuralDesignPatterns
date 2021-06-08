package ch.sabina.dp.adapter;

public class YAdapter implements PayD{
	private final XPay xpay;
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	public YAdapter(XPay xp) {
		this.xpay = xp;
		prop();
	}
	
	private void prop() {
		setCardOwnerName(this.xpay.getCustomerName());
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardExpMonthDate(this.xpay.getCardExpMonth()+"-"+this.xpay.getCardExpYear());
		setCVVNo(this.xpay.getCardCVVNo().intValue());
		setTotalAmount(this.xpay.getAmount());
		
	}

	@Override
	public String getCustCardNo() {
		
		return this.custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		
		return this.cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		
		return this.cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		
		return this.cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		
		return this.totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
		
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		 this.cardOwnerName = cardOwnerName;
		
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardOwnerName= cardExpMonthDate;
		
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
		
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
		
	}

}
