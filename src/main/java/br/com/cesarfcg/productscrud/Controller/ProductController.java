package br.com.cesarfcg.productscrud.Controller;

import br.com.cesarfcg.productscrud.Dto.ProductRequestDTO;
import br.com.cesarfcg.productscrud.Dto.ProductResponseDTO;
import br.com.cesarfcg.productscrud.Entity.ProductEntity;
import br.com.cesarfcg.productscrud.Service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductsService productsService;

    public ProductController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/list")
    public List<ProductEntity> list(){
        return productsService.list();
    }
    @PostMapping("/create")
    public ProductResponseDTO create(@RequestBody ProductRequestDTO productRequestDTO){
        return productsService.create(productRequestDTO);
    }
    @PutMapping("/update/{id}")
    public ProductResponseDTO update(@PathVariable("id") Long id ,@RequestBody ProductRequestDTO dto){
        return productsService.update(id,dto);
    }
    @DeleteMapping("/delete/{id}")
    public List<ProductEntity> delete(@PathVariable("id")Long id ){
        return productsService.delete(id);
    }
}
