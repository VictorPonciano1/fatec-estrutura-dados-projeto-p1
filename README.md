# 📌 PROJETO P1 - ESTRUTURA DE DADOS

> 👨‍💻 Autor: Victor Ponciano  
> 🔗 GitHub: https://github.com/VictorPonciano1  

> 👩‍🏫 Professora: Andréia Machion  
> 📚 Disciplina: Estrutura de Dados  

---

## 📖 SOBRE O PROJETO

Projeto realizado para estudo e complemento de nota da P1 (Primeira Avaliação) da disciplina de Estrutura de Dados da Fatec Carapicuiba do Curso de Análise e Desenvolvimento de Sistemas.

Este documento tem o proprósito de orientar, guiar e demonstrar todo o projeto desenvolvido.

## 🚀 DESENVOLVIMENTO

O desenvolvimento do projeto foi dividio em etapas, onde cada etapa possuiu *"commits"* para indicar o avanço do projeto.

### 🧩 ETAPAS DO PROJETO

As etapas foram 3:
1. **Etapa 1 - Fundamentos da OO e Vetor Dinâmico**
2. **Etapa 2 - Pilha e Pilha com Desfazer**
3. **Etapa 3 - Pilha de Prioridade**

📌 As etapas e o projeto utilizaram como referência códigos realizados em aula que foram retrabalhados para um melhor aproveitamento e adequação com o que cada etapa estava propondo.

💡 Os códigos possuem comentários basedos no próprio PDF de explicação para que seja possível se guiar melhor com o que cada função faz, e qual o seu papel no código.

🔗 É possível clicar no nome do código que aparece listado para ser redirecionado diretamente para ele, facilitando a navegabilidade dentro do projeto.

>**NOTA: A Pasta [Fotos-Templates](Fotos-Templates/) possui as fotos dos Logs dos Testes para serem anexadas neste README. Foi optado pela utilização de fotos para melhorar a visibilidade dos resultados.**

## 🧱 ETAPA 1 — Fundamentos da OO e Vetor Dinâmico

### 📂 Arquivos desenvolvidos:
- [Processo.java](Processo.java)
- [VetorDinamico.java](VetorDinamico.java)

📚 Referências utilizadas em aula:  
`NossoVetor.java`, `TesteNossoVetor.java`, `Carta.java`

---

### 🧪 Testes realizados

A Etapa pedia o teste: "Crie um programa de teste que demonstre: inserção em massa até forçar ao menos dois redimensionamentos crescentes; remoção em massa até forçar ao menos um redimensionamento decrescente; impressão da capacidade atual do array a cada operação."

📌 Inserção em massa (forçando redimensionamento):

![Log Adiciona Etapa 1](Fotos-Templates/LogAdiciona-Etapa1.png)

📌 Remoção em massa (forçando redução):

![Log Remove Etapa 1](Fotos-Templates/LogRemove-Etapa1.png)

> 🎨 Curiosidade: caso haja curiosidade de saber o motivo de o terminal estar estilizado, utilizo o tema "Oh My Posh" no Windows Terminal.

## 📚 ETAPA 2 — Pilha e Pilha com Desfazer

### 📂 Arquivos desenvolvidos:
- [PilhaProcesso.java](PilhaProcesso.java)
- [TestePilhaProcesso.java](TestePilhaProcesso.java)
- [CentralAtendimento.java](CentralAtendimento.java)
- [PilhaVaziaException.java](PilhaVaziaException.java)
- [TesteEtapa2.java](TesteEtapa2.java)

📚 Referências utilizadas em aula:  
`PilhaCartas.java`, `Pilha.java`, `TestePilha.java`, `TestePilhaCarta.java`

### 🧪 Testes realizados

A Etapa 2 pedia o teste: "Crie um menu de console que permita testar todas as operações de forma interativa, incluindo cenários de erro (tentar atender com pilha vazia, tentar desfazer sem histórico)".

📌 Funcionamento do menu geral:

![Teste 1 Etapa 2](Fotos-Templates/Teste1-Etapa2.png)

📌 Abertura de Processo:

![Teste 2 Etapa 2](Fotos-Templates/Teste2-Etapa2.png)

📌 Listando pendentes e tentando desfazer um processo sem atendê-lo primeiro:

![Teste 3 Etapa 2](Fotos-Templates/Teste3-Etapa2.png)

📌 Listagem do histórico depois de processos atendidos e conferência de processos pendentes:

![Teste 4 Etapa 2](Fotos-Templates/Teste4-Etapa2.png)

📌 Abertura de novo projeto

![Teste 5 Etapa 2](Fotos-Templates/Teste5-Etapa2.png)

📌 Listagem de processos, atendimentos e desfazendo processo:

![Teste 6 Etapa 2](Fotos-Templates/Teste6-Etapa2.png)

📌 Tentando desfazer processo sem que hajam processos para serem desfeitos:

![Teste 7 Etapa 2](Fotos-Templates/Teste7-Etapa2.png)


📌 Tentando atender um processo sem que hajam processos a serem atendidos:

![Teste 8 Etapa 2](Fotos-Templates/Teste8-Etapa2.png)

📌 Nesta etapa, os processos já podiam ser atendidos, porém **ainda sem priorização**.

## ⚡ ETAPA 3 — Pilha de Prioridade

### 📂 Arquivo desenvolvido:
- [PilhaPrioridade.java](PilhaPrioridade.java)

### 🔄 Arquivos reutilizados:
- [PilhaProcesso.java](PilhaProcesso.java)
- [TesteEtapa2.java](TesteEtapa2.java)

📌 O menu da Etapa 2 foi reutilizado, pois já atendia todos os requisitos.

---

### 🧪 Testes realizados

Esta etapa continha o teste final do projeto que pedia: "Refatore a classe CentralAtendimento para usar PilhaPrioridade no lugar de PilhaProcesso. O menu de console deve permanecer com as mesmas opções; apenas a ordem de atendimento muda. Demonstre, com testes documentados, que processos urgentes são atendidos antes de processos normais ou de baixa prioridade, mesmo que tenham sido abertos depois. "

📌 Como é possível ver, os processos estão sendo listados por prioridade mesmo com datas de aberturas diferentes:

![Teste 1 Etapa 3](Fotos-Templates/Teste1Etapa3.png)

📌 Processos agora são atendidos corretamente de acordo com seu nível de prioridade, independentemente do serviço e data e hora cadastrados:

![Teste 2 Etapa 3](Fotos-Templates/Teste2Etapa3.png)
