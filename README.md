# Spring Boot — Estudos

Repositório destinado ao armazenamento de **projetos, exercícios, exemplos e atividades desenvolvidos durante os estudos de Spring Boot** na disciplina de **Programação para Dispositivos Móveis**.

O objetivo deste repositório é registrar a evolução prática no desenvolvimento de aplicações backend utilizando Java e Spring Boot, desde os conceitos fundamentais até recursos mais avançados do framework.

---

## 📚 Sobre o repositório

Este repositório funciona como um espaço de estudos e acompanhamento da evolução durante a disciplina.

Os projetos são desenvolvidos de forma progressiva, permitindo aplicar na prática os conceitos apresentados em aula.

Entre os conteúdos estudados estão:

* Criação de aplicações Spring Boot;
* Estrutura de projetos Java;
* APIs REST;
* Controllers;
* Métodos HTTP;
* Requisições e respostas;
* JSON;
* CRUD;
* `ResponseEntity`;
* `@PathVariable`;
* `@RequestBody`;
* Injeção de dependências;
* Services;
* DTOs;
* Validação;
* Persistência de dados;
* Banco de dados;
* JPA e Hibernate;
* Testes de APIs.

> O conteúdo do repositório é atualizado conforme novos conceitos e projetos são desenvolvidos durante a disciplina.

---

## 🛠️ Tecnologias

As principais tecnologias utilizadas ou estudadas no repositório são:

* **Java**
* **Spring Boot**
* **Spring Web**
* **Maven**
* **Postman**
* **Git**
* **GitHub**

Novas tecnologias poderão ser adicionadas conforme o avanço da disciplina.

---

# 📁 Projetos

## API Produtos

Projeto desenvolvido para estudar a criação de uma **API REST utilizando Spring Boot**.

O projeto trabalha inicialmente com armazenamento em memória utilizando `ArrayList`, permitindo compreender os conceitos básicos de uma API antes da introdução de banco de dados e outras camadas da aplicação.

### Conceitos trabalhados

* `@SpringBootApplication`
* `@RestController`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@PathVariable`
* `@RequestBody`
* `ResponseEntity`
* CRUD
* JSON
* `List`
* `ArrayList`

### Estrutura inicial

```text
api-produtos/
├── src/
│   └── main/
│       └── java/
│           └── br/
│               └── edu/
│                   └── ifpi/
│                       └── api_produtos/
│                           ├── ApiProdutosApplication.java
│                           ├── Produto.java
│                           └── ProdutoController.java
│
├── pom.xml
└── README.md
```

### Endpoints

| Método | Endpoint         | Descrição                |
| ------ | ---------------- | ------------------------ |
| GET    | `/ola`           | Teste da API             |
| GET    | `/produtos`      | Lista os produtos        |
| GET    | `/produtos/{id}` | Busca um produto         |
| POST   | `/produtos`      | Cadastra um produto      |
| POST   | `/produtos/lote` | Cadastra vários produtos |
| PUT    | `/produtos/{id}` | Atualiza um produto      |
| DELETE | `/produtos/{id}` | Remove um produto        |

---

# 🧠 Organização dos estudos

O desenvolvimento dos projetos segue uma abordagem progressiva:

```text
Conceito
   ↓
Exemplo simples
   ↓
Implementação
   ↓
Teste no Postman
   ↓
Organização do código
   ↓
Novos recursos
```

A intenção é compreender cada conceito antes de aumentar a complexidade da aplicação.

---

# 🔄 Evolução planejada

Os projetos poderão evoluir gradualmente para uma arquitetura mais organizada.

### Estrutura inicial

```text
Controller
    ↓
Modelo
    ↓
ArrayList
```

### Próxima evolução

```text
Controller
    ↓
Service
    ↓
ArrayList
```

### Evolução posterior

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Banco de dados
```

Também poderão ser estudados posteriormente:

* DTOs;
* Validação de dados;
* Tratamento de exceções;
* JPA;
* Hibernate;
* Spring Data;
* Banco de dados;
* Testes automatizados;
* Segurança;
* Documentação de APIs.

---

# 🧪 Ferramentas para testes

As APIs desenvolvidas neste repositório podem ser testadas utilizando ferramentas como:

* **Postman**
* IntelliJ IDEA HTTP Client
* cURL

O Postman é utilizado principalmente para testar:

```text
GET
POST
PUT
DELETE
```

e verificar as respostas retornadas pela API.

---

# ▶️ Execução dos projetos

Cada projeto pode possuir sua própria configuração e instruções de execução.

De forma geral, uma aplicação Spring Boot utilizando Maven pode ser executada através de:

```bash
mvn spring-boot:run
```

Também é possível executar a classe principal da aplicação diretamente pela IDE.

---

# 📖 Objetivo acadêmico

Este repositório possui finalidade **acadêmica e educacional**.

Os códigos aqui armazenados representam exercícios, experimentações e projetos desenvolvidos durante o processo de aprendizagem de Java e Spring Boot.

O código poderá sofrer alterações, refatorações e melhorias à medida que novos conceitos forem aprendidos.

---

# 👨‍💻 Autor

**Davi de Souza Santos Barbosa**

Estudante de **Análise e Desenvolvimento de Sistemas — IFPI**

Repositório desenvolvido para a disciplina de **Programação para a Internet II**.

---

## 🔗 Repositório

**GitHub:**
https://github.com/Davi07s/SPRINGBOOT---ESTUDO
