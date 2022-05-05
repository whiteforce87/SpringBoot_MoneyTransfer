package edu.sabanciuniv.API.moneyTransfer;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String senderIban;
	private String receiverIban;
	private double amount;
	private LocalDateTime time;
	
	
	public LogTable() {
		super();
	}

	public LogTable(String senderIban, String receiverIban, double amount, LocalDateTime time) {
		super();
		this.senderIban = senderIban;
		this.receiverIban = receiverIban;
		this.amount = amount;
		this.time = time;
	}
	
	
	public String getSenderIban() {
		return senderIban;
	}
	public void setSenderIban(String senderIban) {
		this.senderIban = senderIban;
	}
	public String getReceiverIban() {
		return receiverIban;
	}
	public void setReceiverIban(String receiverIban) {
		this.receiverIban = receiverIban;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Log Table [senderIban=" + senderIban + ", receiverIban=" + receiverIban + ", amount="
				+ amount + ", time=" + time + "]";
	}
	
	
	

}
