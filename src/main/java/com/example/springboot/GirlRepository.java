package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
}
