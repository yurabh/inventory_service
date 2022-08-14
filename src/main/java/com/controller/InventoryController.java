package com.controller;

import com.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.FOUND)
    public boolean isInStock(@PathVariable("sku-code") String skuCode) {
        return inventoryService.isInStoke(skuCode);
    }
}
