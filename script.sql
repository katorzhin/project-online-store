create table product_table
(
	id int not null
		constraint product_table_pk
			primary key,
	title varchar(50) not null,
	description text,
	image text,
	price double precision
);

