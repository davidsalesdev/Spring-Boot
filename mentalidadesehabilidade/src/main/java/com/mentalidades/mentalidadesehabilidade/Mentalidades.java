package com.mentalidades.mentalidadesehabilidade;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mentalidades")

public class Mentalidades {

	@GetMapping
	
	public ArrayList<String> hello() {
		
		return new ArrayList<>(Arrays.asList("Atenção aos Detalhes", "Proatividade", "Persistência"));
	
	}
	
	
	

}