package tn.test.spring.Entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private int age ;
    private Date dateDeRecrutement;
    private String login;
    private String password;
    private Poste poste;

    @OneToOne(mappedBy = "responsable")
    private Zone zone;


}
