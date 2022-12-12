package tn.test.spring.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ref;

    private float dimension;

    @ManyToOne
    private Parking parking;

    @OneToOne
    private Personnel responsable;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Personnel> personnels;

}
