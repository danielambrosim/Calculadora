# 🧮 Calculadora - Aplicação Cliente/Servidor em Java

![Java](https://img.shields.io/badge/Java-23.6%25-blue)
![Shell](https://img.shields.io/badge/Shell-39.7%25-lightgrey)
![Batchfile](https://img.shields.io/badge/Batchfile-36.7%25-darkblue)

> Uma aplicação distribuída de calculadora em Java com arquitetura cliente/servidor e sistema de notificações em tempo real.

## 📋 Visão Geral

Este projeto implementa uma **calculadora distribuída** onde múltiplos clientes podem conectar-se a um servidor central para realizar operações matemáticas. O sistema utiliza uma arquitetura cliente/servidor com comunicação via sockets e inclui um **sistema de notificações** que permite ao servidor enviar atualizações para todos os clientes conectados.

## ✨ Funcionalidades

### 🧮 Operações Matemáticas
- **Adição, subtração, multiplicação e divisão**
- Suporte a números inteiros e decimais
- Tratamento de erros (divisão por zero, entradas inválidas)

### 🌐 Arquitetura Distribuída
- **Servidor central** que processa todas as operações
- **Múltiplos clientes** podem conectar simultaneamente
- Comunicação via **sockets TCP/IP**

### 🔔 Sistema de Notificações
- Clientes podem **receber notificações em tempo real** do servidor
- Notificações sobre eventos do sistema
- Status de operações executadas

### 💻 Interface
- **Interface de linha de comando (CLI)** simples e intuitiva
- Feedback imediato das operações
- Logs detalhados para depuração

## 🏗️ Estrutura do Projeto
