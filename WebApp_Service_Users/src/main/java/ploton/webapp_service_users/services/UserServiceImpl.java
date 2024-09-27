package ploton.webapp_service_users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ploton.webapp_service_users.entities.UserEntity;
import ploton.webapp_service_users.repositories.UserRepository;
import ploton.webapp_service_users.services.UserService;
import ploton.webapp_service_users.utils.EntityUtils;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public UserEntity save(UserEntity entity) {
        return repository.save(entity);
    }

    @Override
    public UserEntity findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User ID - " + id + " Not Found"));
    }

    @Override
    public List<UserEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public UserEntity updateById(Integer id, Map<String, Object> updates) {
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
