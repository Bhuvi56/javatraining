package com.training;



//) Create a Maven Project credit-card-service  
//219 2) Create a Class CreditCard with properties like cardNumber,cardHolderName,amountDue 
//220 3) Create a class CreditCardService with two methods  
//221   public boolean addCard(CreditCard card)  public CreditCard[] getCards() 
//222 4)  The Add Card method should store the card details in an Array  
//223 5) getCard Method  will return the Array  
//224 6) Test the Code From the Main Method 
//225 7) From the Main Iterate through the array and Print total total amount Due 


public class CreditCard {
	
	
	private double cardNumber;
	private String cardHolderName;
	private int amountDue;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(double cardNumber, String cardHolderName, int amountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}
	public double getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amountDue="
				+ amountDue + "]";
	}
	
	
	public static CreditCard toArray() {
		CreditCard Obj =  new CreditCard(23,"bhuvi", 3000);
		// TODO Auto-generated method stub
		return Obj;
	}
	
	
	

}
