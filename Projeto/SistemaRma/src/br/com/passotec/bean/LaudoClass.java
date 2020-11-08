/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.bean;

public class LaudoClass {
    private int id;
    private String nome_cliente;
    private String data_laudo;
    private String nome_loja;
    private String observacao;
    private String vicio_informado_pelo_cliente;
    private String numero_nota_fiscal;
    private String data_nf;
    private String diagnostico_causa;
    private byte imagen_assinatura;
    private byte imagem_da_avaria;
    private int id_produto;

    public String getData_laudo() {
        return data_laudo;
    }

    public void setData_laudo(String data_laudo) {
        this.data_laudo = data_laudo;
    }

    public int getId() {
        return id;
    }

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getVicio_informado_pelo_cliente() {
        return vicio_informado_pelo_cliente;
    }

    public void setVicio_informado_pelo_cliente(String vicio_informado_pelo_cliente) {
        this.vicio_informado_pelo_cliente = vicio_informado_pelo_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNumero_nota_fiscal() {
        return numero_nota_fiscal;
    }

    public void setNumero_nota_fiscal(String numero_nota_fiscal) {
        this.numero_nota_fiscal = numero_nota_fiscal;
    }

    public String getData_nf() {
        return data_nf;
    }

    public void setData_nf(String data_nf) {
        this.data_nf = data_nf;
    }

    public String getDiagnostico_causa() {
        return diagnostico_causa;
    }

    public void setDiagnostico_causa(String diagnostico_causa) {
        this.diagnostico_causa = diagnostico_causa;
    }

    public byte getImagen_assinatura() {
        return imagen_assinatura;
    }

    public void setImagen_assinatura(byte imagen_assinatura) {
        this.imagen_assinatura = imagen_assinatura;
    }

    public byte getImagem_da_avaria() {
        return imagem_da_avaria;
    }

    public void setImagem_da_avaria(byte imagem_da_avaria) {
        this.imagem_da_avaria = imagem_da_avaria;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    
}
