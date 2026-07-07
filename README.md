# Products CRUD API

API REST simples para gerenciamento de produtos desenvolvida com Spring Boot. O projeto implementa as operações básicas de CRUD (Create, Read, Update e Delete), utilizando banco de dados H2 em memória e documentação automática com Swagger/OpenAPI.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Swagger / OpenAPI (SpringDoc)
- Maven

## Funcionalidades

- Criar produtos
- Listar todos os produtos
- Buscar produto por ID
- Atualizar produtos
- Remover produtos
- Documentação da API com Swagger
- Persistência de dados utilizando H2 Database

## Executando o Projeto

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Clonar o repositório

```bash
git clone https://github.com/seu-usuario/products-crud-test.git
cd products-crud-test
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

## Documentação da API

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

## Banco de Dados H2

Console do H2:

```text
http://localhost:8080/h2-console
```

As configurações de acesso podem ser consultadas no arquivo `application.properties`.

## Testes

Os endpoints podem ser testados através do Swagger UI ou utilizando ferramentas como Postman e Insomnia.

## Estrutura do Projeto

```text
src
├── main
│   ├── java
│   │   ├── Controller
│   │   ├── Service
│   │   ├── Repository
│   │   └── Entity
│   └── resources
│       └── application.properties
```
