package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable = false)
    private String nome;
    
    @Column (nullable = false)
    private String cognome;
    
	@Column
	private LocalDate dataNascita;
	
	@Column
	private String luogoNascita;
	
	@Column (unique = true)
	private String partitaIva;
	
	@OneToMany (mappedBy = "docente", fetch = FetchType.LAZY)
	private List<Corso> corsi;
}
