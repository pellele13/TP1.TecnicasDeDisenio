package ar.fiuba.tecnicas.giledroseStrategy;

import ar.fiuba.tecnicas.giledrose.*;

public class UpdateStrategySulfurasItem implements UpdateStrategy{

	@Override
	public void update(Item item) {
		
		item.setSellIn(0);
		item.setQuality(80);
	}
}
