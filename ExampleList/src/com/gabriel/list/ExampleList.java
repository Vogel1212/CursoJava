package com.gabriel.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {

		  // Exemplo de list 
        List<String> lista = new ArrayList<>();
  
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
  
        System.out.println(lista);
    }
}