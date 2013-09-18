package ar.fiuba.tecnicas.giledrose;

import java.util.ArrayList;
import java.util.Collection;

public class Inventory {
    private Collection<Item> items;

	public Inventory(Collection<Item> items) {
        this.items = items;
    }

    public Inventory() {
    	this.items = new ArrayList<Item>();
    }

    public void updateQuality() {
    	//refactor del metodo usando patron de diseño a definir.
    }

    public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}
}
