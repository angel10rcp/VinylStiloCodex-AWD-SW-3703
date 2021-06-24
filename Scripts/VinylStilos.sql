/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     6/19/2021 12:49:31 PM                        */
/*==============================================================*/


alter table DESCRIPTIONSALE 
   drop foreign key FK_DESCRIPT_DESCRIPTI_SALE;

alter table DESCRIPTIONSALE 
   drop foreign key FK_DESCRIPT_DESCRIPTI_PRODUCT;

alter table SALE 
   drop foreign key FK_SALE_USERSALE_USER;


alter table DESCRIPTIONSALE 
   drop foreign key FK_DESCRIPT_DESCRIPTI_SALE;

alter table DESCRIPTIONSALE 
   drop foreign key FK_DESCRIPT_DESCRIPTI_PRODUCT;

drop table if exists DESCRIPTIONSALE;

drop table if exists PRODUCT;


alter table SALE 
   drop foreign key FK_SALE_USERSALE_USER;

drop table if exists SALE;

drop table if exists USER;

/*==============================================================*/
/* Table: DESCRIPTIONSALE                                       */
/*==============================================================*/
create table DESCRIPTIONSALE
(
   IDDESCRIPTIONSALE    varchar(5)  comment '',
   IDSALE               varchar(5) not null  comment '',
   IDPRODUCT            varchar(5) not null  comment '',
   AMOUNTPRODUCTSALE    int  comment '',
   primary key (IDSALE, IDPRODUCT)
);

/*==============================================================*/
/* Table: PRODUCT                                               */
/*==============================================================*/
create table PRODUCT
(
   IDPRODUCT            varchar(5) not null  comment '',
   NAMEPRODUCT          varchar(16)  comment '',
   DESCRIPTIONPRODUCT   varchar(128)  comment '',
   IMAGEPRODUCT         varchar(64)  comment '',
   PRICE                numeric(6,2)  comment '',
   AMOUNTPRODUCT        int  comment '',
   CATEGORY             varchar(16)  comment '',
   primary key (IDPRODUCT)
);

/*==============================================================*/
/* Table: SALE                                                  */
/*==============================================================*/
create table SALE
(
   IDSALE               varchar(5) not null  comment '',
   IDUSER               varchar(5)  comment '',
   TOTALSALE            numeric(6,2)  comment '',
   DATESALE             datetime  comment '',
   primary key (IDSALE)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   IDUSER               varchar(5) not null  comment '',
   FIRSTNAME            varchar(16)  comment '',
   LASTNAME             varchar(16)  comment '',
   EMAIL                varchar(32)  comment '',
   PASSWORD             varchar(16)  comment '',
   primary key (IDUSER)
);

alter table DESCRIPTIONSALE add constraint FK_DESCRIPT_DESCRIPTI_SALE foreign key (IDSALE)
      references SALE (IDSALE) on delete restrict on update restrict;

alter table DESCRIPTIONSALE add constraint FK_DESCRIPT_DESCRIPTI_PRODUCT foreign key (IDPRODUCT)
      references PRODUCT (IDPRODUCT) on delete restrict on update restrict;

alter table SALE add constraint FK_SALE_USERSALE_USER foreign key (IDUSER)
      references USER (IDUSER) on delete restrict on update restrict;

