package com.mx.skeleton.persistence.crud;

import com.mx.skeleton.persistence.entity.BitacoraOperacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBitacoraOperacionRepository extends JpaRepository<BitacoraOperacion,Long> {
}
