package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HateosTaxDetail;

@Repository
public interface HateosTaxDetailRepository extends JpaRepository<HateosTaxDetail, String> {

}
