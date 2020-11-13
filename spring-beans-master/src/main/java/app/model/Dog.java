package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
public class Dog implements Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
