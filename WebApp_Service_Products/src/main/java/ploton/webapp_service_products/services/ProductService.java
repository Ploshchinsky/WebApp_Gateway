package ploton.webapp_service_products.services;

import ploton.webapp_service_products.entities.ProductEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {
    ProductEntity findById(Integer id);

    List<ProductEntity> findAll();

    ProductEntity save(ProductEntity entity);

    ProductEntity updateById(Integer id, Map<String, Object> updates);

    Integer deleteById(Integer id);
}
