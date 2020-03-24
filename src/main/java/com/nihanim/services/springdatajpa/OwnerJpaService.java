package com.nihanim.services.springdatajpa;

import com.nihanim.model.Owner;
import com.nihanim.repositories.OwnerRepository;
import com.nihanim.services.OwnerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;


    public List<Owner> findByLastName(String lastName) {
        return ownerRepository.findAllByLastName(lastName);
    }
}