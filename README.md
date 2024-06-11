## Sumário

Este pequeno projeto Java implementa uma lista de compras. A estrutura permite adicionar, listar e remover itens da lista através de um menu interativo no console.

## Pacotes e Classes

### 1. Pacote `implementation`

#### Interface `Supermarket`

Define os métodos essenciais:
- `add(String item)`: Adiciona um item à lista.
- `print()`: Exibe todos os itens.
- `delete(int index)`: Remove um item pelo índice.

#### Classe `SupermarketArray`

Implementa a interface `Supermarket` com um array de Strings:
- **Adicionar Item**: Adiciona um item se houver espaço.
- **Imprimir Itens**: Mostra todos os itens ou avisa se a lista está vazia.
- **Remover Item**: Remove um item pelo índice e desloca os itens restantes.

### 2. Pacote `main`

#### Classe `Main`

Contém o método `main` que executa o programa:
- **Inicialização**: Cria um `SupermarketArray` com tamanho predefinido.
- **Menu Interativo**: Permite ao usuário adicionar, listar, remover itens ou sair do programa.
- **Entrada do Usuário**: Usa um `Scanner` para capturar as escolhas do usuário.

## Conclusão
O projeto demonstra uma implementação simples de uma lista de compras em Java, permitindo adicionar, listar e remover itens através de um menu de console.