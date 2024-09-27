package ploton.webapp_service_order.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ploton.webapp_service_order.entities.OrderEntity;
import ploton.webapp_service_order.repositories.OrderRepository;
import ploton.webapp_service_order.utils.EntityUtils;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;

    @Override
    public OrderEntity findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Product ID - " + id + " Not Found"));
    }

    @Override
    public List<OrderEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public OrderEntity save(OrderEntity entity) {
        return repository.save(entity);
    }

    @Override
    public OrderEntity updateById(Integer id, Map<String, Object> updates) {
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
