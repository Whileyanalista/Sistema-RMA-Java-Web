/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.dal;

import br.com.passotec.bean.LaudoBean;
import br.com.passotec.conection.ClassConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LaudoCrudClass {
    
//METODO RESPONSAVEL EM INSERIR DADOS NO BANCO    
    public void createLaudo(LaudoBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;       
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO laudo (nome_cliente, data_laudo, nome_loja, observacao, vicio_informado_pelo_cliente, numero_nota_fiscal, data_nf, diagnostico_causa, imagem_da_avaria) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome_cliente());
            stmt.setString(2, p.getData_laudo());
            stmt.setString(3, p.getNome_loja());
            
            stmt.setString(5, p.getVicio_informado_pelo_cliente());
            stmt.setString(6, p.getNumero_nota_fiscal());
            stmt.setString(7, p.getData_nf());
            stmt.setString(8, p.getDiagnostico_causa());
            
           
            stmt.executeUpdate();
            
            //ALERTA PARA O USUARIO
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ex);
        }finally{
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
