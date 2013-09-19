package ar.fiuba.tecnicas.giledroseStrategy;

import ar.fiuba.tecnicas.giledrose.*;

public class UpdateStrategyAgedBrieItem implements UpdateStrategy {

	@Override
	public void update(Item item) {

		if(item.getQuality() < 50){
			item.setQuality(item.getQuality()+1);
		}
	}
	
	
}