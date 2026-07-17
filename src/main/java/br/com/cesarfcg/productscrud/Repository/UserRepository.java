package br.com.cesarfcg.productscrud.Repository;

import br.com.cesarfcg.productscrud.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Long, UserEntity> {
    Optional<UserDetails> findByEmail(String login);
}
