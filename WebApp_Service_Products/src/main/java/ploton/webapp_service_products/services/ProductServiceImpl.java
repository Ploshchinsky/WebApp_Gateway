package ploton.webapp_service_products.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ploton.webapp_service_products.entities.ProductEntity;
import ploton.webapp_service_products.repositories.ProductRepository;
import ploton.webapp_service_products.utils.EntityUtils;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    @Override
    public ProductEntity findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Product ID - " + id + " Not Found"));
    }

    @Override
    public List<ProductEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductEntity save(ProductEntity entity) {
        return repository.save(entity);
    }

    @Override
    public ProductEntity updateById(Integer id, Map<String, Object> updates) {
        return EntityUtils.updateEntity(findById(id), updates);
    }

    @Override
    public Integer deleteById(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return id;
        }
        return -1;
    }
}
