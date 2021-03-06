package ar.edu.unju.edm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;
@Controller

public class CalculadoraController {
	@Autowired
Calculadora unaCalculadora;

	@GetMapping("/calculadora")
	public String getMenuCalculadora(Model model) {
		return("calculadora");
	}
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setA(Integer.valueOf(num1));
		unaCalculadora.setB(num2);
		
		float resultadoSuma = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setA(Integer.valueOf(num1));
		unaCalculadora.setB(num2);
		
		float resultadoResta = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoResta", resultadoResta);
		
		return modelView;
	}
	@GetMapping("/calculoMultiplicacion")
	public ModelAndView getCalculoMultiplicacion(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setA(Integer.valueOf(num1));
		unaCalculadora.setB(num2);
		
		float resultadoMultiplicacion = unaCalculadora.multiplicar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoMultiplicacion", resultadoMultiplicacion);
		
		return modelView;
	}
	@GetMapping("/calculoDivision")
	public ModelAndView getCalculoDivision(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") float num2){
		
		unaCalculadora.setA(Integer.valueOf(num1));
		unaCalculadora.setB(num2);
		
		float resultadoDivision = unaCalculadora.dividir();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoDivision", resultadoDivision);
		
		return modelView;
	}	
	
	public void resolverOperaciones() {
		
		float num1;
		float num2;
		num1 = 65;
		num2 = 8;
		

		Calculadora nuevaCalculadora = new Calculadora ();
		nuevaCalculadora.setA(num1);
		nuevaCalculadora.setB(num2);

		System.out.println("El resultado de la suma es: " + nuevaCalculadora.sumar() );
	    System.out.println("El resultado de la division es: " + nuevaCalculadora.dividir());
		
		}
}
