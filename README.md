## Desafio Spring Security 01
Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem:

https://github.com/devsuperior/bds03

Collection do Postman:

https://www.getpostman.com/collections/9c19a0ad21eb8a7d864a

Este é um sistema de funcionários e departamentos com uma relação N-1 entre eles:

![uml](https://github.com/rosana-moreira/desafio-spring-security-02/blob/master/image.png)


Neste sistema, todas as rotas são protegidas. Usuários ADMIN podem ler e alterar recursos, enquanto que usuários OPERATOR podem apenas ler.

* Validações de Employee:
  * Nome não pode ser vazio
  * Email deve ser válido
  * Departamento não pode ser nulo

* Passos para resolver:
  * Modelo de dados User-Role
  * Incluir infraestrutura de validação ao projeto
  * Incluir infraestrutura de segurança ao projeto
  * Implementar as funcionalidades

---

### Spring Security

* Interfaces que devem ser implementadas
  * UserDetails
  * UserDetailsService

* Classe para configuração de segurança web
  * WebSecurityConfigurerAdapter

* Bean para efetuar autenticação
  * AuthenticationManager

---

### Spring Cloud OAuth2
* Classe de configuração para Authorization Server
  * AuthorizationServerConfigurerAdapter

* Classe de configuração para Resource Server
  * ResourceServerConfigurerAdapter

* Beans para implementar o padrão JWT
  * JwtAccessTokenConverter
  * JwtTokenStore

---

### Referências sobre Bean Validation

https://beanvalidation.org/

https://docs.jboss.org/hibernate/beanvalidation/spec/2.0/api/overview-summary.html

https://docs.jboss.org/hibernate/beanvalidation/spec/2.0/api/javax/validation/constraints/package-summary.html

https://www.baeldung.com/java-bean-validation-not-null-empty-blank

https://www.baeldung.com/spring-custom-validation-message-source

https://pt.stackoverflow.com/questions/133691/formatar-campo-cpf-ou-cnpj-usando-regex

https://regexlib.com/

https://regexr.com/

---


