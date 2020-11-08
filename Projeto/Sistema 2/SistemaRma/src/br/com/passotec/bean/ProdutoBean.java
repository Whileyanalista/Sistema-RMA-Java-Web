/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.passotec.bean;

public class ProdutoBean {
    private int id;
    private String nome_fabricante;
    private String tipo_produto;
    private String modelo;
    private String temp_garantia_pcia;
    private String temp_garantia_fabricante;
    private int id_autorizada;

    public int getId() {
        return id;
    }

    public String getNome_fabricante() {
        return nome_fabricante;
    }

    public void setNome_fabricante(String nome_fabricante) {
        this.nome_fabricante = nome_fabricante;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTemp_garantia_pcia() {
        return temp_garantia_pcia;
    }

    public void setTemp_garantia_pcia(String temp_garantia_pcia) {
        this.temp_garantia_pcia = temp_garantia_pcia;
    }

    public String getTemp_garantia_fabricante() {
        return temp_garantia_fabricante;
    }

    public void setTemp_garantia_fabricante(String temp_garantia_fabricante) {
        this.temp_garantia_fabricante = temp_garantia_fabricante;
    }

    public int getId_autorizada() {
        return id_autorizada;
    }

    public void setId_autorizada(int id_autorizada) {
        this.id_autorizada = id_autorizada;
    }
    
    
    
}
