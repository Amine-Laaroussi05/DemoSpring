package ib.demoSpring.entity;

import javax.persistence.*;

@Entity
public class Pianiste implements Musicien{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="nom")
    private String nom;

    @OneToOne
    @JoinColumn(name="piano_id")
    private Piano instrument;



    public Pianiste() {
    }

    public Pianiste(String nom, Instrument instrument) {
        this.nom = nom;
        this.instrument = (Piano) instrument;
    }

    public Pianiste(Long id, String nom, Instrument instrument) {
        this.id = id;
        this.nom = nom;
        this.instrument = (Piano) instrument;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = (Piano) instrument;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void jouer() {
        System.out.println(this.getNom() + " joue: " + this.getInstrument());
    }
}
