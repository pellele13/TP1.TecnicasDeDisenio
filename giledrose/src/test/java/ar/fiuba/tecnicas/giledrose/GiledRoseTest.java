package ar.fiuba.tecnicas.giledrose;

import java.util.ArrayList;
import java.util.Collection;
import ar.fiuba.tecnicas.giledrose.*;
import ar.fiuba.tecnicas.giledroseStrategy.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GiledRoseTest {
	
	private Inventory instance;
	private ArrayList<Item> arreglo;
	
	public void testLessQualityTwoSellInZero() {
		//Setup
		Item itemActual = new Item("Pepe",0,10);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
			
		//Verification rule.
		assertEquals(8, arreglo.get(0).getQuality());
		
	}

	@Test
	public void testLessQualityOneSellInNoZero() {
		//Setup
		Item itemActual = new Item("Pepe",1,10);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);

		instance.updateQuality();	

		//Verification rule.
		assertEquals(9, arreglo.get(0).getQuality());
	}

	@Test
	public void testQualityNeverIsMenorZero() {
		//Setup
		int calidad = 0; 
		int sellIn = 0;
		String nombreProducto = "Backstage";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(0, arreglo.get(0).getQuality());
	}

	@Test
	public void testIncreaseQualityAgedBried() {
		//Setup
		int calidad = 10; 
		int sellIn = 40;
		String nombreProducto = "Aged Brie";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	

		//Verification rule.
		assertEquals(calidad+1, arreglo.get(0).getQuality());
	}

}
