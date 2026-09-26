package br.edu.ifpi.api_produtos;

// Representa os dados de um aluno. O record fornece construtor e acessores.
public record Produto(Long id, String nome, String categoria, Double preco) {
}