package ib.demoSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Piano implements Instrument{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="modelPiano")
    private String model;

    public Piano() {
    }

    public Piano(String model) {
        this.setModel(model);
    }

    public Piano(Long id, String model) {
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
        return "Pling Pling Pling";
    }
}
