package ploton.webapp_service_order.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.Map;

@Slf4j
public class EntityUtils {
    public static <T> T updateEntity(T entity, Map<String, Object> updates) {
        try {
            Class clazz = entity.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (updates.containsKey(field.getName())) {
                    field.setAccessible(true);
                    field.set(entity, updates.get(field.getName()));
                }
            }
            return entity;
        } catch (IllegalAccessException e) {
            log.warn("updateEntity error: " + e.getMessage());
        }
        return entity;
    }
}
