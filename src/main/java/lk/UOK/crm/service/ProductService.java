package lk.UOK.crm.service;

import lk.UOK.crm.model.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface ProductService
{
    ProductResponse getProductById(Integer productId);
    Page<ProductResponse> getProducts(Pageable pageable, Integer brandId, Integer typeId, String keyword);
}