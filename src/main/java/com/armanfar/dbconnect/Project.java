package com.armanfar.dbconnect;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "EntitySeq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EntitySeq", sequenceName = "ENTITY_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "project_name")
    private String name;

    @Column(name = "project_leader")
    private String projectLeader;

    @Column(name = "division_manager")
    private String divisionManager;

    @OneToMany(targetEntity = ProjectAccess.class)
    @JoinColumn(name = "project_id")
    private Set<ProjectAccess> access;

    @Column(name = "client")
    private String client;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @Column(name = "market_unit_contact")
    private String marketUnitContact;

    @Column(name = "market_unit")
    @Enumerated(EnumType.STRING)
    private Divisions marketUnit;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @Column(name = "probability_sp")
    private Double probabilitySP;

    @Column(name = "technology_stack")
    private String technologyStack;

    @Column(name = "psp")
    private String psp;

    @Column(name = "further_info")
    private String furtherInfo;

    @Column(name = "share_point_id")
    private Long sharePointId;

    @Column(name = "annotation")
    private String annotation;

    @Column(name = "description")
    private String description;

    @Column(name = "last_modified_at")
    private LocalDateTime lastModifiedAt;
}

