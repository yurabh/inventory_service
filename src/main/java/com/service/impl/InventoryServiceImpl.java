package com.service.impl;

import com.domain.Inventory;
import com.repository.InventoryRepository;
import com.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStoke(String skuCode) {
        log.info("wait started");
        sleepMethod();
        log.info("wait finished");
        Optional<Inventory> inventory = inventoryRepository.findBySkuCode(skuCode);
        return inventory.filter(value -> value.getStock() > 0).isPresent();
    }

    private void sleepMethod() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
