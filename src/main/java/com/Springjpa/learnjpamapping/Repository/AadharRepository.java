package com.Springjpa.learnjpamapping.Repository;

import com.Springjpa.learnjpamapping.Entities.AadharCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadharRepository extends JpaRepository<AadharCard,Long> {
}
