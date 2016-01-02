drop table if exists expenses.tag;
create table expenses.tag (
    id serial primary key not null,
    tag_name varchar(50) not null UNIQUE ,
    tag_description varchar(100)
)
with (oids=false);
alter table expenses.tag owner to sanju;



-- ----------------------------
--  table structure for expense
-- ----------------------------
drop table if exists expenses.expenses;
create table expenses.expenses (
    id serial primary key  not null,
    expense_amount numeric not null,
    expense_description varchar(100),
    expense_datetime timestamp(6) null
)
with (oids=false);
alter table expenses.expenses owner to sanju;


-- ----------------------------
--  table structure for expense_x_tag
-- ----------------------------
drop table if exists expenses.expense_x_tag;
create table expenses.expense_x_tag (
    tag_id serial primary key  not null,
    expense_id integer not null
)
with (oids=false);
alter table expenses.expense_x_tag owner to sanju;



-- ----------------------------
--  table structure for currency
-- ----------------------------
drop table if exists expenses.currency;
create table expenses.currency (
    id serial primary key  not null,
    currency_code varchar(5) not null,
    currency_description varchar(25)
)
with (oids=false);
alter table expenses.currency owner to sanju;




-- ----------------------------
--  foreign keys structure for table expense_x_tag
-- ----------------------------
alter table expenses.expense_x_tag add constraint fk_tagid foreign key (tag_id) references expenses.tag (id) on update cascade on delete no action not deferrable initially immediate;
alter table expenses.expense_x_tag add constraint fk_expenseid foreign key (expense_id) references expenses.expenses (id) on update cascade on delete no action not deferrable initially immediate;










-- INSERTS HERE
INSERT INTO expenses.tag(tag_name) VALUES ('landline');
INSERT INTO expenses.tag(tag_name) VALUES ('booze');
INSERT INTO expenses.tag(tag_name) VALUES ('internet');
INSERT INTO expenses.tag(tag_name) VALUES ('lunch');
INSERT INTO expenses.tag(tag_name) VALUES ('cable');
INSERT INTO expenses.tag(tag_name) VALUES ('medicines');
INSERT INTO expenses.tag(tag_name) VALUES ('groceries');
INSERT INTO expenses.tag(tag_name) VALUES ('indian-groceries');
INSERT INTO expenses.tag(tag_name) VALUES ('cab');
INSERT INTO expenses.tag(tag_name) VALUES ('cafe');
INSERT INTO expenses.tag(tag_name) VALUES ('family');
INSERT INTO expenses.tag(tag_name) VALUES ('gadgets');
INSERT INTO expenses.tag(tag_name) VALUES ('downloads');
INSERT INTO expenses.tag(tag_name) VALUES ('certification');
INSERT INTO expenses.tag(tag_name) VALUES ('learning');
INSERT INTO expenses.tag(tag_name) VALUES ('shoes');
INSERT INTO expenses.tag(tag_name) VALUES ('clothes');
INSERT INTO expenses.tag(tag_name) VALUES ('grooming');
INSERT INTO expenses.tag(tag_name) VALUES ('snacks');
INSERT INTO expenses.tag(tag_name) VALUES ('mobile');
INSERT INTO expenses.tag(tag_name) VALUES ('apps');
INSERT INTO expenses.tag(tag_name) VALUES ('software');
INSERT INTO expenses.tag(tag_name) VALUES ('kitchenware');
INSERT INTO expenses.tag(tag_name) VALUES ('furnishing');
INSERT INTO expenses.tag(tag_name) VALUES ('home-appliances');
INSERT INTO expenses.tag(tag_name) VALUES ('water');

commit;