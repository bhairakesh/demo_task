package com.nic.demo_task.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dist_master")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DistMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dist_code", length = 2, unique = true)
    private String distCode;

    @Column(name = "dist_name", length = 125, nullable = false)
    private String distName;

}
