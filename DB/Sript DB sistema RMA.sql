-- CRIANDO BANCO SISTEMA RMA 
create database sistemarma;

-- DELETANDO A TABELA
drop database sistemarma; 

-- ESCOLHENDO O BANCO
use sistemarma;

-- CRIANDO AS TABELAS
create table produto (
id int not null primary key auto_increment,
nome_fabricante varchar (50) not null,
tipo_produto varchar(50) not null,
modelo varchar (30) not null,
temp_garantia_pcia varchar (10) not null,
temp_garantia_fabricante varchar (10) not null,
id_autorizada int not null unique,
foreign key (id_autorizada) references autorizada (id)
);


create table autorizada (
id int not null primary key auto_increment,
nome_autorizada varchar(50) null,
tel_fixo_fab_1 varchar (30) null,
tel_fixo_fab_2 varchar (30) null,
tel_fixo_fab_3 varchar (30) null,
cep varchar (20) null,
bairro varchar (50) null,
cidade varchar (50) null,
estado varchar (50) null,
endereco varchar (100) null,
complemento varchar (50) null,
doc_necessario varchar(100) not null
);


create table laudo (
id int not null primary key,
nome_cliente varchar(100) not null,
data_laudo varchar (20) not null,
codigo_produto varchar(30) null, 
serial_imei varchar(30) null,
nome_loja varchar(30) null,
observacao text null,
vicio_informado_pelo_cliente text not null,
numero_nota_fiscal int not null,
data_nf varchar(20) not null,
diagnostico_causa text not null,
imagem_assinatura blob null,
imagem_da_avaria blob null,
id_produto int not null unique,
foreign key (id_produto) references produto (id) 
);

drop table autorizada;

drop table laudo;

select * from produto;

select * from autorizada;


-- INSERINDO DADOS NA TABELA 
INSERT INTO produto (nome_fabricante, tipo_produto, modelo, temp_garantia_pcia, temp_garantia_fabricante) VALUES ('sansung','celular','S8','5 dias','1 Ano');

INSERT INTO autorizada (nome_autorizada, tel_fixo_fab_1, tel_fixo_fab_2, tel_fixo_fab_3, cep, bairro, cidade, estado, endereco, complemento, doc_necessario, id_produto) VALUES 
('Montreal Informatica','(71)3363-6987','(71)3363-6987','(71)3363-6987','41250-105', 'Sao Rafael', 'Salvador','Bahia', 'Praça George de Oliveira', 'casa 4E', 'Nota fiscal RG CPF', 1 );

