package pl.pozadr.thymeleafhello.model;

public class Car {
    public Long id;
    public String mark;
    public String model;

    public Car() {
    }


    public Car(Long id, String mark, String model) {
        this.id = id;
        this.model = model;
        this.mark = mark;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
