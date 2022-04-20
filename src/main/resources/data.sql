insert into ITEM (id, type_id, name, volume,price,availability) values (nextval('item_seq'), 1,'Rezystor 5ohm',100,7.00,5000);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 5ohm',1000, 65.00, 2800);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 5ohm',5000, 300.00, 1400);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 6ohm',100, 7.00, 2400);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 6ohm',1000, 65.00, 1600);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 6ohm',5000, 300.00, 4800);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 2ohm',100, 6.87, 5820);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 2ohm',1000, 62.98, 4230);
insert into ITEM (id, type_id, name, volume, price,availability) values (nextval('item_seq'), 1,'Rezystor 2ohm',5000, 285.02, 3000);

insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 4,7nF',100, 8.99, 3280);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 4,7nF',1000, 85.45, 4000);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 4,7nF',5000, 404.59, 1280);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 47nF',100, 8.79, 3500);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 47nF',1000, 85.35, 1805);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 2,'Kondensator ceramiczny 47nF',5000, 400.25, 2400);

insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor K50T60',100, 2.42, 6000);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor K50T60',1000, 4.55, 3029);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor K50T60',5000, 5.59, 508);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor SKW 25N120',100, 2.99, 5030);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor SKW 25N120',1000, 4.59, 3012);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor SKW 25N120',5000, 5.35, 1020);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor IRF 630',100, 2.85, 1000);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor IRF 630',1000, 3.69, 2500);
insert into ITEM (id, type_id, name,volume, price,availability) values (nextval('item_seq'), 3,'Tranzystor IRF 630',5000, 4.99, 3207);

insert into ROLE (id, authority) values (nextval('role_seq'), 'USER');
insert into ROLE (id, authority) values (nextval('role_seq'), 'ADMIN');
insert into ROLE (id, authority) values (nextval('role_seq'), 'SUPERUSER');

insert INTO USER (user_name, password, role_id) values ('user', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 1);
insert INTO USER (user_name, password, role_id) values ('admin', '$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q', 2);
insert INTO USER (user_name, password, role_id) values ('super', '$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q', 3);

commit;