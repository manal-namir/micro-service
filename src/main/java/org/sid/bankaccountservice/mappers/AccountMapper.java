package org.sid.bankaccountservice.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.sid.bankaccountservice.dto.BankAccountResponeDTO;
import org.sid.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponeDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponeDTO bankAccountResponeDTO=new BankAccountResponeDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponeDTO);
        return bankAccountResponeDTO;
    }
}
