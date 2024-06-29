package com.fintech.cryptotrading.request.closetransaction;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CloseTransactionRequestBody {
    @NotNull(message = "Invalid Transaction Reference Number")
    @Positive(message = "Invalid Transaction Reference Number")
    private Long transactionReferenceNumber;
}
