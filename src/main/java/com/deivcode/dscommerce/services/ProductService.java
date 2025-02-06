package com.deivcode.dscommerce.services;

import com.deivcode.dscommerce.dto.ProductDTO;
import com.deivcode.dscommerce.entities.Product;
import com.deivcode.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(long id){
        Optional<Product> result = repository.findById(id);
        return new ProductDTO(result.get());
    }
}
