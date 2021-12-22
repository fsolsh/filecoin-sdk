package com.fsolsh.mining.filecoin.model.result;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WalletResult implements Serializable {
    private String address;
    private String privateKey;
}
