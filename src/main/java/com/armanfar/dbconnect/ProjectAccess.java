package com.armanfar.dbconnect;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "project_access")
public class ProjectAccess{

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "EntitySeq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EntitySeq", sequenceName = "ENTITY_SEQ", allocationSize = 20)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "project_id")
    private Long projectId;
}
