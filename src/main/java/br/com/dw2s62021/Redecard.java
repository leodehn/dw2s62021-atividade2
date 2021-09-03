package br.com.dw2s62021;

import org.springframework.stereotype.Component;

@Component
public class Redecard implements Operadora{

	@Override
	public boolean autorizar(Compra compra, Cartao cartao) {
		boolean resultado = false;
		String inicio = cartao.getNumeroCartao().substring(0, 4);

		if(inicio.equalsIgnoreCase("1234")&&compra.getValorTotal()<1000) {
			resultado = true;
		}

		return resultado;
	}

	

}
