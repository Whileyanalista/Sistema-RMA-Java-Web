/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.layouts;

import br.com.passotec.bean.AutorizadaClass;
import br.com.passotec.utilitario.clsDataHora;
import br.com.passotec.bean.ProdutoClass;
import java.sql.*;
import br.com.passotec.conection.ClassConnection;
import br.com.passotec.dal.AutorizacaoCrudClass;
import br.com.passotec.dal.ProdutoCrudClass;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import br.com.passotec.utilitario.WebServiceCep;
import java.io.File;
import javax.swing.JFileChooser;

public class TelaPrincipalJFrame extends javax.swing.JFrame {
//VAREAVES DE CONEXAO COM O BANCO

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaPrincipalJFrame
     */
    public TelaPrincipalJFrame() {
        initComponents();
        conexao = ClassConnection.conector();
        //A LINHA A BAIXO ORIENTA SOBRE O EXTATUS DA CONEXA
        if (conexao != null) {
            //ATRIBUINDO NOME A LEIBOL
            jLabelStatus.setText("Conectado");
            //ATRIBUINDO IMAGENS A STATUS
            jLabelStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/DatabaseConectado32.png")));
            //ATRIBUINDO COR A LEIBOL
            jLabelStatus.setForeground(Color.GREEN);
        } else {
            jLabelStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Delete_Database_32.png")));
            jLabelStatus.setText("Nao conectado");
            jLabelStatus.setForeground(Color.red);

        }

    }

    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jTabbedPanelSystema = new javax.swing.JTabbedPane();
        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelFaixaTelaPrincipal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelAreaPesquisa1 = new javax.swing.JPanel();
        jLabelPesquisaNomeCli = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabelPesquisaNumeroNota = new javax.swing.JLabel();
        jTextFieldPesquisaNumeroNota = new javax.swing.JTextField();
        jLabelPesquisarLaudoData = new javax.swing.JLabel();
        jFormattedTextFieldPesquisaDataLaudo = new javax.swing.JFormattedTextField();
        jPanelAreaPesquisa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTelaPrincipal = new javax.swing.JTable();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jPanelTelaLaudo = new javax.swing.JPanel();
        jLabelFixaLaudo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNomeCli = new javax.swing.JTextField();
        jLabelNomeCli = new javax.swing.JLabel();
        jLabelDataLaudo = new javax.swing.JLabel();
        jFormattedTextFieldDataLaudo = new javax.swing.JFormattedTextField();
        jTextFieldPesquisaTipoProduto = new javax.swing.JTextField();
        jLabelTipoProduto = new javax.swing.JLabel();
        jLabelTipoNumeroSerie = new javax.swing.JLabel();
        jTextFieldNumeroSerie = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jLabelTipoFabricante = new javax.swing.JLabel();
        jLabelTipoLoja = new javax.swing.JLabel();
        jComboBoxLoja = new javax.swing.JComboBox<>();
        jLabelTipoNumeroNota = new javax.swing.JLabel();
        jTextFieldNumeroNota = new javax.swing.JTextField();
        jLabelDataNota = new javax.swing.JLabel();
        jFormattedTextFieldDataNota = new javax.swing.JFormattedTextField();
        jLabelProblemaCli = new javax.swing.JLabel();
        jTextFieldProblemaCli = new javax.swing.JTextField();
        jLabelDiagnostico = new javax.swing.JLabel();
        jTextFieldLaudo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldImagem = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabelProduto1 = new javax.swing.JLabel();
        jTextFieldTipoProduto = new javax.swing.JTextField();
        jLabelPrasoPcia1 = new javax.swing.JLabel();
        jComboBoxPrasoPcia = new javax.swing.JComboBox<>();
        jLabelPrasoFabricante1 = new javax.swing.JLabel();
        jComboBoxAnoFabricante = new javax.swing.JComboBox<>();
        jLabeNomeFabricante1 = new javax.swing.JLabel();
        jTextFieldNomeFabricante = new javax.swing.JTextField();
        jLabelCodigoProd1 = new javax.swing.JLabel();
        jTextFieldCodigoProd = new javax.swing.JTextField();
        jLabelSerieImei1 = new javax.swing.JLabel();
        jTextFieldlSerieImei = new javax.swing.JTextField();
        jLabelDiagnostico1 = new javax.swing.JLabel();
        jTextFieldLaudo1 = new javax.swing.JTextField();
        jButtonSalvarproduto = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonDeletarProduto = new javax.swing.JButton();
        jTextFieldIdLaudo = new javax.swing.JTextField();
        jLabelFundoLaudo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelfaixa = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelDadosGarantia2 = new javax.swing.JPanel();
        jButtonSalvarAltorizada3 = new javax.swing.JButton();
        jButtonDeletarAutorizada3 = new javax.swing.JButton();
        jButtonImprimirAutorizada3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabeNomeAutorizada2 = new javax.swing.JLabel();
        jTextFieldNomeAltorizadaTelaProduto = new javax.swing.JTextField();
        jLabeContatoFabricante6 = new javax.swing.JLabel();
        jFormattedTextFieldContFabTelaProduto = new javax.swing.JFormattedTextField();
        jLabeContatoFabricante7 = new javax.swing.JLabel();
        jFormattedTextFieldContatoFabTelaProduto = new javax.swing.JFormattedTextField();
        jLabeContatoFabricante8 = new javax.swing.JLabel();
        jFormattedTextFieldcontatoFabProduto = new javax.swing.JFormattedTextField();
        jTextFieldIdAutorizada2 = new javax.swing.JTextField();
        jComboBoxEstadoFabricante2 = new javax.swing.JComboBox<>();
        jLabeEstadoFabricante2 = new javax.swing.JLabel();
        jTextFieldCidadeFabricante2 = new javax.swing.JTextField();
        jLabeCidadeFabricante2 = new javax.swing.JLabel();
        jTextFieldBairroFabricante2 = new javax.swing.JTextField();
        jLabeBairroFabricante2 = new javax.swing.JLabel();
        jFormattedTextFieldCepTelaProduto = new javax.swing.JFormattedTextField();
        jLabeCep2 = new javax.swing.JLabel();
        jLabeEnderecoFabricante2 = new javax.swing.JLabel();
        jTextFieldEnderecoFabricante2 = new javax.swing.JTextField();
        jLabeComplementoFabricante2 = new javax.swing.JLabel();
        jTextFieldComplementoFabricante2 = new javax.swing.JTextField();
        jLabeDocNecessario2 = new javax.swing.JLabel();
        jTextFieldDocNecessario2 = new javax.swing.JTextField();
        jLabeNomeFabricante5 = new javax.swing.JLabel();
        jTextFieldNomeFabricante4 = new javax.swing.JTextField();
        jLabelProduto8 = new javax.swing.JLabel();
        jTextFieldTipoProduto4 = new javax.swing.JTextField();
        jLabelProduto9 = new javax.swing.JLabel();
        jTextFieldModelo3 = new javax.swing.JTextField();
        jLabelPrasoPcia5 = new javax.swing.JLabel();
        jComboBoxPrasoPcia4 = new javax.swing.JComboBox<>();
        jLabelPrasoFabricante5 = new javax.swing.JLabel();
        jComboBoxAnoFabricante4 = new javax.swing.JComboBox<>();
        jTextFieldIdProduto5 = new javax.swing.JTextField();
        jLabelFundo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelDadosGarantia1 = new javax.swing.JPanel();
        jLabeContatoFabricante3 = new javax.swing.JLabel();
        jFormattedTextFieldContFab = new javax.swing.JFormattedTextField();
        jLabeContatoFabricante4 = new javax.swing.JLabel();
        jFormattedTextFieldContatoFab = new javax.swing.JFormattedTextField();
        jLabeContatoFabricante5 = new javax.swing.JLabel();
        jFormattedTextFieldcontatoFab = new javax.swing.JFormattedTextField();
        jLabeDocNecessario1 = new javax.swing.JLabel();
        jTextFieldDocNecessario = new javax.swing.JTextField();
        jLabeCep1 = new javax.swing.JLabel();
        jLabeBairroFabricante1 = new javax.swing.JLabel();
        jTextFieldBairroFabricante = new javax.swing.JTextField();
        jLabeCidadeFabricante1 = new javax.swing.JLabel();
        jLabeEstadoFabricante1 = new javax.swing.JLabel();
        jTextFieldCidadeFabricante = new javax.swing.JTextField();
        jTextFieldEnderecoFabricante = new javax.swing.JTextField();
        jLabeComplementoFabricante1 = new javax.swing.JLabel();
        jLabeEnderecoFabricante1 = new javax.swing.JLabel();
        jTextFieldComplementoFabricante = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldNomeAltorizada = new javax.swing.JTextField();
        jLabeNomeAutorizada1 = new javax.swing.JLabel();
        jComboBoxEstadoFabricante = new javax.swing.JComboBox<>();
        jButtonSalvarAltorizada = new javax.swing.JButton();
        jButtonDeletarAutorizada = new javax.swing.JButton();
        jButtonImprimirAutorizada = new javax.swing.JButton();
        jTextFieldIdAutorizada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Systema RMA");
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusable(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBase.setLayout(null);

        jTabbedPanelSystema.setBackground(new java.awt.Color(0, 0, 0));

        jPanelTelaPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jPanelTelaPrincipal.setMaximumSize(getPreferredSize());
        jPanelTelaPrincipal.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanelTelaPrincipal.setVerifyInputWhenFocusTarget(false);
        jPanelTelaPrincipal.setLayout(null);

        jLabelStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelStatus.setText("Status ");
        jLabelStatus.setDoubleBuffered(true);
        jPanelTelaPrincipal.add(jLabelStatus);
        jLabelStatus.setBounds(900, 10, 170, 40);

        jLabelFaixaTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/faicha.png"))); // NOI18N
        jLabelFaixaTelaPrincipal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelTelaPrincipal.add(jLabelFaixaTelaPrincipal);
        jLabelFaixaTelaPrincipal.setBounds(0, 0, 1080, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jPanelAreaPesquisa1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAreaPesquisa1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pesquisa de Laudo", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanelAreaPesquisa1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelAreaPesquisa1.setLayout(null);

        jLabelPesquisaNomeCli.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelPesquisaNomeCli.setText("Nome do Cliente");
        jPanelAreaPesquisa1.add(jLabelPesquisaNomeCli);
        jLabelPesquisaNomeCli.setBounds(20, 30, 120, 30);

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelAreaPesquisa1.add(jTextField3);
        jTextField3.setBounds(140, 30, 350, 30);

        jLabelPesquisaNumeroNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelPesquisaNumeroNota.setText("Numero da Nota");
        jPanelAreaPesquisa1.add(jLabelPesquisaNumeroNota);
        jLabelPesquisaNumeroNota.setBounds(500, 30, 110, 30);

        jTextFieldPesquisaNumeroNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelAreaPesquisa1.add(jTextFieldPesquisaNumeroNota);
        jTextFieldPesquisaNumeroNota.setBounds(610, 30, 180, 30);

        jLabelPesquisarLaudoData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPesquisarLaudoData.setText("Data do Laudo");
        jPanelAreaPesquisa1.add(jLabelPesquisarLaudoData);
        jLabelPesquisarLaudoData.setBounds(800, 30, 100, 30);

        try {
            jFormattedTextFieldPesquisaDataLaudo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPesquisaDataLaudo.setToolTipText("");
        jFormattedTextFieldPesquisaDataLaudo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelAreaPesquisa1.add(jFormattedTextFieldPesquisaDataLaudo);
        jFormattedTextFieldPesquisaDataLaudo.setBounds(900, 30, 130, 30);

        jPanel3.add(jPanelAreaPesquisa1);
        jPanelAreaPesquisa1.setBounds(10, 10, 1040, 100);

        jPanelAreaPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAreaPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pesquisa de Produto", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanelAreaPesquisa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelAreaPesquisa.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Nome do Produto");
        jPanelAreaPesquisa.add(jLabel2);
        jLabel2.setBounds(20, 30, 120, 30);

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelAreaPesquisa.add(jTextField1);
        jTextField1.setBounds(140, 30, 350, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Fabricante");
        jPanelAreaPesquisa.add(jLabel3);
        jLabel3.setBounds(500, 30, 110, 30);

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelAreaPesquisa.add(jTextField2);
        jTextField2.setBounds(610, 30, 420, 30);

        jPanel3.add(jPanelAreaPesquisa);
        jPanelAreaPesquisa.setBounds(10, 110, 1040, 90);

        jPanelTelaPrincipal.add(jPanel3);
        jPanel3.setBounds(10, 60, 1060, 250);

        jTableTelaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTelaPrincipal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTableTelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTelaPrincipal);

        jPanelTelaPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 322, 1060, 320);

        jLabelFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/modelo.png"))); // NOI18N
        jLabelFundoTelaPrincipal.setAutoscrolls(true);
        jLabelFundoTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelFundoTelaPrincipal.setMaximumSize(new java.awt.Dimension(1080, 620));
        jLabelFundoTelaPrincipal.setMinimumSize(new java.awt.Dimension(1080, 620));
        jLabelFundoTelaPrincipal.setOpaque(true);
        jLabelFundoTelaPrincipal.setPreferredSize(new java.awt.Dimension(1080, 620));
        jPanelTelaPrincipal.add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 1080, 650);

