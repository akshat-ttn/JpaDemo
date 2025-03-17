package com.akshat.JpaDemo.repository;

import com.akshat.JpaDemo.model.InheritanceMapping.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
