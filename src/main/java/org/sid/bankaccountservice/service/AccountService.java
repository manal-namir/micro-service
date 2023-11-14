package org.sid.bankaccountservice.service;

import org.sid.bankaccountservice.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice.dto.BankAccountResponeDTO;
import org.sid.bankaccountservice.entities.BankAccount;

public interface AccountService {
    BankAccountResponeDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponeDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
