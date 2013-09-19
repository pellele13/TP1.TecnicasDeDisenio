package ar.fiuba.tecnicas.giledroseStrategy;

import ar.fiuba.tecnicas.giledrose.*;

public class UpdateStrategyConjuredItem implements UpdateStrategy{

	@Override
	public void update(Item item) {

		if(item.getQuality() > 0){
			item.setQuality(item.getQuality()-2);
		}
	}	

}
