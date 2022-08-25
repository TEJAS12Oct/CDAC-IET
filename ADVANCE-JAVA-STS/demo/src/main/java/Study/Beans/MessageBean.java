package Study.Beans;

public class MessageBean {

	private String message, senderName;
	private AddressBean receiverAddress;

	// Default Constructor
	public MessageBean() {
		System.out.println("Message Bean default constructor called --that means instance is created");
	}

	public MessageBean(AddressBean receiverAddress) {
		System.out.println("Message bean Constructor With 1 Parameter");
		message = "Have a Good Day";
		senderName = "ShaktiMan";
		this.receiverAddress = receiverAddress;
	}

	public MessageBean(String message, String senderName, AddressBean receiverAddress) {
		System.out.println("message bean construcor with 3 parameters");
		this.message = message;
		this.senderName = senderName;
		this.receiverAddress = receiverAddress;
	}

	public AddressBean getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(AddressBean receiverAddress) {
		this.receiverAddress = receiverAddress;
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
