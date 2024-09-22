package com.example.redis_ms.controller;

import java.util.Arrays;

import com.example.redis_ms.model.Inventory;
import com.example.redis_ms.model.Item;
import com.example.redis_ms.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PostgresInventoryController {

    @GetMapping("/redisInventory")
    public Inventory getInventory() {
        return new Inventory(Arrays.asList(
            new Stock(Item.TV, 440L),
            new Stock(Item.FRIDGE, 440L),
            new Stock(Item.WASHING_MACHINE, 440L)
        ));
    }
}
