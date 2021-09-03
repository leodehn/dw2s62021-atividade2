package br.com.dw2s62021;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {
	
	@Autowired
	@Qualifier("cielo")
	private Operadora operadora;

//	public Checkout(Operadora operadora) {
//		super();
//		this.operadora = operadora;
//	}

	public void finalizar(Compra compra,Cartao cartao){
	
		if(operadora.autorizar(compra, cartao)) {
			System.out.println("autorizado");
		}else{
			System.out.println("não autorizado");
		}
		
	}
	
}
