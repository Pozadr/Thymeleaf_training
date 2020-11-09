package pl.pozadr.thymeleafhello.model;

public class Car {
    private Long id;
    private String mark;
    private String model;

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

}
