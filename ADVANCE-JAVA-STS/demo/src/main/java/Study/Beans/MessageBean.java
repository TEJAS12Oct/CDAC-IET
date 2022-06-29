package Study.Beans;

public class MessageBean {
	
	private String message,senderName;
	private AddressBean receiverAddress;
	
	public AddressBean getReceiverAddress() {
		return receiverAddress;
	}
	
	public void setReceiverAddress(AddressBean receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	
	public MessageBean()
	{
		System.out.println("Message Bean constructor called --that means instance is created");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("setMessage is called");
		this.message = message;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		System.out.println("setSender called");
		this.senderName = senderName;
	}

	
}
