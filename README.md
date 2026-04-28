1. Descrição

O Projeto Conta Bancária é um sistema de gestão projetado para simular e administrar operações financeiras relacionadas a contas bancárias. Oferece funcionalidades como cadastro , consulta , atualização e remoção de contas, além de transações como depósitos, saques e transferências.

O sistema organiza as informações dos clientes — incluindo nome do titular, número da conta, saldo e tipo de conta — garantindo a realização segura das operações. Seu principal objetivo é automatizar e simplificar o gerenciamento de contas bancárias, como Conta Corrente e Conta Poupança, proporcionando agilidade e precisão no controle financeiro.

Este projeto, desenvolvido em Java , foca no estudo e aplicação dos conceitos de Programação Orientada a Objetos (POO) , incluindo:

Classes e Objetos;
Atributos e Métodos;
Modificações de Acesso;
Herança e Polimorfismo;
Classes Abstratas;
Interfaces.
Além de servir como um simulador funcional, o projeto oferece uma prática base para compreender os princípios fundamentais do POO aplicados a um cenário realista.


2. Funcionalidades do Projeto

Criar Conta: Cria uma nova conta bancária especificando nome do titular, número da agência, saldo inicial e propriedades específicas conforme o tipo de conta. O número da conta é gerado automaticamente.
Listar todas as contas: Lista todas as contas cadastradas no sistema.
Consultar uma conta pelo número: Encontra uma conta pelo número.
Consultar uma Conta pelo titular: Encontra uma ou mais contas associadas ao nome do titular.
Editar Conta: Permite atualizar os dados de uma conta existente a partir do número da conta.
Excluir conta: Remove uma conta específica com base no número da conta.
Sacar: Realiza a retirada de um valor de uma conta, desde que o saldo seja suficiente.
Depositar: Adiciona um valor ao saldo de uma conta existente.
Transferir: Transfere um valor de uma conta para outra, respeitando os respectivos saldos e limites.

3. Diagrama de Classes

Um Diagrama de Classes é um modelo visual usado na programação orientada a objetos para representar a estrutura de um sistema. Ele exibe classes, atributos, métodos e os relacionamentos entre eles, como associações, heranças e dependências.

Esse diagrama ajuda a planejar e entender a arquitetura do sistema, mostrando como os componentes interagem e se conectam. É amplamente utilizado nas fases de design e documentação de projetos.

Abaixo, você confere o Diagrama de Aulas do Projeto Conta Bancária:



4. Tela Inicial do Sistema - Menu

Fonte: imgur.com

5. Requisitos

Para executar os códigos localmente, você precisará de:

Java JDK 21+
Eclipse ou Eclipse STS

6. Como executar o projeto no Eclipse/STS

6.1. Importando o Projeto
Clone o repositório do Projeto Conta Bancária dentro da pasta do Workspace do Eclipse/STS
git clone https://github.com/dayanesantana/conta_bancaria.git
Abra o Eclipse/STS e selecione a pasta do Workspace onde você clonou o repositório do projeto
No menu superior do Eclipse/STS, clique na opção: Arquivo 🡲 Importar...
Na janela Importar , selecione a opção: Geral 🡲 Projetos Existentes no Espaço de Trabalho e clique no botão Próximo
Na janela Import Projects , no item Select root directory , clique no botão Browse... e selecione a pasta do Workspace onde você clonou o repositório do projeto
O Eclipse/STS tratará automaticamente do projeto
Marque o Projeto Conta Bancária no item Projetos e clique no botão Concluir para concluir a solicitação

6.2. Executando o projeto
No guia Package Explorer , localize o Projeto Conta Bancária
Abra a Classe Menu
Clique no botão Run Fonte: imgur.com para executar a aplicação
Caso seja questionado qual é o tipo do projeto, selecione a opção Aplicativo Java
O console exibirá o menu do Projeto.

7. Contribuição

Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas! Caso tenha sugestões, correções ou melhorias, fique à vontade para:

Criar uma issue
um pull request
Compartilhe com colegas que estão aprendendo Java!

8. Contato

Desenvolvido por Dayane. Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!