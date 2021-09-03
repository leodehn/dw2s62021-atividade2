package br.com.dw2s62021.config;

import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import br.com.dw2s62021.operadoras.Cielo;
//import br.com.dw2s62021.operadoras.Operadora;

@Configuration
@ComponentScan("br.com.dw2s62021")
public class AppConfig {
	
//	@Bean
//	public Operadora operadora() {
//		return new Cielo();
//	}
//	
//	@Bean
//	public Checkout chekout(Operadora operadora) {
//		return new Checkout(operadora);
//	}

}
