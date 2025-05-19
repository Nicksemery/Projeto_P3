create table categoria(
    id int primary key auto_increment,
    nome varchar(40) not null,
    ativo boolean default true
);