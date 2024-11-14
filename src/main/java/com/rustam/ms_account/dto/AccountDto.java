package com.rustam.ms_account.dto;

import com.rustam.ms_account.dao.enums.AccountStatus;
import com.rustam.ms_account.dao.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private UUID id;
    private String iban;
    private String username;
    private Currency currency;
    private String customerId;
    private BigDecimal balance;
    private AccountStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
