package ploton.webapp_service_order.services;

import ploton.webapp_service_order.entities.OrderEntity;

import java.util.List;
import java.util.Map;

public interface OrderService {
    OrderEntity findById(Integer id);

    List<OrderEntity> findAll();

    OrderEntity save(OrderEntity entity);

    OrderEntity updateById(Integer id, Map<String, Object> updates);

    Integer deleteById(Integer id);
}
