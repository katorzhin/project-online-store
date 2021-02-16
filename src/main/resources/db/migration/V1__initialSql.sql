create table product_table
(
    id          serial
        constraint product_table_pk
            primary key,
    title       varchar(60) not null,
    description text,
    image       text,
    price       DOUBLE PRECISION
);

create table user_table
(
    id       serial
        constraint user_table_pk
            primary key,
    name     varchar(40) not null,
    surname  varchar(40),
    email    varchar(50) not null,
    phone    varchar(30),
    password varchar(350),
    role     text,
    address  varchar(100)
);

create unique index user_table_email_uindex
    on user_table (email);

create table purchase_item_table
(
    id         serial
        constraint purchase_item_table_pk
            primary key,
    product_id int
        constraint purchase_item_table_product_table_id_fk
            references product_table,
    count      int default 1
);

create table order_table
(
    id               serial
        constraint order_table_pk
            primary key,
    user_id          int
        constraint order_table_user_table_id_fk
            references user_table,
    purchase_item_id int
        constraint order_table_purchase_item_table_id_fk
            references purchase_item_table,
    comment          text
);