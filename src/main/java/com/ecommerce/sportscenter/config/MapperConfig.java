package com.ecommerce.sportscenter.config;

import com.ecommerce.sportscenter.mapper.OrderMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    OrderMapper orderMapper(){
        return Mappers.getMapper(OrderMapper.class);
    }
}
