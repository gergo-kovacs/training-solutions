package interfacemethods;

import java.time.LocalDateTime;

//mikor került létrehozásra az entitás
public interface Audited {

    LocalDateTime getCreatedAt();

    default boolean createdAfter(LocalDateTime dateTime) {
        return getCreatedAt().isAfter(dateTime);
    }
}
