package edu.sabanciuniv.API.moneyTransfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	
	private TransferRepository transferRepository;

	@Autowired
	public LogService(TransferRepository transferRepository) {
		super();
		this.transferRepository = transferRepository;
	}
	
	List<LogTable> findAllTransfers(){
		return transferRepository.findAll();
	}

}
