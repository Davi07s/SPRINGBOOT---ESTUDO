package br.edu.ifpi.api_produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marca a classe principal e habilita a configuração da aplicação.
@SpringBootApplication
public class ApiProdutosApplication {
    public static void main(String[] args) {
        // Inicializa o Spring Boot e o servidor Web.
        SpringApplication.run(ApiProdutosApplication.class, args);
    }
}
