package org.zstack.sdk;

import org.zstack.sdk.PriceTableInventory;

public class ChangeAccountPriceTableBindingResult {
    public PriceTableInventory inventory;
    public void setInventory(PriceTableInventory inventory) {
        this.inventory = inventory;
    }
    public PriceTableInventory getInventory() {
        return this.inventory;
    }

}
