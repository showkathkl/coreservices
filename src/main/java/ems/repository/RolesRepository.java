package ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.models.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
