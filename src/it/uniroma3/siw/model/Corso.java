package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable = false)
    private String nome;
    
    @Column
    private LocalDate dataInizio;
    
    @Column
    private int durataInMesi;
    
    @ManyToMany (mappedBy = "corsi", fetch = FetchType.LAZY)
    private List<Allievo> allievi;
    
    @ManyToOne (fetch = FetchType.EAGER)
    private Docente docente;
}
