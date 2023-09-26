
@busca
Feature: Buscar um item na amazon

  Scenario: Buscar um fone de ouvido na amazon
    Given que eu estou na pagina inicial da Amazon
    When eu digito "Fone de ouvido" na caixa de pesquisa
    And eu clico no botao de pesquisa
    Then eu vejo resultados relacionados a "Fone de ouvido"
