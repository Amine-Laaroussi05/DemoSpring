package ib.demoSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guitare implements Instrument{

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "modelGuitare")
    private String model;

    public Guitare() {
    }

    public Guitare(String model) {
        this.model = model;
    }

    public Guitare(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guitare{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
