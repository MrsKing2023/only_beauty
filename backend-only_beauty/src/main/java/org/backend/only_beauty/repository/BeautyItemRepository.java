package org.backend.only_beauty.repository;

import org.backend.only_beauty.models.BeautyItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeautyItemRepository extends JpaRepository<BeautyItemEntity, Long> {
}
