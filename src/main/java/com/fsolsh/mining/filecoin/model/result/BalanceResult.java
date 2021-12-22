package com.fsolsh.mining.filecoin.model.result;

import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BalanceResult implements Serializable {
    /**
     * 余额
     */
    private BigInteger balanceOf;
}

