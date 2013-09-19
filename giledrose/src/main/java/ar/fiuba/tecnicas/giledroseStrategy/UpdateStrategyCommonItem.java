package ar.fiuba.tecnicas.giledroseStrategy;

import ar.fiuba.tecnicas.giledrose.*;

public class UpdateStrategyCommonItem implements UpdateStrategy{

	@Override
	public void update(Item item) {

		if(item.getQuality() > 0){
			if(item.getSellIn() < 0){
				item.setQuality(item.getQuality()-2);
			}else{
				item.setQuality(item.getQuality()-1);
			}
		}
	}

	
}
