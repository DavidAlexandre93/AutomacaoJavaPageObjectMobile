@CadastroProdutos
Feature: Cadastro Produto
  Acessar a pagina colocar o nome e realizar cadastro de produto
  
  Scenario: Realizar cadastro de produto
    Given que acessou a tela principal
    When preenche o campo nome
    And acessa o confirmar
    And acessa novo produto
    And preenche o campo produto
    And preenche o campo valor 
    And acessa o campo data 
    And seleciona uma data 
    And acessa salvar 
    Then realiza o cadastro de produto com sucesso