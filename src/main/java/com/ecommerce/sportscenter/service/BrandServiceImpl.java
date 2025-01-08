package com.ecommerce.sportscenter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.model.BrandResponse;
import com.ecommerce.sportscenter.repository.BrandRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandResponse> getAllBrands() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllBrands'");
    }

    // @Override
    // public List<BrandResponse> getAllBrands() {
    //     log.info("Fetching All Brands!!!");
    //     //Fetch Brands
    //     List<Brand> brandList = brandRepository.findAll();
    //     //now use stream operator to map with Response
    //     List<BrandResponse> brandResponses = brandList.stream()
    //             .map(this::convertToBrandResponse)
    //             .collect(Collectors.toList());
    //     log.info("Fetched All Brands!!!");
    //     return brandResponses;
    // }

    // private BrandResponse convertToBrandResponse(Brand brand) {
    //     return BrandResponse.builder()
    //             .id(brand.getId())
    //             .name(brand.getName())
    //             .build();
    // }
}
