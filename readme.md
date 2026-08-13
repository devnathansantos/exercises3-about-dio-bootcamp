# ☕ Desafios Java — Santander + DIO

Repositório desenvolvido durante a formação **Santander + DIO — Java com IA**, reunindo desafios práticos desenvolvidos para aplicar conceitos fundamentais da linguagem Java e de **Programação Orientada a Objetos (POO)**.

Os projetos utilizam um cenário de **sistemas bancários digitais** para representar situações comuns de uma aplicação real, como gerenciamento de contas, operações de saque e depósito, validação de dados e tratamento de erros.

---

## 🎯 Objetivo

O objetivo deste repositório é registrar minha evolução prática durante a formação, aplicando os conceitos estudados em problemas contextualizados.

Os desafios foram desenvolvidos seguindo uma progressão de conceitos:

```text
Fundamentos de Java
       ↓
Regras de negócio
       ↓
Programação Orientada a Objetos
       ↓
Encapsulamento
       ↓
Validação de dados
       ↓
Tratamento de exceções
```

---

## 📚 Desafios

| #  | Projeto                | Conceitos principais                      |
| -- | ---------------------- | ----------------------------------------- |
| 01 | Gerenciamento de Conta | POO, encapsulamento, classes e métodos    |
| 02 | Processamento de Saque | Exceções, validação e tratamento de erros |

---

# 🏦 Desafio 01 — Gerenciamento de Conta

### 📌 Sobre

Neste desafio foi desenvolvido um sistema simples para gerenciamento de uma conta bancária do **Banco Digital ByteBank**.

A aplicação possui uma classe `Conta`, responsável por armazenar o saldo da conta e disponibilizar operações de:

* Depósito;
* Saque;
* Consulta do saldo final.

O principal objetivo do desafio é aplicar o conceito de **encapsulamento**, garantindo que o saldo não seja manipulado diretamente e que suas alterações ocorram por meio dos métodos definidos pela classe.

### 🔐 Encapsulamento

O saldo da conta é protegido dentro da classe `Conta`.

As operações são realizadas através de métodos responsáveis por controlar as alterações no estado do objeto.

Essa abordagem permite centralizar as regras de negócio e evitar alterações indevidas no saldo.

### 💰 Regras implementadas

**Depósito**

O valor informado é adicionado ao saldo atual.

**Saque**

O saque somente é realizado quando existe saldo suficiente.

Caso o valor solicitado seja maior que o saldo disponível, a operação é ignorada e o saldo permanece inalterado.

### 🧪 Exemplo

**Entrada:**

```text
100
depositar 50
sacar 30
fim
```

**Processamento:**

```text
Saldo inicial: 100
Depósito:      +50
Saque:         -30
------------------
Saldo final:    120
```

**Saída:**

```text
120
```

### 🧠 Conceitos praticados

* Classes e objetos;
* Atributos;
* Métodos;
* Encapsulamento;
* Modificadores de acesso;
* Programação Orientada a Objetos;
* Estruturas condicionais;
* Entrada e processamento de comandos;
* Regras de negócio.

---

# 💳 Desafio 02 — Processamento de Saque

### 📌 Sobre

Neste desafio foi desenvolvido um módulo para processamento de saques em uma conta corrente do **Banco Futuro**.

O sistema recebe o saldo atual e o valor do saque solicitado e verifica se a operação pode ser realizada.

O principal diferencial deste desafio é a utilização de **tratamento de exceções**, permitindo que situações inválidas sejam identificadas e tratadas sem interromper a execução do programa de forma inesperada.

### 🛡️ Validações implementadas

O sistema verifica diferentes situações:

| Situação                               | Resultado            |
| -------------------------------------- | -------------------- |
| Saque maior que zero e dentro do saldo | Novo saldo           |
| Saque igual a zero                     | `Valor invalido`     |
| Saque negativo                         | `Valor invalido`     |
| Saque maior que o saldo                | `Saldo insuficiente` |
| Entrada não numérica                   | `Entrada invalida`   |

### 🧪 Exemplos

**Saque realizado com sucesso**

```text
Entrada:
1000
200

Saída:
800
```

**Saldo insuficiente**

```text
Entrada:
500
700

Saída:
Saldo insuficiente
```

**Valor inválido**

```text
Entrada:
300
-50

Saída:
Valor invalido
```

