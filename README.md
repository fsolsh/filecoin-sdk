# filecoin-sdk for infura

主要功能：

* 1.离线创建钱包
* 2.访问节点创建地址
* 3.导入私钥
* 4.获取gas
* 5.获取nonce
* 6.转账
* 7.获取余额
* 8.校验地址有效性
* 9.根据消息cid获取消息
……

springboot项目使用

* 第一步配置节点信息

 ``` 
####infura节点配置内容####
filecoin.node-type=infura
filecoin.rpc-url=https://1rCRRxe3OG2kKz4hl794EVVmlCR:84d7ff528ed9eee3ac9cbdaff3dc5196@filecoin.infura.io
filecoin.rpc-username=1rCRRxe3OG2kKz4hl794EVVmlCR
filecoin.rpc-secret=84d7ff528ed9eee3ac9cbdaff3dc5196
  
```

* 第二步依赖注入

 ``` 
 @Autowired
private Filecoin filecin;
```

* 第三步就可以使用该对象调用相应的方法实现相应的功能了

```
1.创建钱包
filecoin.createWallet();
2.导入私钥
filecoin.importWallet("私钥");
```