        jTabbedPanelSystema.addTab("Tela de Pesquisa", jPanelTelaPrincipal);

        jPanelTelaLaudo.setLayout(null);

        jLabelFixaLaudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/faicha.png"))); // NOI18N
        jLabelFixaLaudo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelTelaLaudo.add(jLabelFixaLaudo);
        jLabelFixaLaudo.setBounds(0, 0, 1080, 110);

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanelTelaLaudo.add(jScrollPane3);
        jScrollPane3.setBounds(10, 452, 1060, 190);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados para o Laudo", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.setLayout(null);

        jTextFieldNomeCli.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNomeCli.setDoubleBuffered(true);
        jPanel1.add(jTextFieldNomeCli);
        jTextFieldNomeCli.setBounds(120, 30, 340, 30);

        jLabelNomeCli.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelNomeCli.setText("Nome do Cliente");
        jPanel1.add(jLabelNomeCli);
        jLabelNomeCli.setBounds(20, 30, 100, 30);

        jLabelDataLaudo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelDataLaudo.setText("Data do Laudo");
        jPanel1.add(jLabelDataLaudo);
        jLabelDataLaudo.setBounds(470, 30, 90, 30);

        try {
            jFormattedTextFieldDataLaudo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataLaudo.setToolTipText("");
        jFormattedTextFieldDataLaudo.setEnabled(false);
        jFormattedTextFieldDataLaudo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jFormattedTextFieldDataLaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataLaudoActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedTextFieldDataLaudo);
        jFormattedTextFieldDataLaudo.setBounds(560, 30, 120, 30);

        jTextFieldPesquisaTipoProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldPesquisaTipoProduto.setDoubleBuffered(true);
        jPanel1.add(jTextFieldPesquisaTipoProduto);
        jTextFieldPesquisaTipoProduto.setBounds(750, 30, 290, 30);

        jLabelTipoProduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTipoProduto.setText("Produto");
        jPanel1.add(jLabelTipoProduto);
        jLabelTipoProduto.setBounds(690, 30, 60, 30);

        jLabelTipoNumeroSerie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTipoNumeroSerie.setText("Numero de Serie");
        jPanel1.add(jLabelTipoNumeroSerie);
        jLabelTipoNumeroSerie.setBounds(20, 70, 100, 30);

        jTextFieldNumeroSerie.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNumeroSerie.setDoubleBuffered(true);
        jPanel1.add(jTextFieldNumeroSerie);
        jTextFieldNumeroSerie.setBounds(120, 70, 250, 30);

        jTextFieldFabricante.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldFabricante.setDoubleBuffered(true);
        jTextFieldFabricante.setEnabled(false);
        jPanel1.add(jTextFieldFabricante);
        jTextFieldFabricante.setBounds(450, 70, 290, 30);

        jLabelTipoFabricante.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTipoFabricante.setText("Fabricante");
        jPanel1.add(jLabelTipoFabricante);
        jLabelTipoFabricante.setBounds(380, 70, 70, 30);

        jLabelTipoLoja.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTipoLoja.setText("Loja Comprada");
        jPanel1.add(jLabelTipoLoja);
        jLabelTipoLoja.setBounds(20, 110, 100, 30);

        jComboBoxLoja.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBoxLoja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loja", "Loja Paralela", "Loja Norte", "Loja Bahia", "Loja Salvador", "Loja Barra", "Loja Piedade", "Loja Lapa" }));
        jPanel1.add(jComboBoxLoja);
        jComboBoxLoja.setBounds(120, 110, 130, 30);

        jLabelTipoNumeroNota.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTipoNumeroNota.setText("Numero da Nota");
        jPanel1.add(jLabelTipoNumeroNota);
        jLabelTipoNumeroNota.setBounds(750, 70, 100, 30);

        jTextFieldNumeroNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNumeroNota.setDoubleBuffered(true);
        jPanel1.add(jTextFieldNumeroNota);
        jTextFieldNumeroNota.setBounds(850, 70, 190, 30);

        jLabelDataNota.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelDataNota.setText("Data da Nota");
        jPanel1.add(jLabelDataNota);
        jLabelDataNota.setBounds(260, 110, 80, 30);

