package br.com.projeto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
