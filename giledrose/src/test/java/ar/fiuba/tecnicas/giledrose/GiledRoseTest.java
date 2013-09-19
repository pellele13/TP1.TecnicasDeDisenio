package ar.fiuba.tecnicas.giledrose;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GiledRoseTest {
	
	private Inventory instance;
	private ArrayList<Item> arreglo;
	
	@Test
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

	@Test
	public void testQualityNeverIsMayorFifty() {
		//Setup
		int calidad = 50; 
		int sellIn = 5;
		String nombreProducto = "Backstage passes to a TAFKAL80ETC concert";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(50, arreglo.get(0).getQuality());
	}
	
	@Test
	public void testLegendaryItemSellInIsZero() {
		//Setup
		int calidad = 10; 
		int sellIn = 0;
		String nombreProducto = "Sulfuras, Hand of Ragnaros";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(sellIn, arreglo.get(0).getSellIn());
	}

	@Test
	public void testLegendaryItemQualityInIsEighty() {
		//Setup
		int calidad = 10; 
		int sellIn = 0;
		String nombreProducto = "Sulfuras, Hand of Ragnaros";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(80, arreglo.get(0).getQuality());
	}

	@Test
	public void testIncreaseQualityLessTenDaysBackstagePasses() {
		//Setup
		int calidad = 10; 
		int sellIn = 10;
		String nombreProducto = "Backstage passes to a TAFKAL80ETC concert";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(calidad+2, arreglo.get(0).getQuality());
	}

	@Test
	public void testIncreaseQualityLessFiveDaysBackstagePasses() {
		//Setup
		int calidad = 10; 
		int sellIn = 5;
		String nombreProducto = "Backstage passes to a TAFKAL80ETC concert";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(calidad+3, arreglo.get(0).getQuality());
	}

	@Test
	public void testQualityWhenSellInIsZeroBackstagePasses() {
		//Setup
		int calidad = 10; 
		int sellIn = 0;
		String nombreProducto = "Backstage passes to a TAFKAL80ETC concert";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(0, arreglo.get(0).getQuality());
	}
	
	@Test
	public void testQualityInIsConjured() {
		//Setup
		int calidad = 10; 
		int sellIn = 3;
		String nombreProducto = "Conjured Mana Cake";
		Item itemActual = new Item(nombreProducto,sellIn,calidad);
		arreglo = new ArrayList<Item>();
		arreglo.add(itemActual);
		instance = new Inventory(arreglo);
		
		instance.updateQuality();	
		
		//Verification rule.
		assertEquals(8, arreglo.get(0).getQuality());
	}
	
}
