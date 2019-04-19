package com.bar.barmanagement.domain.mapper;

import com.bar.barmanagement.model.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-18T23:10:38+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl extends ProductMapper {

    @Override
    public com.bar.barmanagement.domain.dto.Product toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        com.bar.barmanagement.domain.dto.Product product1 = new com.bar.barmanagement.domain.dto.Product();

        product1.setId( product.getId() );
        product1.setName( product.getName() );
        product1.setCategory( product.getCategory() );
        product1.setPrice( product.getPrice() );

        return product1;
    }

    @Override
    public Product toEntity(com.bar.barmanagement.domain.dto.Product product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setId( product.getId() );
        product1.setName( product.getName() );
        product1.setCategory( product.getCategory() );
        product1.setPrice( product.getPrice() );

        return product1;
    }

    @Override
    public List<com.bar.barmanagement.domain.dto.Product> toDtos(List<Product> product) {
        if ( product == null ) {
            return null;
        }

        List<com.bar.barmanagement.domain.dto.Product> list = new ArrayList<com.bar.barmanagement.domain.dto.Product>( product.size() );
        for ( Product product1 : product ) {
            list.add( toDto( product1 ) );
        }

        return list;
    }

    @Override
    public List<Product> toEntities(List<com.bar.barmanagement.domain.dto.Product> product) {
        if ( product == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( product.size() );
        for ( com.bar.barmanagement.domain.dto.Product product1 : product ) {
            list.add( toEntity( product1 ) );
        }

        return list;
    }
}
