create table instrutores(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    cnh varchar(11) not null unique,
    especialidade varchar(100) not null,
    logradouro varcahr(100) not null,
    numero varchar(20),
    complemento varchar(100),
    bairro varchar(100) not null,
    uf varchar(2) not null unique,
    cep varchar(8) not null,

)