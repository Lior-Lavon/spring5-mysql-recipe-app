package guru.springframework.bootstrap.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class MyDefaultProfile {

    @Autowired
    public MyDefaultProfile(){

        System.out.println("*******************");
        System.out.println("*   default-H2   *");
        System.out.println("*******************");
    }
}
