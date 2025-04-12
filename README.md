Nome da dupla: Julia Greicy Souza de Lima e Rubia 
---

API para Cadastro e Consulta de Pessoas
📄 Visão Geral
Esta API REST foi desenvolvida com foco na prática de conceitos fundamentais do desenvolvimento backend com Spring Boot, além da integração com um banco de dados relacional MySQL.
O sistema simula o gerenciamento de pessoas em um contexto acadêmico, permitindo operações básicas de cadastro e consulta.

A aplicação trabalha com apenas uma entidade principal: Pessoa, que contém os atributos:

nome

cpf

idade

🛠️ Tecnologias e Ferramentas
Java

Spring Boot (Web, Data JPA)

MySQL

Lombok

Maven

🗂️ Organização do Projeto
A estrutura do projeto está distribuída da seguinte forma:

Entity: A classe Pessoa representa a entidade no banco de dados.

DTO: A classe PessoaDTO é usada para trafegar dados entre o sistema e o cliente.

Repository: Interface PessoaRepository, responsável pelas operações com o banco de dados, estendendo JpaRepository.

Controller: A classe PessoaController contém os endpoints responsáveis pelas requisições da API.

🔗 Funcionalidades e Endpoints
POST /api/pessoas
Cadastra uma nova pessoa no sistema.

GET /api/pessoas/{id}
Recupera os dados de uma pessoa específica com base no ID informado.



---
