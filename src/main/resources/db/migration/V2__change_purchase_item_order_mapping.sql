alter table purchase_item_table
	add order_id int not null;

alter table purchase_item_table
	add constraint purchase_item_table_order_table_id_fk
		foreign key (order_id) references order_table;


alter table order_table drop constraint order_table_purchase_item_table_id_fk;

alter table order_table drop column purchase_item_id;




-- alter table purchase_item_table
-- add order_id int not null;
--
-- alter table purchase_item_table
-- add constraint purchase_item_table_order_table_id_fk
-- foreign key (order_id) references order_table;
--
-- alter table order_table drop constraint order_table_purchase_item_table_id_fk;
--
-- alter table order_table drop column purchase_item_id;
--
-- alter table order_table
-- 	add constraint order_table_purchase_item_table_id_fk
-- 		foreign key (purchase_item_id) references purchase_item_table;

