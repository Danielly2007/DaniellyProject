# Project – API REST com Spring Boot

# 📌 Descrição
Este projeto é um exemplo de como implementar uma API REST usando o Spring Boot. Ele foi criado para demonstrar a construção de endpoints simples, utilizando diferentes tipos de métodos HTTP, como GET, POST, PUT e DELETE.

# ⚙️ Tecnologias utilizadas
- Java 21 (JDK)
- Spring Boot + Spring MVC
- Jakarta EE
- Lombok

# 📁 Estrutura do projeto
project_one/
└── src/
    └── main/java/com/recupera/project/danielly/
        ├── controller/
        │   └── HelloWorldController.java
        ├── service/
        │   └── HelloWorldService.java
        ├── domain/
        │   └── User.java
        └── Configuration/
            └── Configuration.java

# 🚀 Como executar
1. Clone o repositório:
  ```bash
 git clone https://github.com/Danielly2007/DaniellyProject
  ```
2. Entre no diretório:
 ```bash
 cd DaniellyProject
  ```
3. Execute com Maven:
 ```bash
 mvn clean spring-boot:run
  ```
4. Acesse: http://localhost:8080 (porta padrão 8080).

# 🔌 Endpoints

GET /entrar
Retorna uma mensagem de saudação.

# Exemplo:
```bash
curl http://localhost:8080/entrar
```
# Resposta:
```bash
"Bem Vindo(a) Pessoa!"
```

POST /entrar/{id}
Processa dados conforme o ID, filtro e corpo JSON.

- Path Variable: id (ex: 1)
- Query Parameter (opcional): filter (default: nenhuma)
- Body: JSON com os campos "name" e "email"

# Exemplo:
```bash
curl POST http://localhost:8080/entrar/%201-?filter=User
  body > JSON : 
  {
"name":"Pessoa",
"email":"Pessoa@email.com"
}
```
# Resposta esperada:
```bash
"Bem Vinda Pessoa Pessoa@email.com 1-User"
```

# 🛠️ Observações

- Porta padrão: 8080
- filter é opcional (valor padrão: nenhum)
- POST exige JSON válido no body e id como path variable
