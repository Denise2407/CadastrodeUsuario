# Cadastro de Usuários em Java

Este projeto consiste em um cadastro de usuários simples desenvolvida em Java. Ele permite ao usuário adicionar, listar, buscar e remover usuários diretamente no console.

## Funcionalidades

- **Cadastrar Usuário**: O usuário pode adicionar um novo contato com nome, telefone e email.
- **Listar Usuário**: O usuário pode visualizar todos os contatos armazenados na agenda.
- **Buscar Usuário**: O usuário pode buscar um contato pelo nome.
- **Remover Usuário**: O usuário pode remover um contato pelo nome.

## Tecnologias Utilizadas

- **Java**: Linguagem utilizada para o desenvolvimento do sistema.

## Como Rodar o Projeto

1. Clone este repositório para sua máquina:
   git clone https://github.com/Denise2407/CadastrodeUsuario.git
2. Navegue até o diretório do projeto:
    cd CadastrodeUsuario
3. Compile o código
4. Execute o programa.


## Estrutura do código

O código está dividido em três classes principais:

Usuario: Representa um usuário, contendo informações como nome, telefone e email.

UsuarioService: Gerencia os usuário. Permite adicionar, remover, listar e buscar usuários.

Main: Classe principal onde o usuário interage com o sistema, usando um menu no console.

## Exemplos de uso

1. Adicionar Usuários
Ao escolher a opção "1", o sistema pedirá para você informar o nome, telefone e email do contato, e então o adicionará ao sistema.

2. Listar Usuários
Ao escolher a opção "2", o sistema exibirá todos os usuários cadastrados até o momento.

3. Buscar Usuários
Na opção "3", o sistema pedirá o nome do usuário e buscará no sitema. Se encontrado, ele exibirá as informações do usuário.

4. Remover Usuário
Na opção "4", o sistema pedirá o nome do usuário para removê-lo do sistema. Se o nome for encontrado, o usuario será removido.
