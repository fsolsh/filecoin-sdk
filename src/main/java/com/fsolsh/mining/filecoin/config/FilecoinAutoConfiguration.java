package com.fsolsh.mining.filecoin.config;


import com.fsolsh.mining.filecoin.Filecoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 注入一个filecoin类，仅当配置了节点信息才注入
 */
@Configuration
@ConditionalOnMissingBean(Filecoin.class)
@ConditionalOnProperty(prefix = "filecoin", name = {"node-type"})
@EnableConfigurationProperties(FilecoinProperties.class)
public class FilecoinAutoConfiguration {

    @Autowired
    private FilecoinProperties filecoinProperties;

    @Bean
    public Filecoin filecoin() {
        return new Filecoin(filecoinProperties);
    }
}
