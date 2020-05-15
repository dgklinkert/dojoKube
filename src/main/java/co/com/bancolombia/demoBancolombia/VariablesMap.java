package co.com.bancolombia.demoBancolombia;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class VariablesMap {

    @Value("${app.name}")
    String name;
    @Value("${app.age}")
    int age;
}
