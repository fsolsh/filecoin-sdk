package com.fsolsh.mining.filecoin.model;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address implements Serializable {
    private String network;
    private String address;
    private byte[] bytes;

}
