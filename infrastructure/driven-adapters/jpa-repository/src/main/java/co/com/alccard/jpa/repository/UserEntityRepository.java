package co.com.alccard.jpa.repository;

import co.com.alccard.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
}
