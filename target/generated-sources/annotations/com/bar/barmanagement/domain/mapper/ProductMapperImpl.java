package com.bar.barmanagement.domain.mapper;

import com.bar.barmanagement.domain.dto.ProductDto;
import com.bar.barmanagement.model.entity.ProductEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-20T13:38:42+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public ProductDto toDto(ProductEntity product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( product.getId() );
        productDto.setName( product.getName() );
        productDto.setCategory( product.getCategory() );
        productDto.setPrice( product.getPrice() );

        return productDto;
    }

    @Override
    public ProductEntity toEntity(ProductDto product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( product.getId() );
        productEntity.setName( product.getName() );
        productEntity.setCategory( product.getCategory() );
        productEntity.setPrice( product.getPrice() );

        return productEntity;
    }

    @Override
    public List<ProductDto> toDtos(List<ProductEntity> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( product.size() );
        for ( ProductEntity productEntity : product ) {
            list.add( toDto( productEntity ) );
        }

        return list;
    }

    @Override
    public List<ProductEntity> toEntities(List<ProductDto> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductEntity> list = new ArrayList<ProductEntity>( product.size() );
        for ( ProductDto productDto : product ) {
            list.add( toEntity( productDto ) );
        }

        return list;
    }
}
