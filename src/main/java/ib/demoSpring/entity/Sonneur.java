package ib.demoSpring.entity;

import javax.persistence.*;

@Entity
public class Sonneur implements Musicien{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="nom")
    private String nom;

    @OneToOne
    @JoinColumn(name="cornemuse_id")
    private Cornemuse instrument;



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
        this.instrument = (Cornemuse) instrument;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sonneur() {
    }

    public Sonneur(String nom) {
        this.setNom(nom);
    }

    public Sonneur(Long id, String nom, Instrument instrument) {
        this.id = id;
        this.nom = nom;
        this.instrument = (Cornemuse) instrument;
    }

    public Sonneur(String nom, Instrument instrument) {
        this.setNom(nom);
        this.setInstrument(instrument);
    }

    public void jouer(){
        System.out.println(this.getNom() + " joue: " + this.getInstrument());
    }
}
