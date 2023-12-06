<h2>
  Projeto DSList - Intensivão Java Spring
</h2>

<p>
    <img src="https://img.shields.io/github/languages/count/MatheusPrudente/dslist"/>
    <img src="https://img.shields.io/github/repo-size/MatheusPrudente/dslist"/>
    <img src="https://img.shields.io/github/last-commit/MatheusPrudente/dslist"/>
    <img src="https://img.shields.io/github/issues/MatheusPrudente/dslist"/>
</p>

# Autor
William Oliveira
[LinkedIn](https://www.linkedin.com/in/william-silva-oliveira/)


## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (17)
- Spring Boot
- JPA / Hibernate
- Maven

## Projeto

  Projeto foi desenvolvido durante o curso *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). O projeto consiste em uma Api Rest de Gerenciamento de Entregas

## Diagrama de Classes
![image](https://github.com/MatheusPrudente/dslist/assets/80559882/8874bb22-4ac1-4ee0-a148-45ec73fef224)

## :bookmark_tabs: Documentação da API

#### URL base

```https
  http://localhost:8080
```


#### Obter Listagem dos Games Cadastrados

```https
  GET /games
```


#### Buscar Listagem dos Games Cadastrados Pelo Id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter Listagem das Listas de Games Cadastrados

```https
  GET /lists
```


#### Buscar Listagem das Listas de Games Cadastrados Pelo Id da Lista

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma Lista de Game

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |

