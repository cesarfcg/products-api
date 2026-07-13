package br.com.cesarfcg.productscrud.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TB_CATEGORIA")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    Long id;
    @Column(name = "CAT_NAME")
    String name;

}
