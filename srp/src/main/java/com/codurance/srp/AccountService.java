package com.codurance.srp;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class AccountService {

    
    private TransactionRepository transactionRepository;
    private Clock clock;
    private PrintStatementService printStatementService;

    public AccountService(TransactionRepository transactionRepository, Clock clock, PrintStatementService printStatementService) {
        this.transactionRepository = transactionRepository;
        this.printStatementService = printStatementService;
        this.clock = clock;
    }

    public void deposit(int amount) {
        transactionRepository.add(transactionWith(amount));
    }


    public void withdraw(int amount) {
        transactionRepository.add(transactionWith(-amount));
    }

    


    private Transaction transactionWith(int amount) {
        return new Transaction(clock.today(), amount);
    }


    public void printStatement() {
        List<Transaction> transactionsToPrint = transactionRepository.all();
        this.printStatementService.printStatement(transactionsToPrint);
    }
}