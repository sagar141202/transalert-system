package com.sagar.transalert.repository;

import com.sagar.transalert.entity.Transaction;
import com.sagar.transalert.enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Optional<Transaction> findByTransactionReference(String transactionReference);

    List<Transaction> findByTransactionStatus(TransactionStatus status);

    List<Transaction> findByAccountId(Long accountId);

}