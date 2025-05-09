# 💰 Aplicativo de Conversão de Moedas

Este é um projeto Java que permite converter valores entre diferentes moedas usando a **ExchangeRate-API**. A aplicação oferece suporte para as moedas: **Real (BRL)**, **Dólar Americano (USD)**, **Euro (EUR)** e **Dólar Australiano (AUD)**.

---

## 🚀 Tecnologias Empregadas

- **Java** (versão 8 ou superior)  
- **Gson** (para manipulação de JSON)  
- **ExchangeRate-API** (para obter as cotações em tempo real)

---

## 📌 Funcionalidades

- Conversão de BRL para USD, EUR ou AUD, e vice-versa  
- Conversão simultânea de BRL para todas as moedas disponíveis  
- Interface interativa via terminal

---

## 📂 Organização do Projeto

fonte/
│
├── domínio/
│ └── Moeda.java // Representa uma moeda e sua cotação
│
├── solicitar/
│ └── MoedaRequest.java // Responsável por fazer requisições à API
│
├── resposta/
│ └── MoedaResponse.java // Exibe os dados recebidos no terminal
│
└── serviço/
└── // Contém a lógica de conversão de moedas (classe não listada)

yaml
Copiar
Editar

Arquivos adicionais:

- `.gitignore` – Define arquivos/pastas a serem ignorados pelo Git  
- `desafiador.iml` – Arquivo de configuração de projeto da IDE

---

## 🛠 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
Importe o projeto em sua IDE Java (ex: IntelliJ, Eclipse)

Execute a classe principal que contém o menu interativo no terminal

🔄 Funcionamento
Após iniciar o programa, será exibido um menu no terminal com as opções de conversão disponíveis. O usuário informa o valor a ser convertido e a aplicação consulta a API para exibir o valor correspondente com base na taxa atual.

📌 Exemplo de Execução
markdown
Copiar
Editar
*---------------------------------*
*         ALURA - ONE            *
*   Conversor de Moedas Oficial  *
*---------------------------------*

Selecione a conversão desejada:

1 - BRL para USD  
2 - USD para BRL  
3 - BRL para EUR  
4 - EUR para BRL  
5 - BRL para AUD  
6 - AUD para BRL  
7 - BRL para todas (USD, EUR, AUD)  
8 - Sair  

Opção: 1  
Digite o valor a ser convertido: 100  

Convertendo BRL para USD...  
Taxa atual: 5,25  
Resultado: 525,00 USD
🏗 Melhorias Futuras
Suporte a mais moedas internacionais

Interface gráfica (GUI) para maior usabilidade

Configuração manual de taxas (modo offline)

📎 Licença
Projeto desenvolvido para fins educacionais dentro do programa Alura - ONE. Livre para modificações e adaptações.

yaml
Copiar
Editar

---

Se quiser, posso salvar esse conteúdo como arquivo `.md` e te enviar. Deseja o arquivo também?






