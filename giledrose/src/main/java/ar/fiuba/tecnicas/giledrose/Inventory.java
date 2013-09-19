package ar.fiuba.tecnicas.giledrose;

import java.util.ArrayList;
import java.util.Collection;

import ar.fiuba.tecnicas.giledroseStrategy.*;

public class Inventory {
    private Collection<Item> items;

	public Inventory(Collection<Item> items) {
        this.items = items;
    }

    public Inventory() {
    	this.items = new ArrayList<Item>();
    }

    public void updateQuality() {
		UpdateStrategy updateStrategy = null;
		
		for(Item item:items){
			
			item.setSellIn(item.getSellIn()-1);
			
			if(item.getName() == "Aged Brie"){
				updateStrategy = new UpdateStrategyAgedBrieItem();
			}else if (item.getName() == "Backstage passes to a TAFKAL80ETC concert"){
				updateStrategy = new UpdateStrategyBackstagePassesItem();
			}else if (item.getName() == "Sulfuras, Hand of Ragnaros"){
				updateStrategy = new UpdateStrategySulfurasItem();
			}else if (item.getName() == "Conjured Mana Cake"){
				updateStrategy = new UpdateStrategyConjuredItem();
			}else{
				updateStrategy = new UpdateStrategyCommonItem();
			}

			updateStrategy.update(item);
		}

    }

    public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}
}
