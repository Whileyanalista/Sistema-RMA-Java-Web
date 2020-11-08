/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.dal;

import br.com.passotec.conection.ClassConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import br.com.passotec.bean.AutorizadaBean;
import br.com.passotec.layouts.TelaPrincipalJFrame;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AutorizacaoCrudClass {

//METODO RESPONSAVEL EM INSERIR DADOS NO BANCO     
    public void createAltorizada(AutorizadaBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO autorizada (nome_autorizada, tel_fixo_fab_1, tel_fixo_fab_2, tel_fixo_fab_3, cep, bairro, cidade, estado, endereco, complemento, doc_necessario) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome_Autorizada());
            stmt.setString(2, p.getTel_fixo_fab_1());
            stmt.setString(3, p.getTel_fixo_fab_2());
            stmt.setString(4, p.getTel_fixo_fab_3());
            stmt.setString(5, p.getCep());
            stmt.setString(6, p.getBairro());
            stmt.setString(7, p.getCidade());
            stmt.setString(8, p.getEstado());
            stmt.setString(9, p.getEndereco());
            stmt.setString(10, p.getComplemento());
            stmt.setString(11, p.getDoc_necesario());
            stmt.executeUpdate();

            //ALERTA PARA O USUARIO
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //METODO RESPONSAVEL EM INSERIR DADOS NO BANCO     
    public void auterarAltorizada(AutorizadaBean p) {
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE autorizada SET nome_autorizada=?, tel_fixo_fab_1=?, tel_fixo_fab_2=?, tel_fixo_fab_3=?, cep=?, bairro=?, cidad?, estado=?, endereco=?, complemento=?, doc_necessario=? WHERE id=?");
            stmt.setString(1, p.getNome_Autorizada());
            stmt.setString(2, p.getTel_fixo_fab_1());
            stmt.setString(3, p.getTel_fixo_fab_2());
            stmt.setString(4, p.getTel_fixo_fab_3());
            stmt.setString(5, p.getCep());
            stmt.setString(6, p.getBairro());
            stmt.setString(7, p.getCidade());
            stmt.setString(8, p.getEstado());
            stmt.setString(9, p.getEndereco());
            stmt.setString(10, p.getComplemento());
            stmt.setString(11, p.getDoc_necesario());
            stmt.executeUpdate();

            //ALERTA PARA O USUARIO
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    //METODO RESPONSAVEL PESQUISAR DADOS NO BANCO     
    public void pesquisarAltorizada(AutorizadaBean p) {
        TelaPrincipalJFrame telaPrincipalJFrame =  new TelaPrincipalJFrame();
        
        //CHAMANDO A CONECXAO DA CLASSE ClassConnection
        Connection con = ClassConnection.conector();
        //CRIANDO VARIAVEL PARA ESTRING SQL
        PreparedStatement stmt = null;
        try {
            
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM autorizada WHERE nome_autorizada LIKE ?");
            stmt.setString(1, p.getNome_Autorizada() + "%");
            ResultSet rs = stmt.executeQuery();           
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar" + ex);
        } finally {
            try {
                ClassConnection.conector().close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoCrudClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
