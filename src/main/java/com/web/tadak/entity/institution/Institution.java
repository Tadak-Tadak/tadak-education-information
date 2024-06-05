package com.web.tadak.entity.institution;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Institution {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 15)
    private String address;

    @Column(nullable = false, length = 30)
    private String tel;

    @Column(nullable = false, length = 2000)
    private String introduce;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false)
    private Double rating;

    @Column(nullable = false)
    private Double employmentRate;

    @Column(nullable = false, length = 1000)
    private String hrdLink;

    @ManyToOne
    @JoinColumn(name = "trainingInstitution_id", nullable = false)
    private TrainingInstitution trainingInstitution;

    @ManyToOne
    @JoinColumn(name = "certifiedInstitution_id", nullable = false)
    private CertifiedInstitution certifiedInstitution;


}