**Entrada inválida**

```text
Entrada:
abc
100

Saída:
Entrada invalida
```

### ⚠️ Tratamento de exceções

O programa utiliza mecanismos de tratamento de exceções para lidar com entradas que não podem ser convertidas corretamente para números inteiros.

Dessa forma, uma entrada como:

```text
abc
```

não provoca o encerramento inesperado da aplicação. Em vez disso, o sistema identifica o problema e retorna:

```text
Entrada invalida
```

### 🧠 Conceitos praticados

* Tratamento de exceções;
* `try/catch`;
* Validação de entradas;
* Regras de negócio;
* Estruturas condicionais;
* Conversão de dados;
* Controle de fluxo;
* Integridade das operações bancárias.

---

# 🛠️ Tecnologias utilizadas

* ☕ **Java**
* 📦 **JDK**
* 🔧 **Git**
* 🐙 **GitHub**

Os desafios utilizam os recursos padrão da linguagem Java e não dependem de bibliotecas externas.

---

# 📂 Estrutura do projeto

A estrutura pode variar de acordo com a organização dos arquivos no repositório.

Uma organização recomendada seria:

```text
.
├── desafio-01/
│   └── src/
│       └── ...
│
├── desafio-02/
│   └── src/
│       └── ...
│
└── README.md
```

---

# 🚀 Como executar

## Pré-requisitos

Para executar os projetos, é necessário ter o **JDK** instalado.

Verifique a instalação através do terminal:

```bash
java -version
```

---

## Clonando o repositório

```bash
git clone URL_DO_REPOSITORIO
```

Depois:

```bash
cd NOME_DO_REPOSITORIO
```

---

## Executando pela IDE

Os projetos podem ser executados utilizando uma IDE compatível com Java, como:

* IntelliJ IDEA;
* Eclipse;
* Visual Studio Code.

Basta abrir o projeto, localizar a classe que contém o método:

```java
public static void main(String[] args)
```

e executar a aplicação.

---

# 📈 Evolução dos conhecimentos

Os dois desafios representam uma evolução gradual na aplicação dos conceitos de Java.

### Desafio 01

O foco está na **Programação Orientada a Objetos**, principalmente no conceito de **encapsulamento**.

A conta deixa de ser apenas um conjunto de variáveis e passa a ser representada por um objeto com estado e comportamentos próprios.

### Desafio 02

O foco passa para a **robustez da aplicação**, utilizando tratamento de exceções e validação de entradas.

Isso permite que o sistema lide de maneira controlada com situações inesperadas, como valores inválidos ou entradas que não correspondem ao formato esperado.

### Resultado

```
┌─────────────────────────────┐
│       Java Fundamentals     │
└──────────────┬──────────────┘
               ↓
┌─────────────────────────────┐
│  Programação Orientada      │
│  a Objetos                  │
└──────────────┬──────────────┘
               ↓
┌─────────────────────────────┐
│       Encapsulamento        │
└──────────────┬──────────────┘
               ↓
┌─────────────────────────────┐
│   Validação de entradas     │
└──────────────┬──────────────┘
               ↓
┌─────────────────────────────┐
│   Tratamento de exceções    │
└─────────────────────────────┘
```

---

# 🔮 Possíveis melhorias

Apesar de serem projetos desenvolvidos como desafios de aprendizagem, os conceitos utilizados podem servir como base para uma aplicação bancária mais completa.

Algumas possíveis evoluções seriam:

* Criar diferentes tipos de conta;
* Implementar transferências;
* Criar histórico de transações;
* Adicionar identificação de clientes;
* Implementar autenticação;
* Criar testes unitários;
* Utilizar tratamento de exceções personalizado;
* Criar uma API REST;
* Persistir os dados em um banco de dados;
* Desenvolver uma interface para interação com o sistema.

---

# 🎓 Formação

Projeto desenvolvido como parte da formação **Santander + DIO — Java com IA**.

Os desafios têm como objetivo transformar os conceitos apresentados durante a formação em soluções práticas, permitindo desenvolver experiência com **Java, Programação Orientada a Objetos, validação de dados e tratamento de exceções**.

---

# 👨‍💻 Autor

**Nathan Santos**

Estudante de Ciências da Computação, com foco no aprendizado e desenvolvimento de aplicações utilizando **Java** e tecnologias relacionadas.
