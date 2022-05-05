package edu.sabanciuniv.API.moneyTransfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MoneyTransferService {
	
	private TransferRepository transferRepository;
	
	
	@Autowired
	public MoneyTransferService(TransferRepository transferRepository) {
		super();
		this.transferRepository = transferRepository;
		System.out.println("Transferservice calisti!");

	}

	public List<LogTable> findAll(){
		return transferRepository.findAll();
	}



	public LogTable createTransfer(LogTable newTransfer) {
		
		return transferRepository.save(newTransfer);
	}

}
