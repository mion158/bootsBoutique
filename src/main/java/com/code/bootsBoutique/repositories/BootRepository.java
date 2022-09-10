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
    public List<Boot> findByMaterialAndTypeAndSizeAndQuantityGreaterThan(String material, BootType type, float size, Integer minQuantity);
    public List<Boot> findByMaterialAndTypeAndSize(String material, BootType type, float size);
    public List<Boot> findByMaterialAndTypeAndQuantityGreaterThan(String material, BootType type, Integer minQuantity);
    public List<Boot> findByMaterialAndType(String material, BootType type);
}
