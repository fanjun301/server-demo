package cn.fanstar.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fanjun on 2018/2/25.
 */
@Configuration
@RefreshScope
public class ServerDemoApplicationConfig {

    @Value("${secret.token}")
    private String secretToken;


    public String getSecretToken() {
        return secretToken;
    }

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }
}
