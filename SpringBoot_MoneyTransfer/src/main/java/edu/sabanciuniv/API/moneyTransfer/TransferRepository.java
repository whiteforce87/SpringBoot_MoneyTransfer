package edu.sabanciuniv.API.moneyTransfer;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TransferRepository extends JpaRepository<LogTable, Long>{
	List<LogTable> findAll();
	@SuppressWarnings("unchecked")
	LogTable save(LogTable newTransfer);


}
