/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project1.Project1Market.interfaces;

import com.Project1.Project1Market.models.InventoryBuy;
import com.Project1.Project1Market.models.InventorySell;
import java.util.List;

/**
 *
 * @author Victorio Adam
 */
public interface InventoryBuyInterface {
    List<InventoryBuy> getAll();
    
    void store(InventoryBuy inventoryBuy, String );
    InventoryBuy getById(long id);
    void delete(long id, long user_id);
}