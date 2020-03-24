package com.nihanim.repositories;

import com.nihanim.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Long, Owner> {

    List<Owner> findAllByLastName(String lastName);

}
