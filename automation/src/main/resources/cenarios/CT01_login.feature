# language: pt
Funcionalidade: Fazer login
  Como usuario 
  Eu quero efetuar login
  Para que eu acese o sistema

  Cenario: Deve efetuar login com usuario valido
    Dado que eu acesse o sistema
    Quando informo o usuario valido "nicolle.furlan"
    E a senha valida "ponei"
    E clico em entrar    
    Entao visualizo a pagina inicial

