package ib.demoSpring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cornemuse implements Instrument {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="modelCornemuse")
    private String model;

    public Cornemuse() {
    }

    public Cornemuse(String model) {
        this.setModel(model);
    }

    public Cornemuse(Long id, String model) {
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
        return "Tu tu tu";
    }
}
