package domain;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class Person {
    private final String name;
    private final String sex;
    private final String car;
    private final String rocket;
}
