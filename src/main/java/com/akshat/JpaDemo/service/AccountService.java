package com.akshat.JpaDemo.service;

import com.akshat.JpaDemo.model.InheritanceMapping.Account;
import com.akshat.JpaDemo.model.InheritanceMapping.CurrentAccount;
import com.akshat.JpaDemo.model.InheritanceMapping.SavingsAccount;
import com.akshat.JpaDemo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.Arrays;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public void addAccounts() {
        Account acc1 = new SavingsAccount("Kunal Rawat", 5000, 3.5);
        Account acc2 = new SavingsAccount("Akshat Srivastava", 8000, 4.2);
        Account acc3 = new CurrentAccount("Manvi Jain", 12000, 5000);
        Account acc4 = new CurrentAccount("Krishna Sharma", 15000, 7000);

        accountRepository.saveAll(Arrays.asList(acc1, acc2, acc3,acc4));
        System.out.println("Accounts added successfully!");
    }



}
