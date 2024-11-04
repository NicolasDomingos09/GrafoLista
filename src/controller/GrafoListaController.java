package controller;

import model.estrutura.grafo.GrafoLista;

public class GrafoListaController{
	public GrafoListaController(){
		super();
	}
	
	public String teste() throws Exception{
		GrafoLista<Object> g = new GrafoLista<Object>();
		
		//g.add(0,1);
		// g.add(0,4);
		// g.add(1,2);
		// g.add(1,3);
		// g.add(1,4);
		// g.add(2,3);
		// g.add(3,4);
		
		 g.add("B","A");
		 g.add("B","C");
		 g.add("A","D");
		 g.add("A","F");
		 g.add("C","I");
		 g.add("C","J");
		 g.add("D","G");
		 g.add("D","H");
		 g.add("D","I");
		 g.add("F","H");
		 g.add("F","K");
		 g.add("E","J");
		 g.add("J","N");
		 g.add("J","I");
		 g.add("G","L");
		 g.add("H","O");
		 g.add("H","E");
		 g.add("L","M");
		 g.add("L","K");
		 g.add("M","N");
		 g.add("N","O");
	
		return g.toString();
	}
}

