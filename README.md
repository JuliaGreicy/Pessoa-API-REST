
---

# API de Gerenciamento de Pessoas

## 📄 Descrição do Projeto

Esta aplicação consiste em uma API REST para o sistema de gerenciamento de pessoas de uma universidade. Tem como objetivo aplicar os conhecimentos de desenvolvimento com Spring Boot e persistência de dados com MySQL.

A única entidade do sistema é **Pessoa**, que possui os seguintes atributos:

- nome  
- cpf  
- idade  

---

## 🛠️ Tecnologias Utilizadas

- Java  
- Spring Boot (Spring Web, Spring Data JPA)  
- MySQL  
- Lombok  
- Maven  

---

## 🗂️ Estrutura do Projeto

O projeto segue a seguinte estrutura:

- **Entity:** Classe `Pessoa`, que representa a tabela no banco de dados.  
- **DTO:** Classe `PessoaDTO`, para transferência de dados da API.  
- **Repositório:** Interface `PessoaRepository`, que estende `JpaRepository`.  
- **Controlador:** Classe `PessoaController`, que expõe os endpoints da API.  

---

## 🔗 Endpoints da API

- `POST /api/pessoas`  
  Cria uma nova pessoa no banco de dados.

- `GET /api/pessoas/{id}`  
  Retorna a pessoa com o ID informado.

---
