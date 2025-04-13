
---

# 📘 API de Cadastro e Consulta de Pessoas

### 👩‍💻 Desenvolvedoras
- **Julia Greicy Souza de Lima** – Matrícula: 01707900  
- **Rúbia Evelyn de Arruda Moura** – Matrícula: 01699517  

---

## 📄 Visão Geral

Esta API REST foi desenvolvida com o objetivo de aplicar e consolidar conhecimentos fundamentais de desenvolvimento backend utilizando **Spring Boot**, com integração a um banco de dados relacional **MySQL**.

A aplicação simula um sistema de gerenciamento de pessoas em um contexto acadêmico, permitindo operações básicas de **cadastro** e **consulta** de dados.

---

## 🧾 Entidade Principal

O sistema trabalha com uma única entidade chamada `Pessoa`, que possui os seguintes atributos:

- `nome` (String) – Nome completo da pessoa  
- `cpf` (String) – Cadastro de Pessoa Física  
- `idade` (Integer) – Idade da pessoa  

---

## 🛠️ Tecnologias Utilizadas

- Java  
- Spring Boot (Web, Data JPA)  
- MySQL  
- Lombok  
- Maven  

---

## 📁 Estrutura do Projeto

- **Entity**: `Pessoa` – Classe que representa a entidade no banco de dados.  
- **DTO**: `PessoaDTO` – Responsável por trafegar dados entre o sistema e os clientes da API.  
- **Repository**: `PessoaRepository` – Interface que estende `JpaRepository`, realizando operações no banco de dados.  
- **Controller**: `PessoaController` – Contém os endpoints REST responsáveis pelo controle das requisições.

---

## 🔗 Endpoints Disponíveis

### ➕ Cadastrar Pessoa
**POST** `/api/pessoas`  
Cadastra uma nova pessoa no sistema.  
**Body (JSON):**
```json
{
  "nome": "João Silva",
  "cpf": "12345678900",
  "idade": 30
}
```

### 🔍 Consultar Pessoa por ID
**GET** `/api/pessoas/{id}`  
Recupera os dados de uma pessoa com base no ID informado.  
**Resposta:**
```json
{
  "id": 1,
  "nome": "João Silva",
  "cpf": "12345678900",
  "idade": 30
}
```

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Configure o arquivo `application.properties` com os dados do seu banco MySQL.  
3. Execute o projeto via sua IDE ou com o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

---

