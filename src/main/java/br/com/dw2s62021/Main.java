package br.com.dw2s62021;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.dw2s62021.config.AppConfig;

//import br.com.dw2s62021.operadoras.Cielo;
//import br.com.dw2s62021.operadoras.Operadora;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Compra compra1 = new Compra(123,"Antonio","Banana",200);
		Compra compra2 = new Compra(124,"Antonio","Maçã",999);
		Compra compra3 = new Compra(125,"Antonio","Batata",2000);
		Compra compra4 = new Compra(126,"Antonio","Kiwi",2300);
		
		Cartao roxinho = new Cartao("123456","Antonio","06/23");
		Cartao amarelinho = new Cartao("122456","Antonio","06/23");
		
		//Operadora cielo = new Cielo();
		
		Checkout checkout = context.getBean(Checkout.class);
		
		checkout.finalizar(compra1, roxinho);//autorizado
		checkout.finalizar(compra2, amarelinho);//nao autorizado
		checkout.finalizar(compra3, roxinho);//nao autorizado
		checkout.finalizar(compra4, amarelinho);//nao autorizado
		
		((ConfigurableApplicationContext) context).close();
		
		
	}
	
}
