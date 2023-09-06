package com.dakr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.Entity.AuthoritiesEntity;

@Repository
public interface AuthRepository extends JpaRepository<AuthoritiesEntity, Long>{

}
