@echo off
set /p msg="Digite a mensagem do commit: "
if "%msg%"=="" set msg="Atualizacao automatica BR316"

echo.
echo 🚀 Iniciando Deploy para GitHub...
echo.

git add .
git commit -m "%msg%"
git push origin main

if %ERRORLEVEL% EQU 0 (
    echo.
    echo ✅ Sucesso! Projeto atualizado no GitHub.
) else (
    echo.
    echo ❌ Erro ao enviar para o GitHub. Verifique sua conexao ou se ha conflitos.
)

pause
