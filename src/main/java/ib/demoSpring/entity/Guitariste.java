package ib.demoSpring.entity;

import javax.persistence.*;

@Entity
public class Guitariste implements Musicien{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nom")
    private String nom;

    @OneToOne
    @JoinColumn(name = "guitare_id")
    private Guitare instrument;



    public Guitariste() {
    }


    public Guitariste(String nom, Instrument instrument) {
        this.nom = nom;
        this.instrument = (Guitare) instrument;
    }

    public Guitariste(String nom, Instrument instrument, Long id) {
        this.nom = nom;
        this.instrument = (Guitare) instrument;
        this.id = id;
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
        this.instrument = (Guitare) instrument;
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
