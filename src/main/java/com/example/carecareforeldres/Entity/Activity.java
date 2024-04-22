package com.example.carecareforeldres.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Activity")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivity;

    private String nomActivity;
    private String image ;

    private LocalDate dateActivity;

    @Enumerated(EnumType.STRING)
    private TypeActivity typeActivity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Patient Patienttt ;
    // @OneToMany(cascade = CascadeType.ALL, mappedBy="activity")
    //  private List<User> Users;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="activity")
    private List<Organisateur> Organisateurs = new ArrayList<>();

}