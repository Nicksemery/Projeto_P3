create table lancamento(
    id int primary key auto_increment,
    descricao varchar(40) not null,
    data_vencimento date not null,
    data_pagamento date,
    valor float not null,
    observacao varchar(100),
    tipo varchar(20) check(tipo in ('receita','despesa')) not null,
    codigo_categoria int not null,
    codigo_pessoa int not null,
    ativo boolean default true,

    foreign key (codigo_categoria) references categoria(id),
    foreign key (codigo_pessoa) references pessoa(id)

);