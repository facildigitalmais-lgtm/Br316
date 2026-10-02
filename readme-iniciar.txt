# COMO INICIAR O PROJETO TRACCAR (LOCAL)

Este documento contém os passos para iniciar o backend e o frontend no Windows.

## 1. BACKEND (Java)
Abra um terminal PowerShell na pasta: C:\Codes\BR101\backend

Execute os comandos:
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-25.0.2.10-hotspot"
& "$env:JAVA_HOME\bin\java.exe" -jar target/tracker-server.jar debug.xml

O backend estará rodando em: http://localhost:8082

---

## 2. FRONTEND (React/Vite)
Abra outro terminal na pasta: C:\Codes\BR101\frontend

Execute o comando:
npm start

O frontend estará rodando em: http://localhost:3000

---

## INFORMAÇÕES ADICIONAIS
- Banco de Dados Atual: H2 (Arquivo local em backend/target/database)
- Login Padrão: admin@admin.com / admin
- Java Utilizado: JDK 25 (Eclipse Adoptium)
