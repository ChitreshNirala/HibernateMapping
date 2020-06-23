package net.javaguides.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.hibernate.entity.AccountEntity;

public interface AccountEntityRepository extends JpaRepository<AccountEntity, Integer> {

}
