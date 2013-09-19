package ar.fiuba.tecnicas.giledroseStrategy;

import ar.fiuba.tecnicas.giledrose.Item;
import ar.fiuba.tecnicas.giledroseStrategy.*;

public class UpdateStrategyBackstagePassesItem implements UpdateStrategy {

	@Override
	public void update(Item item) {

		if(item.getQuality() < 50){
			if(item.getSellIn() <= 0){
				item.setQuality(0);
			}else if(item.getSellIn() < 6){
				item.setQuality(item.getQuality()+3);
			}else if(item.getSellIn() < 11){
				item.setQuality(item.getQuality()+2);
			}else{
				item.setQuality(item.getQuality()+1);
			}
		}
		if(item.getQuality() > 50){
			item.setQuality(50);
		}
	}
	
	
}