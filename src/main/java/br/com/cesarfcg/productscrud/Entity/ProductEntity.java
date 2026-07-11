package br.com.cesarfcg.productscrud.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.bind.Name;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long id;

    @NotBlank
    @Column(name = "PRO_NAME")
    private String name;

    @NotBlank
    @Column(name = "PRO_DESCRIPTION")
    private String description;

    @NotNull
    @PositiveOrZero
    @Column(name = "PRO_PRICE")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private CategoryEntity category;

}
