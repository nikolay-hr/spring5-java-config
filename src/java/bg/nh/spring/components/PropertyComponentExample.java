package bg.nh.spring.components;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *
 * @author Niki
 */
@Component
@PropertySource("/WEB-INF/application.properties")
public class PropertyComponentExample {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    //da ne go pravq tova nikoga :D
    @Bean
    public DataSource getDataSource() {
        System.out.println("DataSource setup...");
        System.out.println(username);
        System.out.println(password);
        System.out.println(url);
        System.out.println(driver);
        /*return DataSourceBuilder
                .create()
                .username(username)
                .password(password)
                .url(url)
                .driverClassName(driver)
                .build();*/
        return null;
    }
}
