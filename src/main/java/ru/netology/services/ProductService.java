package ru.netology.services;

import org.springframework.stereotype.Service;
import ru.netology.repository.DataBaseRepository;

import java.util.List;

@Service
public class ProductService {

    private final DataBaseRepository dataBaseRepository;

    public ProductService(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public List<String> getProductName(String name) {
        return dataBaseRepository.getProductName(name);
    }
}
