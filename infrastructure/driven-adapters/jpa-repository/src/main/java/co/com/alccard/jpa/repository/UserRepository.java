package co.com.alccard.jpa.repository;

import co.com.alccard.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Transactional
    @Modifying
    @Query(value = "insert into alccard.user( id, name, surname, email, telephone, address) values( ?1, ?2, ?3, ?4, ?5, ?6)",
            nativeQuery = true)
    void save(Long id, String name, String surname, String email, String telephone, String address);
}
