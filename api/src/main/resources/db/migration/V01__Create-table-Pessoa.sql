create table pessoa(
                          id int not null auto_increment,
                          nome varchar(100) not null,
                          logradouro varchar(100) not null,
                          numero varchar(20),
                          complemento varchar(100),
                          bairro varchar(100) not null,
                          cep varchar(9) not null,
                          cidade varchar(100) not null,
                          estado char(20) not null,
                          ativo BOOLEAN DEFAULT true not null,

                          primary key(id)
);