        try {
            jFormattedTextFieldDataNota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNota.setToolTipText("");
        jFormattedTextFieldDataNota.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanel1.add(jFormattedTextFieldDataNota);
        jFormattedTextFieldDataNota.setBounds(340, 110, 110, 30);

        jLabelProblemaCli.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelProblemaCli.setText("Problema Informado Pelo Cliente");
        jPanel1.add(jLabelProblemaCli);
        jLabelProblemaCli.setBounds(460, 110, 190, 30);

        jTextFieldProblemaCli.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldProblemaCli.setDoubleBuffered(true);
        jPanel1.add(jTextFieldProblemaCli);
        jTextFieldProblemaCli.setBounds(650, 110, 390, 30);

        jLabelDiagnostico.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelDiagnostico.setText("Laudo Tecnico ");
        jPanel1.add(jLabelDiagnostico);
        jLabelDiagnostico.setBounds(20, 150, 100, 30);

        jTextFieldLaudo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldLaudo.setDoubleBuffered(true);
        jPanel1.add(jTextFieldLaudo);
        jTextFieldLaudo.setBounds(120, 150, 530, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Imagem");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 150, 90, 30);

        jTextFieldImagem.setEnabled(false);
        jPanel1.add(jTextFieldImagem);
        jTextFieldImagem.setBounds(760, 150, 220, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados do Produto", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel4.setLayout(null);

        jLabelProduto1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelProduto1.setText("Tipo  do Produto");
        jPanel4.add(jLabelProduto1);
        jLabelProduto1.setBounds(310, 30, 100, 30);

        jTextFieldTipoProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldTipoProduto.setDoubleBuffered(true);
        jTextFieldTipoProduto.setEnabled(false);
        jPanel4.add(jTextFieldTipoProduto);
        jTextFieldTipoProduto.setBounds(410, 30, 250, 30);

        jLabelPrasoPcia1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPrasoPcia1.setText("Grantia Loja");
        jPanel4.add(jLabelPrasoPcia1);
        jLabelPrasoPcia1.setBounds(670, 30, 80, 30);

        jComboBoxPrasoPcia.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBoxPrasoPcia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garantia", "5 Dias", "6 Dias", "7 Dias", "1 Ano", "", "" }));
        jComboBoxPrasoPcia.setEnabled(false);
        jPanel4.add(jComboBoxPrasoPcia);
        jComboBoxPrasoPcia.setBounds(750, 30, 100, 30);

        jLabelPrasoFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPrasoFabricante1.setText("Fabricante");
        jPanel4.add(jLabelPrasoFabricante1);
        jLabelPrasoFabricante1.setBounds(860, 30, 70, 30);

        jComboBoxAnoFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBoxAnoFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garantia", "1 Ano", "2 Anos", "3 Anos", "4 Anos", "5 Anos" }));
        jComboBoxAnoFabricante.setEnabled(false);
        jPanel4.add(jComboBoxAnoFabricante);
        jComboBoxAnoFabricante.setBounds(930, 30, 100, 30);

        jLabeNomeFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeNomeFabricante1.setText("Fabricante");
        jPanel4.add(jLabeNomeFabricante1);
        jLabeNomeFabricante1.setBounds(10, 30, 100, 30);

        jTextFieldNomeFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNomeFabricante.setDoubleBuffered(true);
        jTextFieldNomeFabricante.setEnabled(false);
        jPanel4.add(jTextFieldNomeFabricante);
        jTextFieldNomeFabricante.setBounds(110, 30, 190, 30);

        jLabelCodigoProd1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelCodigoProd1.setText("Codigo");
        jPanel4.add(jLabelCodigoProd1);
        jLabelCodigoProd1.setBounds(270, 70, 50, 30);

        jTextFieldCodigoProd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldCodigoProd.setDoubleBuffered(true);
        jPanel4.add(jTextFieldCodigoProd);
        jTextFieldCodigoProd.setBounds(320, 70, 160, 30);

        jLabelSerieImei1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelSerieImei1.setText("Serie ou Imei");
        jPanel4.add(jLabelSerieImei1);
        jLabelSerieImei1.setBounds(10, 70, 100, 30);

        jTextFieldlSerieImei.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldlSerieImei.setDoubleBuffered(true);
        jPanel4.add(jTextFieldlSerieImei);
        jTextFieldlSerieImei.setBounds(110, 70, 150, 30);

        jLabelDiagnostico1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelDiagnostico1.setText("Obs");
        jPanel4.add(jLabelDiagnostico1);
        jLabelDiagnostico1.setBounds(500, 70, 40, 30);

        jTextFieldLaudo1.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldLaudo1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldLaudo1.setDoubleBuffered(true);
        jTextFieldLaudo1.setEnabled(false);
        jPanel4.add(jTextFieldLaudo1);
        jTextFieldLaudo1.setBounds(540, 70, 490, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 190, 1040, 130);

        jButtonSalvarproduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSalvarproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Save_32.png"))); // NOI18N
        jButtonSalvarproduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSalvarproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarprodutoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvarproduto);
        jButtonSalvarproduto.setBounds(850, 330, 50, 40);

        jButtonImprimir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Print_32.png"))); // NOI18N
        jButtonImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButtonImprimir);
        jButtonImprimir.setBounds(990, 330, 50, 40);

        jButtonDeletarProduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonDeletarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Delete_32.png"))); // NOI18N
        jButtonDeletarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButtonDeletarProduto);
        jButtonDeletarProduto.setBounds(920, 330, 50, 40);

        jTextFieldIdLaudo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextFieldIdLaudo.setEnabled(false);
        jPanel1.add(jTextFieldIdLaudo);
        jTextFieldIdLaudo.setBounds(990, 150, 50, 30);

        jPanelTelaLaudo.add(jPanel1);
        jPanel1.setBounds(10, 60, 1060, 380);

        jLabelFundoLaudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFundoLaudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/modelo.png"))); // NOI18N
        jLabelFundoLaudo.setLabelFor(jLabelFundoLaudo);
        jLabelFundoLaudo.setAutoscrolls(true);
        jLabelFundoLaudo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelFundoLaudo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTelaLaudo.add(jLabelFundoLaudo);
        jLabelFundoLaudo.setBounds(0, 0, 1080, 650);

        jTabbedPanelSystema.addTab("Emissão de Laudo", jPanelTelaLaudo);

        jPanel2.setLayout(null);

        jLabelfaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/faicha.png"))); // NOI18N
        jLabelfaixa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabelfaixa);
        jLabelfaixa.setBounds(0, 0, 1080, 60);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 412, 1060, 230);

        jPanelDadosGarantia2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosGarantia2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Produto", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanelDadosGarantia2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelDadosGarantia2.setLayout(null);

        jButtonSalvarAltorizada3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSalvarAltorizada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Save_32.png"))); // NOI18N
        jButtonSalvarAltorizada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSalvarAltorizada3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarAltorizada3MouseClicked(evt);
            }
        });
        jButtonSalvarAltorizada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAltorizada3ActionPerformed(evt);
            }
        });
        jPanelDadosGarantia2.add(jButtonSalvarAltorizada3);
        jButtonSalvarAltorizada3.setBounds(860, 290, 50, 40);

        jButtonDeletarAutorizada3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonDeletarAutorizada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Delete_32.png"))); // NOI18N
        jButtonDeletarAutorizada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDadosGarantia2.add(jButtonDeletarAutorizada3);
        jButtonDeletarAutorizada3.setBounds(930, 290, 50, 40);

        jButtonImprimirAutorizada3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonImprimirAutorizada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Print_32.png"))); // NOI18N
        jButtonImprimirAutorizada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDadosGarantia2.add(jButtonImprimirAutorizada3);
        jButtonImprimirAutorizada3.setBounds(1000, 290, 50, 40);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados da Autorizada", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel10.setLayout(null);

        jLabeNomeAutorizada2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeNomeAutorizada2.setText("Autorizada");
        jPanel10.add(jLabeNomeAutorizada2);
        jLabeNomeAutorizada2.setBounds(10, 30, 100, 30);

        jTextFieldNomeAltorizadaTelaProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNomeAltorizadaTelaProduto.setDoubleBuffered(true);
        jTextFieldNomeAltorizadaTelaProduto.setEnabled(false);
        jPanel10.add(jTextFieldNomeAltorizadaTelaProduto);
        jTextFieldNomeAltorizadaTelaProduto.setBounds(110, 30, 320, 30);

        jLabeContatoFabricante6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante6.setText("Telefone 1");
        jPanel10.add(jLabeContatoFabricante6);
        jLabeContatoFabricante6.setBounds(440, 30, 70, 30);

        try {
            jFormattedTextFieldContFabTelaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldContFabTelaProduto.setEnabled(false);
        jFormattedTextFieldContFabTelaProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanel10.add(jFormattedTextFieldContFabTelaProduto);
        jFormattedTextFieldContFabTelaProduto.setBounds(510, 30, 120, 30);

        jLabeContatoFabricante7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante7.setText("Telefone 2");
        jPanel10.add(jLabeContatoFabricante7);
        jLabeContatoFabricante7.setBounds(640, 30, 70, 30);

        try {
            jFormattedTextFieldContatoFabTelaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldContatoFabTelaProduto.setEnabled(false);
        jFormattedTextFieldContatoFabTelaProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanel10.add(jFormattedTextFieldContatoFabTelaProduto);
        jFormattedTextFieldContatoFabTelaProduto.setBounds(710, 30, 120, 30);

        jLabeContatoFabricante8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante8.setText("Telefone 3");
        jPanel10.add(jLabeContatoFabricante8);
        jLabeContatoFabricante8.setBounds(840, 30, 70, 30);

        try {
            jFormattedTextFieldcontatoFabProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldcontatoFabProduto.setEnabled(false);
        jFormattedTextFieldcontatoFabProduto.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanel10.add(jFormattedTextFieldcontatoFabProduto);
        jFormattedTextFieldcontatoFabProduto.setBounds(910, 30, 120, 30);

        jTextFieldIdAutorizada2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextFieldIdAutorizada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIdAutorizada2.setEnabled(false);
        jPanel10.add(jTextFieldIdAutorizada2);
        jTextFieldIdAutorizada2.setBounds(990, 70, 40, 30);

        jComboBoxEstadoFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxEstadoFabricante2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Acre", "Alagoas", "Amazonas", "Amapá", "Bahia", "Ceará", "Distrito FD", "Espírito ST", "Goiás", "Maranhão", "Mato Grosso", "Mato.G.Sul", "Pará", "Paraíba", "Pernambuco", "Piauí", "Paraná", "RJ", "Rio Grande N", "Rondônia", "Roraima", "Rio Grande S", "Santa CT", "Sergipe", "São Paulo", "Tocantins" }));
        jComboBoxEstadoFabricante2.setEnabled(false);
        jPanel10.add(jComboBoxEstadoFabricante2);
        jComboBoxEstadoFabricante2.setBounds(870, 70, 110, 30);

        jLabeEstadoFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeEstadoFabricante2.setText("Estado");
        jPanel10.add(jLabeEstadoFabricante2);
        jLabeEstadoFabricante2.setBounds(820, 70, 50, 30);

        jTextFieldCidadeFabricante2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldCidadeFabricante2.setDoubleBuffered(true);
        jTextFieldCidadeFabricante2.setEnabled(false);
        jPanel10.add(jTextFieldCidadeFabricante2);
        jTextFieldCidadeFabricante2.setBounds(600, 70, 210, 30);

        jLabeCidadeFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeCidadeFabricante2.setText("Cidade");
        jPanel10.add(jLabeCidadeFabricante2);
        jLabeCidadeFabricante2.setBounds(550, 70, 50, 30);

        jTextFieldBairroFabricante2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldBairroFabricante2.setDoubleBuffered(true);
        jTextFieldBairroFabricante2.setEnabled(false);
        jPanel10.add(jTextFieldBairroFabricante2);
        jTextFieldBairroFabricante2.setBounds(260, 70, 280, 30);

        jLabeBairroFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeBairroFabricante2.setText("Bairro");
        jPanel10.add(jLabeBairroFabricante2);
        jLabeBairroFabricante2.setBounds(220, 70, 40, 30);

        try {
            jFormattedTextFieldCepTelaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCepTelaProduto.setEnabled(false);
        jFormattedTextFieldCepTelaProduto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jFormattedTextFieldCepTelaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCepTelaProdutoActionPerformed(evt);
            }
        });
        jPanel10.add(jFormattedTextFieldCepTelaProduto);
        jFormattedTextFieldCepTelaProduto.setBounds(110, 70, 90, 30);

        jLabeCep2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeCep2.setText("CEP");
        jPanel10.add(jLabeCep2);
        jLabeCep2.setBounds(10, 70, 100, 30);

        jLabeEnderecoFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeEnderecoFabricante2.setText("Endereço");
        jPanel10.add(jLabeEnderecoFabricante2);
        jLabeEnderecoFabricante2.setBounds(10, 110, 100, 30);

        jTextFieldEnderecoFabricante2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldEnderecoFabricante2.setDoubleBuffered(true);
        jTextFieldEnderecoFabricante2.setEnabled(false);
        jPanel10.add(jTextFieldEnderecoFabricante2);
        jTextFieldEnderecoFabricante2.setBounds(110, 110, 480, 30);

        jLabeComplementoFabricante2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeComplementoFabricante2.setText("Complemento");
        jPanel10.add(jLabeComplementoFabricante2);
        jLabeComplementoFabricante2.setBounds(600, 110, 90, 30);

        jTextFieldComplementoFabricante2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldComplementoFabricante2.setDoubleBuffered(true);
        jTextFieldComplementoFabricante2.setEnabled(false);
        jPanel10.add(jTextFieldComplementoFabricante2);
        jTextFieldComplementoFabricante2.setBounds(700, 110, 330, 30);

        jLabeDocNecessario2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeDocNecessario2.setText("Documentos ");
        jPanel10.add(jLabeDocNecessario2);
        jLabeDocNecessario2.setBounds(10, 150, 100, 30);

        jTextFieldDocNecessario2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldDocNecessario2.setDoubleBuffered(true);
        jTextFieldDocNecessario2.setEnabled(false);
        jPanel10.add(jTextFieldDocNecessario2);
        jTextFieldDocNecessario2.setBounds(110, 150, 920, 30);

        jPanelDadosGarantia2.add(jPanel10);
        jPanel10.setBounds(10, 90, 1040, 190);

        jLabeNomeFabricante5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeNomeFabricante5.setText("Fabricante");
        jPanelDadosGarantia2.add(jLabeNomeFabricante5);
        jLabeNomeFabricante5.setBounds(20, 50, 100, 30);

        jTextFieldNomeFabricante4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNomeFabricante4.setDoubleBuffered(true);
        jPanelDadosGarantia2.add(jTextFieldNomeFabricante4);
        jTextFieldNomeFabricante4.setBounds(120, 50, 170, 30);

        jLabelProduto8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelProduto8.setText("Produto");
        jPanelDadosGarantia2.add(jLabelProduto8);
        jLabelProduto8.setBounds(300, 50, 50, 30);

        jTextFieldTipoProduto4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldTipoProduto4.setDoubleBuffered(true);
        jPanelDadosGarantia2.add(jTextFieldTipoProduto4);
        jTextFieldTipoProduto4.setBounds(350, 50, 170, 30);

        jLabelProduto9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelProduto9.setText("Modelo");
        jPanelDadosGarantia2.add(jLabelProduto9);
        jLabelProduto9.setBounds(530, 50, 50, 30);

        jTextFieldModelo3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldModelo3.setDoubleBuffered(true);
        jPanelDadosGarantia2.add(jTextFieldModelo3);
        jTextFieldModelo3.setBounds(580, 50, 130, 30);

        jLabelPrasoPcia5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPrasoPcia5.setText("Loja");
        jPanelDadosGarantia2.add(jLabelPrasoPcia5);
        jLabelPrasoPcia5.setBounds(720, 50, 30, 30);

        jComboBoxPrasoPcia4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBoxPrasoPcia4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garantia", "5 Dias", "6 Dias", "7 Dias", "1 Ano", "", "" }));
        jPanelDadosGarantia2.add(jComboBoxPrasoPcia4);
        jComboBoxPrasoPcia4.setBounds(750, 50, 90, 30);

        jLabelPrasoFabricante5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPrasoFabricante5.setText("Fabricante");
        jPanelDadosGarantia2.add(jLabelPrasoFabricante5);
        jLabelPrasoFabricante5.setBounds(850, 50, 70, 30);

        jComboBoxAnoFabricante4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jComboBoxAnoFabricante4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Garantia", "1 Ano", "2 Anos", "3 Anos", "4 Anos", "5 Anos" }));
        jPanelDadosGarantia2.add(jComboBoxAnoFabricante4);
        jComboBoxAnoFabricante4.setBounds(920, 50, 80, 30);

        jTextFieldIdProduto5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextFieldIdProduto5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIdProduto5.setEnabled(false);
        jPanelDadosGarantia2.add(jTextFieldIdProduto5);
        jTextFieldIdProduto5.setBounds(1010, 50, 30, 30);

        jPanel2.add(jPanelDadosGarantia2);
        jPanelDadosGarantia2.setBounds(10, 60, 1060, 340);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/modelo.png"))); // NOI18N
        jPanel2.add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 1080, 650);

        jTabbedPanelSystema.addTab("Cadastro Produto", jPanel2);

        jPanel6.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/faicha.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel6.add(jLabel4);
        jLabel4.setBounds(0, 0, 1080, 110);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(10, 312, 1060, 330);

        jPanelDadosGarantia1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosGarantia1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Autorizadas", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanelDadosGarantia1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanelDadosGarantia1.setLayout(null);

        jLabeContatoFabricante3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante3.setText("Telefone 1");
        jPanelDadosGarantia1.add(jLabeContatoFabricante3);
        jLabeContatoFabricante3.setBounds(450, 30, 70, 30);

        try {
            jFormattedTextFieldContFab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldContFab.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelDadosGarantia1.add(jFormattedTextFieldContFab);
        jFormattedTextFieldContFab.setBounds(520, 30, 120, 30);

        jLabeContatoFabricante4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante4.setText("Telefone 2");
        jPanelDadosGarantia1.add(jLabeContatoFabricante4);
        jLabeContatoFabricante4.setBounds(650, 30, 70, 30);

        try {
            jFormattedTextFieldContatoFab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldContatoFab.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelDadosGarantia1.add(jFormattedTextFieldContatoFab);
        jFormattedTextFieldContatoFab.setBounds(720, 30, 120, 30);

        jLabeContatoFabricante5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeContatoFabricante5.setText("Telefone 3");
        jPanelDadosGarantia1.add(jLabeContatoFabricante5);
        jLabeContatoFabricante5.setBounds(850, 30, 70, 30);

        try {
            jFormattedTextFieldcontatoFab.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldcontatoFab.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jPanelDadosGarantia1.add(jFormattedTextFieldcontatoFab);
        jFormattedTextFieldcontatoFab.setBounds(920, 30, 120, 30);

        jLabeDocNecessario1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeDocNecessario1.setText("Documentos ");
        jPanelDadosGarantia1.add(jLabeDocNecessario1);
        jLabeDocNecessario1.setBounds(20, 150, 100, 30);

        jTextFieldDocNecessario.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldDocNecessario.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldDocNecessario);
        jTextFieldDocNecessario.setBounds(120, 150, 920, 30);

        jLabeCep1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeCep1.setText("CEP");
        jPanelDadosGarantia1.add(jLabeCep1);
        jLabeCep1.setBounds(20, 70, 100, 30);

        jLabeBairroFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeBairroFabricante1.setText("Bairro");
        jPanelDadosGarantia1.add(jLabeBairroFabricante1);
        jLabeBairroFabricante1.setBounds(230, 70, 40, 30);

        jTextFieldBairroFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldBairroFabricante.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldBairroFabricante);
        jTextFieldBairroFabricante.setBounds(270, 70, 280, 30);

        jLabeCidadeFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeCidadeFabricante1.setText("Cidade");
        jPanelDadosGarantia1.add(jLabeCidadeFabricante1);
        jLabeCidadeFabricante1.setBounds(560, 70, 50, 30);

        jLabeEstadoFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeEstadoFabricante1.setText("Estado");
        jPanelDadosGarantia1.add(jLabeEstadoFabricante1);
        jLabeEstadoFabricante1.setBounds(830, 70, 60, 30);

        jTextFieldCidadeFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldCidadeFabricante.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldCidadeFabricante);
        jTextFieldCidadeFabricante.setBounds(610, 70, 210, 30);

        jTextFieldEnderecoFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldEnderecoFabricante.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldEnderecoFabricante);
        jTextFieldEnderecoFabricante.setBounds(120, 110, 480, 30);

        jLabeComplementoFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeComplementoFabricante1.setText("Complemento");
        jPanelDadosGarantia1.add(jLabeComplementoFabricante1);
        jLabeComplementoFabricante1.setBounds(610, 110, 90, 30);

        jLabeEnderecoFabricante1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeEnderecoFabricante1.setText("Endereço");
        jPanelDadosGarantia1.add(jLabeEnderecoFabricante1);
        jLabeEnderecoFabricante1.setBounds(20, 110, 100, 30);

        jTextFieldComplementoFabricante.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldComplementoFabricante.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldComplementoFabricante);
        jTextFieldComplementoFabricante.setBounds(710, 110, 330, 30);

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jFormattedTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCepActionPerformed(evt);
            }
        });
        jPanelDadosGarantia1.add(jFormattedTextFieldCep);
        jFormattedTextFieldCep.setBounds(120, 70, 90, 30);

        jTextFieldNomeAltorizada.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTextFieldNomeAltorizada.setDoubleBuffered(true);
        jPanelDadosGarantia1.add(jTextFieldNomeAltorizada);
        jTextFieldNomeAltorizada.setBounds(120, 30, 320, 30);

        jLabeNomeAutorizada1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabeNomeAutorizada1.setText("Autorizada");
        jPanelDadosGarantia1.add(jLabeNomeAutorizada1);
        jLabeNomeAutorizada1.setBounds(20, 30, 100, 30);

        jComboBoxEstadoFabricante.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxEstadoFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Acre", "Alagoas", "Amazonas", "Amapá", "Bahia", "Ceará", "Distrito FD", "Espírito ST", "Goiás", "Maranhão", "Mato Grosso", "Mato.G.Sul", "Pará", "Paraíba", "Pernambuco", "Piauí", "Paraná", "RJ", "Rio Grande N", "Rondônia", "Roraima", "Rio Grande S", "Santa CT", "Sergipe", "São Paulo", "Tocantins" }));
        jPanelDadosGarantia1.add(jComboBoxEstadoFabricante);
        jComboBoxEstadoFabricante.setBounds(880, 70, 110, 30);

        jButtonSalvarAltorizada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonSalvarAltorizada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Save_32.png"))); // NOI18N
        jButtonSalvarAltorizada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSalvarAltorizada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarAltorizadaMouseClicked(evt);
            }
        });
        jButtonSalvarAltorizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAltorizadaActionPerformed(evt);
            }
        });
        jPanelDadosGarantia1.add(jButtonSalvarAltorizada);
        jButtonSalvarAltorizada.setBounds(850, 190, 50, 40);

        jButtonDeletarAutorizada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonDeletarAutorizada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Delete_32.png"))); // NOI18N
        jButtonDeletarAutorizada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDadosGarantia1.add(jButtonDeletarAutorizada);
        jButtonDeletarAutorizada.setBounds(920, 190, 50, 40);

        jButtonImprimirAutorizada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonImprimirAutorizada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/icones/Print_32.png"))); // NOI18N
        jButtonImprimirAutorizada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelDadosGarantia1.add(jButtonImprimirAutorizada);
        jButtonImprimirAutorizada.setBounds(990, 190, 50, 40);

        jTextFieldIdAutorizada.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextFieldIdAutorizada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIdAutorizada.setEnabled(false);
        jPanelDadosGarantia1.add(jTextFieldIdAutorizada);
        jTextFieldIdAutorizada.setBounds(1000, 70, 40, 30);

        jPanel6.add(jPanelDadosGarantia1);
        jPanelDadosGarantia1.setBounds(10, 60, 1060, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/passotec/imagens/modelo.png"))); // NOI18N
        jPanel6.add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 650);

        jTabbedPanelSystema.addTab("Cadastrar Autorizada", jPanel6);

        jPanelBase.add(jTabbedPanelSystema);
        jTabbedPanelSystema.setBounds(0, 0, 1080, 680);

        getContentPane().add(jPanelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // QUANDO A TELA ABRIR
        clsDataHora objDataHora = new clsDataHora();
        //DATA AUTOMATICA DO SISTEMA
        jFormattedTextFieldDataLaudo.setText(objDataHora.MostraData());


    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalvarAltorizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAltorizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarAltorizadaActionPerformed

    private void jButtonSalvarAltorizadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarAltorizadaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarAltorizadaMouseClicked

    private void jFormattedTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCepActionPerformed

    private void jFormattedTextFieldCepTelaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepTelaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCepTelaProdutoActionPerformed

    private void jButtonSalvarAltorizada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAltorizada3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarAltorizada3ActionPerformed

    private void jButtonSalvarAltorizada3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarAltorizada3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarAltorizada3MouseClicked

    private void jButtonSalvarprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarprodutoActionPerformed

        //ESTANCIANDO CLASSIS
        ProdutoClass p = new ProdutoClass();
        ProdutoCrudClass dao = new ProdutoCrudClass();

        //SALVANDO INFORMAÇOES
        p.setNome_fabricante(jTextFieldNomeFabricante.getText());
        p.setTipo_produto(jTextFieldTipoProduto.getText());
        p.setCodigo_produto(Integer.parseInt(jTextFieldCodigoProd.getText()));
        p.setSerie_imei(jTextFieldlSerieImei.getText());
        p.setTemp_garantia_pcia(jComboBoxPrasoPcia.getSelectedItem().toString());
        p.setTemp_garantia_fabricante(jComboBoxAnoFabricante.getSelectedItem().toString());

        //ENTRE UPTATE OU CREATE
        if(jTextFieldNomeFabricante.getText().equals("") && jTextFieldTipoProduto.getText().equals("") && jTextFieldCodigoProd.getText().equals("") && jTextFieldlSerieImei.getText().equals("")){
            dao.createProduto(p);
        }else{
            dao.updateProduto(p);
        }
    }//GEN-LAST:event_jButtonSalvarprodutoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //COMANDO PARA CAPTURAR ARQUIVOS DO SISTEMA
        JFileChooser arquivar = new JFileChooser();
        arquivar.showOpenDialog(null);
        File f = arquivar.getSelectedFile();
        String filename = f.getAbsolutePath();
        jTextFieldImagem.setText(filename);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jFormattedTextFieldDataLaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataLaudoActionPerformed
        //
    }//GEN-LAST:event_jFormattedTextFieldDataLaudoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeletarAutorizada;
    private javax.swing.JButton jButtonDeletarAutorizada3;
    private javax.swing.JButton jButtonDeletarProduto;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonImprimirAutorizada;
    private javax.swing.JButton jButtonImprimirAutorizada3;
    private javax.swing.JButton jButtonSalvarAltorizada;
    private javax.swing.JButton jButtonSalvarAltorizada3;
    private javax.swing.JButton jButtonSalvarproduto;
    private javax.swing.JComboBox<String> jComboBoxAnoFabricante;
    private javax.swing.JComboBox<String> jComboBoxAnoFabricante4;
    private javax.swing.JComboBox<String> jComboBoxEstadoFabricante;
    private javax.swing.JComboBox<String> jComboBoxEstadoFabricante2;
    private javax.swing.JComboBox<String> jComboBoxLoja;
    private javax.swing.JComboBox<String> jComboBoxPrasoPcia;
    private javax.swing.JComboBox<String> jComboBoxPrasoPcia4;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCepTelaProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldContFab;
    private javax.swing.JFormattedTextField jFormattedTextFieldContFabTelaProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldContatoFab;
    private javax.swing.JFormattedTextField jFormattedTextFieldContatoFabTelaProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataLaudo;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNota;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisaDataLaudo;
    private javax.swing.JFormattedTextField jFormattedTextFieldcontatoFab;
    private javax.swing.JFormattedTextField jFormattedTextFieldcontatoFabProduto;
    private javax.swing.JLabel jLabeBairroFabricante1;
    private javax.swing.JLabel jLabeBairroFabricante2;
    private javax.swing.JLabel jLabeCep1;
    private javax.swing.JLabel jLabeCep2;
    private javax.swing.JLabel jLabeCidadeFabricante1;
    private javax.swing.JLabel jLabeCidadeFabricante2;
    private javax.swing.JLabel jLabeComplementoFabricante1;
    private javax.swing.JLabel jLabeComplementoFabricante2;
    private javax.swing.JLabel jLabeContatoFabricante3;
    private javax.swing.JLabel jLabeContatoFabricante4;
    private javax.swing.JLabel jLabeContatoFabricante5;
    private javax.swing.JLabel jLabeContatoFabricante6;
    private javax.swing.JLabel jLabeContatoFabricante7;
    private javax.swing.JLabel jLabeContatoFabricante8;
    private javax.swing.JLabel jLabeDocNecessario1;
    private javax.swing.JLabel jLabeDocNecessario2;
    private javax.swing.JLabel jLabeEnderecoFabricante1;
    private javax.swing.JLabel jLabeEnderecoFabricante2;
    private javax.swing.JLabel jLabeEstadoFabricante1;
    private javax.swing.JLabel jLabeEstadoFabricante2;
    private javax.swing.JLabel jLabeNomeAutorizada1;
    private javax.swing.JLabel jLabeNomeAutorizada2;
    private javax.swing.JLabel jLabeNomeFabricante1;
    private javax.swing.JLabel jLabeNomeFabricante5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodigoProd1;
    private javax.swing.JLabel jLabelDataLaudo;
    private javax.swing.JLabel jLabelDataNota;
    private javax.swing.JLabel jLabelDiagnostico;
    private javax.swing.JLabel jLabelDiagnostico1;
    private javax.swing.JLabel jLabelFaixaTelaPrincipal;
    private javax.swing.JLabel jLabelFixaLaudo;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoLaudo;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelNomeCli;
    private javax.swing.JLabel jLabelPesquisaNomeCli;
    private javax.swing.JLabel jLabelPesquisaNumeroNota;
    private javax.swing.JLabel jLabelPesquisarLaudoData;
    private javax.swing.JLabel jLabelPrasoFabricante1;
    private javax.swing.JLabel jLabelPrasoFabricante5;
    private javax.swing.JLabel jLabelPrasoPcia1;
    private javax.swing.JLabel jLabelPrasoPcia5;
    private javax.swing.JLabel jLabelProblemaCli;
    private javax.swing.JLabel jLabelProduto1;
    private javax.swing.JLabel jLabelProduto8;
    private javax.swing.JLabel jLabelProduto9;
    private javax.swing.JLabel jLabelSerieImei1;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipoFabricante;
    private javax.swing.JLabel jLabelTipoLoja;
    private javax.swing.JLabel jLabelTipoNumeroNota;
    private javax.swing.JLabel jLabelTipoNumeroSerie;
    private javax.swing.JLabel jLabelTipoProduto;
    private javax.swing.JLabel jLabelfaixa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelAreaPesquisa;
    private javax.swing.JPanel jPanelAreaPesquisa1;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelDadosGarantia1;
    private javax.swing.JPanel jPanelDadosGarantia2;
    private javax.swing.JPanel jPanelTelaLaudo;
    private javax.swing.JPanel jPanelTelaPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPanelSystema;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableTelaPrincipal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldBairroFabricante;
    private javax.swing.JTextField jTextFieldBairroFabricante2;
    private javax.swing.JTextField jTextFieldCidadeFabricante;
    private javax.swing.JTextField jTextFieldCidadeFabricante2;
    private javax.swing.JTextField jTextFieldCodigoProd;
    private javax.swing.JTextField jTextFieldComplementoFabricante;
    private javax.swing.JTextField jTextFieldComplementoFabricante2;
    private javax.swing.JTextField jTextFieldDocNecessario;
    private javax.swing.JTextField jTextFieldDocNecessario2;
    private javax.swing.JTextField jTextFieldEnderecoFabricante;
    private javax.swing.JTextField jTextFieldEnderecoFabricante2;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldIdAutorizada;
    private javax.swing.JTextField jTextFieldIdAutorizada2;
    private javax.swing.JTextField jTextFieldIdLaudo;
    private javax.swing.JTextField jTextFieldIdProduto5;
    private javax.swing.JTextField jTextFieldImagem;
    private javax.swing.JTextField jTextFieldLaudo;
    private javax.swing.JTextField jTextFieldLaudo1;
    private javax.swing.JTextField jTextFieldModelo3;
    private javax.swing.JTextField jTextFieldNomeAltorizada;
    private javax.swing.JTextField jTextFieldNomeAltorizadaTelaProduto;
    private javax.swing.JTextField jTextFieldNomeCli;
    private javax.swing.JTextField jTextFieldNomeFabricante;
    private javax.swing.JTextField jTextFieldNomeFabricante4;
    private javax.swing.JTextField jTextFieldNumeroNota;
    private javax.swing.JTextField jTextFieldNumeroSerie;
    private javax.swing.JTextField jTextFieldPesquisaNumeroNota;
    private javax.swing.JTextField jTextFieldPesquisaTipoProduto;
    private javax.swing.JTextField jTextFieldProblemaCli;
    private javax.swing.JTextField jTextFieldTipoProduto;
    private javax.swing.JTextField jTextFieldTipoProduto4;
    private javax.swing.JTextField jTextFieldlSerieImei;
    // End of variables declaration//GEN-END:variables

    //  METODO QUE PERMITE A PESQUISA DE ENDEREÇO PELOS CORREIOS
    public void correio() {

        String cep = jFormattedTextFieldCep.getText();

        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

        if (webServiceCep.wasSuccessful()) {

            jTextFieldEnderecoFabricante.setText(webServiceCep.getLogradouroFull());
            jTextFieldBairroFabricante.setText(webServiceCep.getBairro());
            jTextFieldCidadeFabricante.setText(webServiceCep.getCidade());
            jComboBoxEstadoFabricante.setSelectedItem(webServiceCep.getUf());

        } else {
            JOptionPane.showMessageDialog(null, webServiceCep.getResultText());

        }

    }
}
