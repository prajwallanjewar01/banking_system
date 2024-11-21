package net.amol.banking.mapper;

import net.amol.banking.dto.AccountDto;
import net.amol.banking.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance(),
                accountDto.getLoanType(),
                accountDto.getLoanAmount()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance(),
                account.getLoanType(),
                account.getLoanAmount()
        );
        return accountDto;
    }
}
