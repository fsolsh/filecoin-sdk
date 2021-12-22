package com.fsolsh.mining.filecoin.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RpcPar implements Serializable {
    private String jsonrpc;
    private Integer id;
    private String method;
    private List<Object> params;
}
