/*
 Navicat Premium Data Transfer

 Source Server         : local-postgres
 Source Server Type    : PostgreSQL
 Source Server Version : 90305
 Source Host           : localhost
 Source Database       : expensedb
 Source Schema         : expense

 Target Server Type    : PostgreSQL
 Target Server Version : 90305
 File Encoding         : utf-8

 Date: 01/02/2016 11:42:44 AM
*/

-- ----------------------------
--  Table structure for Tag
-- ----------------------------
DROP TABLE IF EXISTS "expense"."Tag";
CREATE TABLE "expense"."Tag" (
    "id" SERIAL PRIMARY KEY NOT NULL,
    "tag_name" varchar(50) NOT NULL COLLATE "default",
    "tag_description" bit varying(100)
)
WITH (OIDS=FALSE);
ALTER TABLE "expense"."Tag" OWNER TO "sanju";



-- ----------------------------
--  Table structure for Expense
-- ----------------------------
DROP TABLE IF EXISTS "expense"."Expense";
CREATE TABLE "expense"."Expense" (
    "id" SERIAL PRIMARY KEY  NOT NULL,
    "expense_amount" numeric NOT NULL,
    "expense_description" varchar(100) COLLATE "default",
    "expense_datetime" timestamp(6) NULL
)
WITH (OIDS=FALSE);
ALTER TABLE "expense"."Expense" OWNER TO "sanju";


-- ----------------------------
--  Table structure for Expense_X_Tag
-- ----------------------------
DROP TABLE IF EXISTS "expense"."Expense_X_Tag";
CREATE TABLE "expense"."Expense_X_Tag" (
    "tag_id" SERIAL PRIMARY KEY  NOT NULL,
    "expense_id" integer NOT NULL
)
WITH (OIDS=FALSE);
ALTER TABLE "expense"."Expense_X_Tag" OWNER TO "sanju";



-- ----------------------------
--  Table structure for Currency
-- ----------------------------
DROP TABLE IF EXISTS "expense"."Currency";
CREATE TABLE "expense"."Currency" (
    "id" SERIAL PRIMARY KEY  NOT NULL,
    "currency_code" varchar(5) NOT NULL COLLATE "default",
    "currency_description" varchar(25) COLLATE "default"
)
WITH (OIDS=FALSE);
ALTER TABLE "expense"."Currency" OWNER TO "sanju";




-- ----------------------------
--  Foreign keys structure for table Expense_X_Tag
-- ----------------------------
ALTER TABLE "expense"."Expense_X_Tag" ADD CONSTRAINT "fk_tagId" FOREIGN KEY ("tag_id") REFERENCES "expense"."Tag" ("id") ON UPDATE CASCADE ON DELETE NO ACTION NOT DEFERRABLE INITIALLY IMMEDIATE;
ALTER TABLE "expense"."Expense_X_Tag" ADD CONSTRAINT "fk_expenseId" FOREIGN KEY ("expense_id") REFERENCES "expense"."Expense" ("id") ON UPDATE CASCADE ON DELETE NO ACTION NOT DEFERRABLE INITIALLY IMMEDIATE;

commit;