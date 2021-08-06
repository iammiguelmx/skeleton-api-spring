package com.mx.skeleton.persistence.crud;

import com.mx.skeleton.persistence.entity.BitacorraError;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBitacoraErrorRepository extends JpaRepository<BitacorraError, Long> {
}
