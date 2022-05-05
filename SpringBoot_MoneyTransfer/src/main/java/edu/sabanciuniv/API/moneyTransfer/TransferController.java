package edu.sabanciuniv.API.moneyTransfer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.time.LocalDateTime;

@RestController
@RequestMapping("/MoneyTransferService")
public class TransferController{
	
	private MoneyTransferService moneyTransferService;
	private LocalDateTime time;

	@Autowired	
	public TransferController(MoneyTransferService moneyTransferService) {
		super();
		this.moneyTransferService = moneyTransferService;
		
	}
		
	@PostMapping
	public ResponseEntity<LogTable> createTransfer(@RequestBody  LogTable transfer) {
		time = LocalDateTime.now();
		transfer.setTime(time);
		LogTable savedTransfer = moneyTransferService.createTransfer(transfer);
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(savedTransfer);
	}
	
	@PostMapping("/transfer/{iban1}/{iban2}/{amount}")
	public ResponseEntity<LogTable> createTransfer(@PathVariable("iban1") String iban1, @PathVariable("iban2") String iban2, 
	@PathVariable("amount") double amount) {
		time = LocalDateTime.now();
		LogTable newTransfer = new LogTable(iban1,iban2,amount,time);
		LogTable savedTransfer = moneyTransferService.createTransfer(newTransfer);
		
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(savedTransfer);
	}
	
	@GetMapping("/transfer/{iban1}/{iban2}/{amount}")
	public ResponseEntity<LogTable> makeTransfer(@PathVariable("iban1") String iban1, @PathVariable("iban2") String iban2, 
	@PathVariable("amount") double amount) {
		time = LocalDateTime.now();
		LogTable newTransfer = new LogTable(iban1,iban2,amount,time);
		LogTable savedTransfer = moneyTransferService.createTransfer(newTransfer);
		
		return ResponseEntity.status(HttpStatus.CREATED.value()).body(savedTransfer);
	}
	
}
