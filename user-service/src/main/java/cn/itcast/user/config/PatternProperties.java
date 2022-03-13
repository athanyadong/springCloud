package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/13 13:21
 * @since jdk11
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;
}
