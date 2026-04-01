# 🧮 Calculadora Cliente/Servidor

![Java](https://img.shields.io/badge/Java-23.6%25-blue.svg)
![Shell](https://img.shields.io/badge/Shell-39.7%25-lightgrey.svg)
![Batchfile](https://img.shields.io/badge/Batchfile-36.7%25-darkblue.svg)

Uma aplicação de calculadora distribuída desenvolvida em Java utilizando arquitetura **cliente/servidor**, com suporte a múltiplos clientes e um sistema de notificações em tempo real.

---

## 📋 Visão Geral

Este projeto implementa uma calculadora remota onde diversos clientes podem se conectar a um servidor central para realizar operações matemáticas. Além disso, o sistema oferece um mecanismo de notificações, permitindo que os clientes recebam atualizações e eventos emitidos pelo servidor.

---

## ✨ Funcionalidades

- ➕ Operações matemáticas básicas: adição, subtração, multiplicação e divisão  
- 🌐 Arquitetura cliente/servidor com suporte a múltiplas conexões simultâneas  
- 🔔 Sistema de notificações para envio de eventos do servidor aos clientes  
- 💻 Interface simples via linha de comando (terminal/console)

---

## 🏗️ Estrutura do Projeto
Calculadora/
├── Calculadora.java # Lógica principal das operações matemáticas
├── ServidorCalculadora.java # Servidor responsável por processar requisições
├── ClienteCalculadora.java # Cliente para envio de operações matemáticas
├── ClienteNotificacao.java # Cliente para recebimento de notificações
├── pom.xml # Configuração do Maven
└── README.md # Documentação do projeto


---

## 🚀 Como Executar

### ✅ Pré-requisitos

- Java JDK 8 ou superior  
- Apache Maven 3.9.9 (já incluído no diretório do projeto)

### ▶️ Passos para execução

1. **Clone o repositório**

```bash
git clone https://github.com/danielambrosim/Calculadora.git
cd Calculadora
mvn compile
