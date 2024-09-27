package ploton.webapp_service_users.services;

import ploton.webapp_service_users.entities.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserEntity save(UserEntity entity);

    UserEntity findById(Integer id);

    List<UserEntity> findAll();

    UserEntity updateById(Integer id, Map<String, Object> updates);

    Integer deleteById(Integer id);

}
