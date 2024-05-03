package br.com.argo.btn.arquivo;

import java.math.BigDecimal;

import com.sankhya.util.SessionFile;
import com.sankhya.util.UIDGenerator;

import br.com.sankhya.extensions.actionbutton.AcaoRotinaJava;
import br.com.sankhya.extensions.actionbutton.ContextoAcao;
import br.com.sankhya.extensions.actionbutton.Registro;
import br.com.sankhya.jape.EntityFacade;
import br.com.sankhya.jape.core.JapeSession;
import br.com.sankhya.jape.core.JapeSession.SessionHandle;
import br.com.sankhya.modelcore.util.EntityFacadeFactory;
import br.com.sankhya.ws.ServiceContext;

public class CapturandoJAR implements AcaoRotinaJava {
    @Override
    public void doAction(ContextoAcao ctx) throws Exception {
    	SessionHandle hnd = null;
    	Registro[] registros = ctx.getLinhas();
    	Registro r = registros[0];
//    	//NOME DO ARQUIVO SESSAO
    	String chave = "jar_" + UIDGenerator.getNextID();
        	
            try {
//            	hnd = JapeSession.open();
////        		//CAMPO ARQUIVO DA TABELA É ONDE TEM O JAR
//        		Object jar = r.getCampo("ARQUIVO");
//        		if(jar != null) {
//        			//BYTE ARRAY DO ARQUIVO QUE QUER BAIXAR 
//        			byte[] fileContent = (byte[])jar;
//        			
//        			//INSTANCIA O ARQUIVO JAR
//        			SessionFile sessionFile = SessionFile.createSessionFile("FileViewer.jar", "application/jar", fileContent);
//        
//        			// SESSÃO PARA DOWNLOAD 
//        			ServiceContext.getCurrent().putHttpSessionAttribute(chave, sessionFile);
            	ctx.setMensagemRetorno("testando");
//        		}
            } catch (Exception e) {
            	ctx.mostraErro(e.getMessage());
                // Lidar com a exceção aqui AQUI

            } finally {
            	JapeSession.close(hnd);
            }
            
//        	ctx.setMensagemRetorno("<p><strong>Atenção: Ao baixar o arquivo salve como .jar</strong></p>"
//			+ "<p>Use site como: http://www.javadecompilers.com para descompilar </p>"
//			+ "<a id=\"alink\" href=\"/mge/visualizadorArquivos.mge?chaveArquivo=" 
//			+ chave 
//			+ "&ignoraPodeExportarjar=N&forcarDownload=N\" target=\"_blank\">Baixar jar</a>");
//     
        
    }

}
//public void doAction(ContextoAcao ctx) throws Exception {
//	SessionHandle hnd = null;
//	Registro[] registros = ctx.getLinhas();
//	Registro r = registros[0];
//	//NOME DO ARQUIVO SESSAO
//	String chave = "jar_" + UIDGenerator.getNextID();
//	try {
//		hnd = JapeSession.open();
//
//	
//		//CAMPO ARQUIVO DA TABELA É ONDE TEM O JAR
//		Object jar = r.getCampo("ARQUIVO");
//		
//		if(jar != null) {
//			//BYTE ARRAY DO ARQUIVO QUE QUER BAIXAR 
//			byte[] fileContent = (byte[])jar;
//			
//			//INSTANCIA O ARQUIVO JAR
//			SessionFile sessionFile = SessionFile.createSessionFile("FileViewer.jar", "application/jar", fileContent);
//
//			// SESSÃO PARA DOWNLOAD 
//			ServiceContext.getCurrent().putHttpSessionAttribute(chave, sessionFile);
//		}
//
//	} catch(Exception ex) {
//		ctx.mostraErro(ex.getMessage());
//	} finally {
//		JapeSession.close(hnd);
//	}
//	
//	ctx.setMensagemRetorno("<p><strong>Atenção: Ao baixar o arquivo salve como .jar</strong></p>"
//			+ "<p>Use site como: http://www.javadecompilers.com para descompilar </p>"
//			+ "<a id=\"alink\" href=\"/mge/visualizadorArquivos.mge?chaveArquivo=" 
//			+ chave 
//			+ "&ignoraPodeExportarjar=N&forcarDownload=N\" target=\"_blank\">Baixar jar</a>");
//
//}
//}
