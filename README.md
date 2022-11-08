# hexa-lab
Desafio HexaLab


#  Projeto
> O escopo do projeto consiste em desenvolver uma carteira digital!

![Abaixo está a representação da documentação das APIs com o SWAGGER](https://github.com/OsmarVitor/hexa-lab/blob/main/src/main/resources/static/swagger-ui.png)

### :computer: Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologia:

* [Java 11](https://www.java.com/en/download/help/java8.html) - Linguagem de Programação do Projeto
* [Spring Boot 2.2.10 RELEASE](https://spring.io/projects/spring-boot) - Framework Web
* [Hibernate](https://hibernate.org/) -Ferramenta ORM
* [JPA](https://www.oracle.com/java/technologies/persistence-jsp.html) - API para frameworks de persistência de dados
* [Postgres](https://www.postgresql.org/) - Banco de dados
* [Lombok](https://projectlombok.org/) - Ferramenta para aumentar a produtividade
* [Junit 4](https://junit.org/junit4/) - Ferramenta para testes
* [H2](https://www.h2database.com/html/main.html) - Bando de dados relacional em memória
* [FlyWay](https://flywaydb.org/) - Controle de versão para o banco de dados
* [Swagger](https://swagger.io/) - Ferramenta para mapear e documentar as API's
* [Jacoco](https://www.eclemma.org/jacoco/) - Ferramenta gratuita de cobertura de código para Java


## Requisitos para Compilação

## :heavy_check_mark: Step 1

Faça o Download do projeto:
````
git clone https://github.com/OsmarVitor/hexa-lab.git
````

## :heavy_check_mark: Step 2

Para o compilar e tesar o projeto é necessário instalar as seguintes tecnologias:

:coffee: Java 11 - Caso você não tenha o Java 11 instalado bastar fazer o download por este link (Linux e WIndows): [Download Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)

:elephant: Postgres - Caso você não tenha o Postgres instalado basta fazer o download por este link (Linux e WIndows): [Download Postgres](https://www.postgresql.org/download/)

## :whale: Instalação do Postgres via Docker (Recomendado)

Se assim como eu você prefere usar o Docker para a instalação do banco de dados segue os comandos para instalação via Docker:
Não tem o Docker instalado? Faça o Download por este link: [Download Docker](https://www.docker.com/products/docker-desktop)

Após instalar e iniciar o Docker execute o seguinte comando para obter uma imagem do Postgres:
````
docker pull postgres
````
Com esse comando criamos um contêiner com a conexão com o banco de dados Postgres na porta padrão :5432 com a senha  **postgres**
````
docker run --name some-postgres -e POSTGRES_PASSWORD=postgres -d postgres
````
## :heavy_check_mark: Step 3
Com o Java 8 e o Postgres instalado precisamos criar a Tabela no banco de dados que o projeto usa para o desenvolvimento.
Você pode criar manualmente com alguma ferramenta (Recomendo o [DBeaver](https://dbeaver.io/)).
Porém o projeto usa o FlyWay que se encarrega de fazer isso para gente, basta executar o seguinte comando:
````
mvn compile flyway:migrate
````
Mas caso tenha algum problema basta criar um banco de dados com o nome `github-api`.

Feito isso, é só importar o projeto para a sua IDE favorita e testar!

## Rodando com Docker

Para rodar com Docker devemos criar um Docker Images através do Dockerfile.
Para isso Rodamos o seguinte comando:
````
docker build --tag:hexa-lab:latest .
````

# Curiosidades

### :heavy_exclamation_mark: E o Banco para Testes?
Não é necessário criar um Banco de dados para testes, pois o H2 cria um banco em memória para os teste, e quando os testes terminam o banco em memória é apagado!

### :interrobang: Por que Unirest em vez de RestTemplate?
O RestTemplate tem suas vantagens pois suas dependências são as mesmas que a do Spring, portanto o Unirest levou vantagem neste projeto pois ele permite um grande simplicidade em chamadas mais genéricas, e permitiu fazer diversos tipos de requisições com 1 unico endpoint com pouquissimas classes e linhas de códigos.
Além disso o Unirest carrega as dependências do GSON, que foram usadas constantemente nos testes para mapear as classes para JSON.

### :recycle: Como contribuir?
* Fork o repositório
* Crie uma branch: `git checkout -b my-feature`
* Commit suas mudanças: `git commit -m 'feat: My new feature`
* Push a sua branch: `git push origin my-feature`

### :balance_scale: Licença
Esse projeto está sob a licença [MIT](https://github.com/OsmarVitor/github-developers-api/blob/main/LICENSE.txt).

### :star: Bônus
Gostou do padrão de **commits** e quer saber mais quando usar o `feat`, `refactor`, `fix`, `docs` e etc?
Segue o link de referência: [Padrão de Commits](https://github.com/stone-payments/stoneco-best-practices/blob/master/gitStyleGuide/README.md)

Gostou da maneira que foi estruturada o README.md?
Segue o link de referência: [README.md Guideline](https://github.com/stone-payments/stoneco-best-practices/blob/master/readme/README.md)
Os emojis foram tirados daqui: [Emojis](https://gist.github.com/rxaviers/7360908)

