package guru.springframework.bootstrap.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MyRdsProfile {

    @Autowired
    public MyRdsProfile(@Value("${spring.datasource.url}") String url,
                        @Value("${spring.datasource.username}") String username,
                        @Value("${spring.datasource.password}") String password){

        System.out.println("*******************");
        System.out.println("*   dev-RDS   *");
        System.out.println("url :" + url);
        System.out.println("username :" + username);
        System.out.println("password :" + password);
        System.out.println("*******************");
    }
}
