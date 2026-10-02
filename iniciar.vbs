Set WshShell = CreateObject("WScript.Shell")

' Caminhos das pastas
strBackendPath = "C:\Codes\BR101\backend"
strFrontendPath = "C:\Codes\BR101\frontend"
strJavaHome = "C:\Program Files\Eclipse Adoptium\jdk-25.0.2.10-hotspot"

' 1. Iniciar Backend (Oculto)
' O parâmetro 0 oculta a janela, False não espera o comando terminar para seguir
WshShell.Run "cmd /c ""set JAVA_HOME=" & strJavaHome & " && cd /d " & strBackendPath & " && """ & strJavaHome & "\bin\java.exe"" -jar target/tracker-server.jar debug.xml""", 0, False

' 2. Aguardar 4 segundos
WScript.Sleep 4000

' 3. Iniciar Frontend (Oculto)
WshShell.Run "cmd /c ""cd /d " & strFrontendPath & " && npm start""", 0, False

' 4. Aguardar o Vite inicializar (2 seg) e abrir o navegador
WScript.Sleep 2000
WshShell.Run "http://localhost:3000"
