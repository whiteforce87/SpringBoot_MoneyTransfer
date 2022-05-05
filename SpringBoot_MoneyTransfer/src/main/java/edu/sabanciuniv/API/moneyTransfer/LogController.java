package edu.sabanciuniv.API.moneyTransfer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/LogService")
public class LogController{
	
	private LogService logService;

	@Autowired	
	public LogController(LogService logService) {
		super();
		this.logService = logService;
		
	}
		
	@GetMapping("/getLogs")
	public ResponseEntity <List<LogTable>> publishTransfers() {
		List<LogTable> transfers =  logService.findAllTransfers();

		return ResponseEntity.status(HttpStatus.OK).body(transfers);
	}
	
	
	
}
