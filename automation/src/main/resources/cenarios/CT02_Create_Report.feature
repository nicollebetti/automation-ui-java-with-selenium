# language: pt
Funcionalidade: Abrir bug
  Como usuario 
  Eu quero abrir um bug
  Para que seja reportado no sistema

  Cenario: Deve criar report issue
    Dado que eu acesse o sistema com meu usuario 
    Quando clico em report issue
    E seleciono o projeto
    E clico no botao criar
    E preencha os detalhes de report
    E clico em submeter
    Entao visualizo a tabela Viewing Issues