/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.dal;

import br.com.passotec.bean.ProdutoBean;
import br.com.passotec.conection.ClassConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoCrudClass {
    
//METODO RESPONSAVEL POR INSERIR DADOS NO BANCO
    public void createProduto(ProdutoBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;       
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produto (nome_fabricante, tipo_produto, codigo_produto, serial_imei, temp_garantia_pcia, temp_garantia_fabricante) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, p.getNome_fabricante());
            stmt.setString(2, p.getTipo_produto());
            
            stmt.setString(5, p.getTemp_garantia_pcia());
            stmt.setString(6, p.getTemp_garantia_fabricante());
            
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
    
    //METODO RESPONSAVEL POR ALTERAR DADOS NO BANCO
    public void updateProduto(ProdutoBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;       
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE produto SET nome_fabricante=?, tipo_produto=?, codigo_produto=?, serial_imei=?, temp_garantia_pcia=?, temp_garantia_fabricante=? WHERE id=?");
            stmt.setString(1, p.getNome_fabricante());
            stmt.setString(2, p.getTipo_produto());
            
            stmt.setString(5, p.getTemp_garantia_pcia());
            stmt.setString(6, p.getTemp_garantia_fabricante());
            stmt.setInt(7, p.getId());
            
            stmt.executeUpdate();
            
            //ALERTA PARA O USUARIO
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar"+" "+ex);
        }finally{
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //METODO RESPONSAVEL POR DELETAR DADOS DO BANCO
    public void deliteProduto(ProdutoBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;       
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM produto WHERE id=?");           
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            //ALERTA PARA O USUARIO
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir"+" "+ex);
        }finally{
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    

}
    

     

