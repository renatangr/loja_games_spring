# Projeto Loja de Games - Backend com Spring Boot

<br />

<div align="center">
    <img src="https://i.imgur.com/w8tTOuT.png" title="source: imgur.com" /> 
</div>

<br />

<div align="center">
  <img src="https://img.shields.io/github/languages/top/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/github/repo-size/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/github/languages/count/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/github/last-commit/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/github/issues/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/github/issues-pr/renatangr/loja_games_spring?style=flat-square" />
  <img src="https://img.shields.io/badge/status-concluído-verde" alt="Status: Construído">

</div>

<br />

## 1. Descrição

<br />

A **Loja de Games** é uma aplicação que permite que usuários publiquem, editem e visualizem produtos relacionados a categorias variadas, de forma organizada e segura. Este projeto foi desenvolvido com fins educacionais, simulando uma aplicação real de blog para praticar conceitos de API REST com Java e Spring Boot.

Entre os principais recursos que uma loja de games oferece, destacam-se:

1. Criação, edição e exclusão de produtos e categorias
2. Associação de produtos a categorias específicas
3. Listagem de produtos e categorias filtradas por ID ou Nome/Descrição
4. Listagem de produtos de acordo com o parâmetro de preço recebido

<br />

## 2. Sobre esta API

<br />

A API da Loja de Games foi desenvolvida utilizando **Java** e o **framework Spring**, seguindo os princípios da Arquitetura MVC e REST. Ela oferece endpoints para o gerenciamento dos recursos **Produto** e **Categoria**, permitindo a interação entre os usuários e os conteúdos publicados.

<br />

## 3. Diagrama de Classes

<br />

O **Diagrama de Classes** é um modelo visual usado na programação orientada a objetos para representar a estrutura de um sistema. Ele exibe classes, atributos, métodos e os relacionamentos entre elas, como associações, heranças e dependências.

Esse diagrama ajuda a planejar e entender a arquitetura do sistema, mostrando como as entidades interagem e se conectam. É amplamente utilizado nas fases de design e documentação de projetos.

<br />

```mermaid
classDiagram
    class Categoria {
        +Long id
        +String descricao
        +List~Produto~ produto
    }

    class Produto {
        +Long id
        +String nome
        +Double preco
        +String imgUrl
        +Categoria categoria
    }

    Categoria "1" --> "*" Produto : contém

```

<br />

## 4. Diagrama Entidade-Relacionamento (DER)

<br />

O **DER (Diagrama Entidade-Relacionamento)** do projeto **Blog Pessoal** representa de forma visual como os dados estão organizados no banco de dados relacional e como as entidades se relacionam entre si.

<br />

```mermaid
erDiagram
    CATEGORIA {
        LONG id PK
        VARCHAR(255) descricao
    }
    PRODUTO {
        LONG id PK
        VARCHAR(150) nome
        DOUBLE preco
        VARCHAR(5000) imgUrl
        LONG categoria_id FK
    }

    CATEGORIA ||--o{ PRODUTO : possui
```

<br />


## 5. Requisitos

<br />

Para executar os códigos localmente, você precisará:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Banco de dados [MySQL](https://dev.mysql.com/downloads/)
- [STS](https://spring.io/tools)
- [Insomnia](https://insomnia.rest/download) ou [Postman](https://www.postman.com/)

<br />