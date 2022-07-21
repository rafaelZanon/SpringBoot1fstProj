package br.com.rafael.cliente.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cl_nome", nullable = false)
    private String nome;

    @Column(name = "cl_email")
    private String email;

    @Column (name = "cl_cpf")
    private String cpf;
}
