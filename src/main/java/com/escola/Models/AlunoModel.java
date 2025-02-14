package com.escola.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private int age;

    public AlunoModel() {}
}
