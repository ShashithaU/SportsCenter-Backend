package com.ecommerce.sportscenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportscenter.entity.Product;
import com.ecommerce.sportscenter.service.BrandService;
import com.ecommerce.sportscenter.service.ProductService;
import com.ecommerce.sportscenter.service.TypeService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    private final BrandService brandService;
    private final TypeService typeService;

    public ProductController(ProductService productService, BrandService brandService, TypeService typeService) {
        this.productService = productService;
        this.brandService = brandService;
        this.typeService = typeService;
    }

    @PostMapping("/save")
    public Product save (@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/all")
    public Iterable<Product> all(){
        return productService.getAllProducts();
    }
    // @GetMapping("/{id}")
    // public ResponseEntity<ProductResponse> getProductById(@PathVariable("id")Integer productId){
    //     ProductResponse productResponse = productService.getProductById(productId);
    //     return new ResponseEntity<>(productResponse, HttpStatus.OK);
    // }
    // @GetMapping()
    // public ResponseEntity<Page<ProductResponse>> getProducts(
    //         @RequestParam(name = "page", defaultValue = "0") int page,
    //         @RequestParam(name = "size", defaultValue = "10") int size,
    //         @RequestParam(name = "keyword", required = false) String keyword,
    //         @RequestParam(name = "brandId", required = false) Integer brandId,
    //         @RequestParam(name = "typeId", required = false) Integer typeId,
    //         @RequestParam(name = "sort", defaultValue = "name") String sort,
    //         @RequestParam(name = "order", defaultValue = "asc") String order
    //         ){
    //     //Convert order to Sort direction
    //     Sort.Direction direction = order.equalsIgnoreCase("desc") ? Sort.Direction.DESC: Sort.Direction.ASC;
    //     Sort sorting = Sort.by(direction, sort);
    //     Pageable pageable = PageRequest.of(page, size, sorting);

    //     Page<ProductResponse> productResponses = productService.getProducts(pageable, brandId, typeId, keyword);
    //     return new ResponseEntity<>(productResponses, HttpStatus.OK);
    // }
    // @GetMapping("/brands")
    // public ResponseEntity<List<BrandResponse>> getBrands(){
    //     List<BrandResponse> brandResponses = brandService.getAllBrands();
    //     return new ResponseEntity<>(brandResponses, HttpStatus.OK);
    // }

    // @GetMapping("/types")
    // public ResponseEntity<List<TypeResponse>> getTypes(){
    //     List<TypeResponse> typeResponses = typeService.getAllTypes();
    //     return new ResponseEntity<>(typeResponses, HttpStatus.OK);
    // }
}
