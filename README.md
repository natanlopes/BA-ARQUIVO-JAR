# Capturando JAR  via Botao de ação -  Sankhya

## Descrição
O CapturandoJAR é uma classe Java projetada para ser utilizada como uma ação personalizada dentro da plataforma Sankhya. Este plugin permite capturar e disponibilizar arquivos JAR armazenados em uma tabela de banco de dados para download através da interface web da aplicação Sankhya.


## Funcionalidade
A classe CapturandoJAR realiza as seguintes operações:


- Captura de Dados: Obtém o arquivo JAR armazenado no banco de dados a partir do contexto da ação.
- Preparação para Download: Cria um arquivo para visualização e download utilizando o conteúdo do arquivo JAR.
- Configuração de Download: Adiciona o arquivo JAR à sessão HTTP, permitindo que o usuário faça o download através de um link gerado dinamicamente.
- Mensagens ao Usuário: Configura uma mensagem de retorno com instruções sobre o download e visualização do arquivo JAR.

## Estrutura do Código
- Imports
O código utiliza várias bibliotecas e classes, incluindo:

``` java.math.BigDecimal
com.sankhya.util.SessionFile
com.sankhya.util.UIDGenerator
br.com.sankhya.extensions.actionbutton.AcaoRotinaJava
br.com.sankhya.extensions.actionbutton.ContextoAcao
br.com.sankhya.extensions.actionbutton.Registro
br.com.sankhya.jape.EntityFacade
br.com.sankhya.jape.core.JapeSession
br.com.sankhya.jape.core.JapeSession.SessionHandle
br.com.sankhya.modelcore.util.EntityFacadeFactory
br.com.sankhya.ws.ServiceContext
 ```
Método doAction

- O método principal da classe é doAction, que é invocado pelo contexto da ação. Este método realiza as seguintes etapas:

- Abre uma Sessão JAPE: Inicializa uma sessão para interagir com o banco de dados.

- Obtém o Arquivo JAR: Acessa o campo "ARQUIVO" da tabela onde o JAR está armazenado.

- Cria o Arquivo para Download: Utiliza a classe SessionFile para criar um arquivo que pode ser baixado.
- Armazena o Arquivo na Sessão: Adiciona o arquivo à sessão HTTP para permitir o download.
- Configura Mensagem de Retorno: Define uma mensagem HTML para instruir o usuário a salvar o arquivo como .jar e fornece um link para o download.
- Tratamento de Erros: Captura e exibe erros, se ocorrerem durante o processo.
- Fecha a Sessão JAPE: Garante que a sessão com o banco de dados seja fechada após o processamento.
- Mensagem de Retorno
- A mensagem de retorno configurada pelo método setMensagemRetorno inclui:

Instruções para o Usuário: Recomendação para salvar o arquivo com a extensão .jar.
Link para Download: Um link para baixar o arquivo JAR.
# Uso
Para usar esta classe como uma ação personalizada no Sankhya, siga estas etapas:

# Implante : Adicione o código à sua instalação Sankhya.
- Configure a Ação: Configure a ação para chamar a classe Capturando JAR quando necessário.
