package lk.UOK.crm.controller;

import lk.UOK.crm.model.BrandResponse;
import lk.UOK.crm.model.ProductResponse;
import lk.UOK.crm.model.TypeResponse;
import lk.UOK.crm.service.BrandService;
import lk.UOK.crm.service.ProductService;
import lk.UOK.crm.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    private final ProductService productService;
    private final BrandService brandService;
    private final TypeService typeService;

    @GetMapping()
    public ResponseEntity<Page<ProductResponse>> getProducts(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "keyword", required = false) String keyword,
            @RequestParam(name = "brandId", required = false) Integer brandId,
            @RequestParam(name = "typeId", required = false) Integer typeId,
            @RequestParam(name = "sort", defaultValue = "name") String sort,
            @RequestParam(name = "order", defaultValue = "asc") String order
    ){
        //Convert order to Sort direction
        Sort.Direction direction = order.equalsIgnoreCase("desc") ? Sort.Direction.DESC: Sort.Direction.ASC;
        Sort sorting = Sort.by(direction, sort);
        Pageable pageable = PageRequest.of(page, size, sorting);

        Page<ProductResponse> productResponses = productService.getProducts(pageable, brandId, typeId, keyword);
        return new ResponseEntity<>(productResponses, HttpStatus.OK);
    }
    @GetMapping("/brands")
    public ResponseEntity<List<BrandResponse>> getBrands(){
        List<BrandResponse> brandResponses = brandService.getAllBrands();
        return new ResponseEntity<>(brandResponses, HttpStatus.OK);
    }

    @GetMapping("/types")
    public ResponseEntity<List<TypeResponse>> getTypes(){
        List<TypeResponse> typeResponses = typeService.getAllTypes();
        return new ResponseEntity<>(typeResponses, HttpStatus.OK);
    }
}
