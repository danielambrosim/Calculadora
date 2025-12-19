Calculadora - Aplicação Cliente/Servidor em Java
https://img.shields.io/badge/Java-23.6%2525-blue.svg
https://img.shields.io/badge/Shell-39.7%2525-lightgrey.svg
https://img.shields.io/badge/Batchfile-36.7%2525-darkblue.svg

Uma aplicação de calculadora distribuída implementada em Java usando arquitetura cliente/servidor com sistema de notificações.

📋 Visão Geral
Este projeto é uma calculadora que opera em uma arquitetura cliente/servidor, onde múltiplos clientes podem se conectar a um servidor central para realizar operações matemáticas básicas. O sistema também inclui funcionalidades de notificação para informar os clientes sobre eventos do servidor.

✨ Funcionalidades
Operações matemáticas básicas: Adição, subtração, multiplicação e divisão

Arquitetura cliente/servidor: Comunicação entre múltiplos clientes e um servidor central

Sistema de notificações: Clientes podem receber notificações do servidor

Interface de linha de comando: Fácil de usar via terminal/console

🏗️ Estrutura do Projeto
text
Calculadora/
├── Calculadora.java          # Lógica principal da calculadora
├── ServidorCalculadora.java  # Servidor que processa requisições
├── ClienteCalculadora.java   # Cliente para enviar operações
├── ClienteNotificacao.java   # Cliente para receber notificações
├── pom.xml                   # Configuração do Maven
└── README.md                 # Este arquivo
🚀 Como Executar
Pré-requisitos
Java JDK 8 ou superior

Apache Maven 3.9.9 (baseado no diretório incluído no repositório)

Passos para execução
Clone o repositório:

bash
git clone https://github.com/danielambrosim/Calculadora.git
cd Calculadora
Compile o projeto:

bash
mvn compile
Execute o servidor (em um terminal):

bash
mvn exec:java -Dexec.mainClass="ServidorCalculadora"
Execute o cliente de calculadora (em outro terminal):

bash
mvn exec:java -Dexec.mainClass="ClienteCalculadora"
Execute o cliente de notificação (em outro terminal, opcional):

bash
mvn exec:java -Dexec.mainClass="ClienteNotificacao"
📊 Detalhes Técnicos
Linguagens Utilizadas
Java (23.6%): Lógica principal da aplicação

Shell (39.7%): Scripts de automação para ambiente Unix/Linux

Batchfile (36.7%): Scripts de automação para ambiente Windows

Arquitetura
O projeto segue um padrão de arquitetura distribuída:

Servidor: Centraliza o processamento das operações matemáticas

Cliente Calculadora: Interface para envio de operações ao servidor

Cliente Notificação: Recebe atualizações e notificações do servidor

🤝 Como Contribuir
Faça um fork do projeto

Crie uma branch para sua feature (git checkout -b feature/NovaFuncionalidade)

Commit suas alterações (git commit -m 'Adiciona nova funcionalidade')

Push para a branch (git push origin feature/NovaFuncionalidade)

Abra um Pull Request

📞 Suporte
Se precisar de ajuda com o projeto:

Verifique os arquivos de configuração e código fonte

Entre em contato com o mantenedor através do GitHub

Considere abrir uma issue no repositório para problemas específicos

📝 Notas
Última atualização: Novembro de 2024

Total de commits: 2

Status do projeto: Em desenvolvimento inicial

⚠️ Aviso
Este projeto não possui uma licença especificada no repositório. Entre em contato com o mantenedor para mais informações sobre uso e distribuição.

Autor: danielambrosim
Última atualização: Novembro de 2024

