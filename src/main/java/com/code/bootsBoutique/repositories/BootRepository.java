package com.code.bootsBoutique.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.code.bootsBoutique.entities.Boot;
import com.code.bootsBoutique.enums.BootType;

public interface BootRepository extends CrudRepository<Boot, Integer>{
    public List<Boot> findBySize(float size);
    public List<Boot> findByMaterial(String material);
    public List<Boot> findByType(BootType type);
    public List<Boot> findByQuantityGreaterThan(Integer minQuantity);
    public List<Boot> findByMaterialAndQuantityGreaterThan(String material, Integer minQuantity);
    public List<Boot> findByMaterialAndSizeAndQuantityGreaterThan(String material, Float size, Integer minQuantity);
    public List<Boot> findByTypeAndSizeAndQuantityGreaterThan(BootType type, Float size, Integer minQuantity);
    public List<Boot> findByTypeAndQuantityGreaterThan(BootType type, Integer minQuantity);
}
