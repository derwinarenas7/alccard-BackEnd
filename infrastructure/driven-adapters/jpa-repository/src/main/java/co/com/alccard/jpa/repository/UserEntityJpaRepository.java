package co.com.alccard.jpa.repository;

import co.com.alccard.jpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserEntityJpaRepository extends CrudRepository<UserEntity, Long>, QueryByExampleExecutor<UserEntity> {
}
