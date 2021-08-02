package one.digitalinnovation.classes.person;

public class Person {

    private Integer age;
    private Float weight;

    // empty constructor
    public Person() {
    }

    // only age constructor
    public Person(final Integer age) {
        this.age = age;
    }

    // age and weight constructor
    public Person(final Integer age, final Float weight) {
        this.age = age;
        this.weight = weight;
    }

    // public methods
    public Integer getAge() { return this.age; }

    public Float getWeight() { return this.weight; }

    // protected methods
    protected String report() { return "Age: " + age + " and Weight: " + weight; }

}
