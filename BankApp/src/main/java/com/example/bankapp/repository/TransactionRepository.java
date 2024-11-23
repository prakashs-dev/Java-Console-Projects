package com.example.bankapp.repository;

import com.example.bankapp.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {

    List<Transactions> findByAccountId(Long accountId);
}
