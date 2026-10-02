# 🛰️ BR316 - Plataforma de Rastreamento
### "Seu caminho mais seguro"

![BR316 Logo](frontend/public/logo.png)

A **BR316** é uma solução completa e profissional para rastreamento de ativos e frotas em tempo real. Baseada na robusta tecnologia Traccar, a plataforma foi personalizada para oferecer máxima segurança, performance e uma interface intuitiva com a identidade visual da nossa marca.

---

## 🚀 Principais Funcionalidades

- **📍 Rastreamento em Tempo Real:** Acompanhe a posição exata de seus veículos ou dispositivos no mapa com atualização constante.
- **🛣️ Histórico de Rotas:** Visualize o trajeto percorrido, paradas e velocidades em qualquer período.
- **🔑 Controle de Ignição:** Monitore o status do motor (ligado/desligado) e receba alertas instantâneos.
- **⚠️ Alertas e Eventos:** Configure cercas virtuais (geofences), alarmes de SOS, excesso de velocidade e muito mais.
- **📱 Link de Compartilhamento:** Gere links temporários para que terceiros acompanhem uma rota ao vivo sem precisar de login.
- **🌗 Modo Claro/Escuro:** Interface adaptada para melhor visualização em qualquer ambiente.

---

## 🛠️ Tecnologias Utilizadas

A BR316 utiliza o que há de mais moderno em engenharia de software:

- **Backend:** Java (Framework Traccar) - Alta performance e suporte a centenas de protocolos de GPS.
- **Frontend:** React + Vite - Interface rápida, responsiva e moderna (MUI).
- **Banco de Dados:** H2 (para testes locais) / SQL Server, MySQL ou PostgreSQL (Produção).
- **Comunicação:** WebSockets para dados ao vivo e API REST para integrações.

---

## 🏁 Como Iniciar o Projeto

Este projeto está estruturado em dois módulos principais: **Frontend** e **Backend**.

### Pré-requisitos
- Java JDK 17+ (ou superior)
- Node.js e npm
- Python (opcional, para uso dos scripts de simulação)

### Passos Rápidos
1. **Backend:** Navegue até a pasta `backend`, compile o JAR e execute-o usando o arquivo de configuração `debug.xml`.
2. **Frontend:** Navegue até a pasta `frontend`, instale as dependências com `npm install` e inicie com `npm start`.

> [!TIP]
> Para instruções detalhadas e comandos prontos para Windows, consulte o arquivo [readme-iniciar.txt](readme-iniciar.txt).

---

## 🧪 Simulação de Testes
Para testar a plataforma sem um rastreador físico, utilize o script `simulacao.py` localizado na raiz do projeto. Ele permite simular movimentos, alertas de ignição e rotas completas diretamente do seu computador.

---

## 📄 Licença
Este projeto utiliza a base Open Source do Traccar e segue a licença Apache 2.0.

---
*BR316 - Tecnologia a serviço da sua segurança.*
