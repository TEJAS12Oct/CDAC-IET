package Q3;

public class Message {

	String SenderName, ReceiverName, Message;
	Address ReceiverAddress;

	Message() {
	}

	public String getSenderName() {
		return SenderName;
	}

	public Message(String senderName, String receiverName, String message, Address receiverAddress) {
		SenderName = senderName;
		ReceiverName = receiverName;
		Message = message;
		ReceiverAddress = receiverAddress;
	}

	@Override
	public String toString() {
		return "Message [SenderName=" + SenderName + ", ReceiverName=" + ReceiverName + ", Message=" + Message
				+ ", ReceiverAddress=" + ReceiverAddress + "]";
	}

	public void setSenderName(String senderName) {
		SenderName = senderName;
	}

	public String getReceiverName() {
		return ReceiverName;
	}

	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Address getReceiverAddress() {
		return ReceiverAddress;
	}

	public void setReceiverAddress(Address receiverAddress) {
		ReceiverAddress = receiverAddress;
	}
}
