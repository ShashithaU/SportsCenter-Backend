package com.ecommerce.sportscenter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.model.TypeResponse;
import com.ecommerce.sportscenter.repository.TypeRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class TypeServiceImpl implements TypeService {
    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<TypeResponse> getAllTypes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTypes'");
    }

    // @Override
    // public List<TypeResponse> getAllTypes() {
    //     log.info("Fetching All Types!!!");
    //     //Fetch Types from DB
    //     List<Type> typeList = typeRepository.findAll();
    //     //now use stream operator to map with Response
    //     List<TypeResponse> typeResponses = typeList.stream()
    //             .map(this::convertToTypeResponse)
    //             .collect(Collectors.toList());
    //     return typeResponses;
    // }

    // private TypeResponse convertToTypeResponse(Type type) {
    //     return TypeResponse.builder()
    //             .id(type.getId())
    //             .name(type.getName())
    //             .build();
    // }
}
