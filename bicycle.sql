DROP TABLE "BICYCLE_CATAGORY" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_DEAL" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_DEPLOY" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_INFO" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_ORDER" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_ORDER_DETAIL" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_PILE" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_RECORD" CASCADE CONSTRAINTS;

DROP TABLE "BICYCLE_STATION" CASCADE CONSTRAINTS;

DROP TABLE "CARD" CASCADE CONSTRAINTS;

DROP TABLE "CARD_INFO_RECORD" CASCADE CONSTRAINTS;

DROP TABLE "CARD_RECORD" CASCADE CONSTRAINTS;

DROP TABLE "MSPHASE" CASCADE CONSTRAINTS;

DROP TABLE "REPAIR_RECORD" CASCADE CONSTRAINTS;

DROP TABLE "SYPERMISSION" CASCADE CONSTRAINTS;

DROP TABLE "SYROLE" CASCADE CONSTRAINTS;

DROP TABLE "SYUSER" CASCADE CONSTRAINTS;

DROP TABLE "VENDER" CASCADE CONSTRAINTS;

CREATE TABLE "BICYCLE_CATAGORY"  (
   "CATAGORY_ID"        INT                             NOT NULL,
   "CATAGORY_NAME"      VARCHAR2(30)                    NOT NULL,
   "FRAME_TYPE"         VARCHAR2(30),
   "TIRE_TYPE"          VARCHAR2(30),
   "WEIGHT"             NUMBER(3),
   "HEIGHT"             NUMBER(3),
   "LENGTH"             NUMBER(3),
   "RING_TYPE"          VARCHAR2(30),
   "BASKET"             VARCHAR2(30),
   "BACKSEAT"           VARCHAR2(30),
   "BICYCLE_SEAT"       VARCHAR2(30),
   "HANDBRAKE"          VARCHAR2(30),
   "REMARK"             VARCHAR2(300),
   "USER_ID"            INT                             NOT NULL,
   "OPERATOR_TIME"      VARCHAR2(32)                    NOT NULL,
   CONSTRAINT PK_BICYCLE_CATAGORY PRIMARY KEY ("CATAGORY_ID")
);

CREATE TABLE "BICYCLE_DEAL"  (
   "DEAL_ID"            INT                             NOT NULL,
   "CREATE_TIME"        VARCHAR2(32)                    NOT NULL,
   "DEAL_NAME"          VARCHAR2(32),
   "DEAL_TYPE"          CHAR(1)                         NOT NULL,
   "RECORD_ID"          INT                             NOT NULL,
   "CARD_ID"            INT,
   "IS_FEE"             CHAR(1)                         NOT NULL,
   "CHG_MONEY"          NUMBER(13,2),
   "FEE_TYPE"           INT,
   "BICYCLE_ID"         INT,
   "PILE_ID"            INT,
   "USER_ID"            INT,
   CONSTRAINT PK_BICYCLE_DEAL PRIMARY KEY ("DEAL_ID")
);

CREATE TABLE "BICYCLE_DEPLOY"  (
   "DEPLOY_ID"          INT                             NOT NULL,
   "BICYCLE_ID"         INT,
   "FROM_PILE_ID"       INT,
   "TO_PILE_ID"         INT,
   "FROM_CARD_ID"       INT,
   "FROM_TIME"          VARCHAR2(32),
   "TO_CARD_ID"         INT,
   "TO_TIME"            VARCHAR2(32),
   "TO_REASON"          VARCHAR2(128),
   "FROM_REASON"        VARCHAR2(128),
   "REMARK"             VARCHAR2(200),
   "STATUS"             CHAR(1),
   CONSTRAINT PK_BICYCLE_DEPLOY PRIMARY KEY ("DEPLOY_ID")
);

CREATE TABLE "BICYCLE_INFO"  (
   "BICYCLE_ID"         INT                             NOT NULL,
   "BICYCLE_CODE"       VARCHAR2(15)                    NOT NULL,
   "STATUS"             CHAR(1)                         NOT NULL,
   "PILE_ID"            INT,
   "DESTORY_DATE"       VARCHAR2(15),
   "USER_ID"            INT,
   "OPERATOR_TIME"      VARCHAR2(32),
   "CARD_ID"            INT,
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_BICYCLE_INFO PRIMARY KEY ("BICYCLE_ID")
);

CREATE TABLE "BICYCLE_ORDER"  (
   "ORDER_ID"           INT                             NOT NULL,
   "ORDER_CODE"         VARCHAR2(20),
   "VENDER_ID"          INT,
   "BUY_DATE"           VARCHAR2(32)                    NOT NULL,
   "BUY_NUM"            NUMBER(5)                       NOT NULL,
   "BUY_PRICE"          NUMBER(10,2)                    NOT NULL,
   "PERSON_IN_CHARGE"   VARCHAR2(15),
   "INVOICE_NO"         VARCHAR2(20),
   "USER_ID"            INT,
   "OPERATOR_TIME"      VARCHAR2(32),
   "REMARK"             VARCHAR2(200),
   "STATUS"             CHAR(1),
   CONSTRAINT PK_BICYCLE_ORDER PRIMARY KEY ("ORDER_ID")
);

CREATE TABLE "BICYCLE_ORDER_DETAIL"  (
   "DETAIL_ID"          INT                             NOT NULL,
   "CATAGORY_ID"        INT,
   "ORDER_ID"           INT,
   "BICYCLE_ID"         INT                             NOT NULL,
   "CREATE_DATE"        VARCHAR2(8)                     NOT NULL,
   "BATCH_NO"           VARCHAR2(20)                    NOT NULL,
   "PRICE"              NUMBER(10,2)                    NOT NULL,
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_BICYCLE_ORDER_DETAIL PRIMARY KEY ("DETAIL_ID")
);

CREATE TABLE "BICYCLE_PILE"  (
   "PILE_ID"            INT                             NOT NULL,
   "VENDER_ID"          INT                             NOT NULL,
   "PILE_CODE"          VARCHAR2(20)                    NOT NULL,
   "STATION_ID"         INT                             NOT NULL,
   "STATUS"             CHAR(1)                         NOT NULL,
   "INSTALL_TIME"       VARCHAR2(32)                    NOT NULL,
   "DISASSEMBLY_TIME"   VARCHAR2(32),
   "USER_ID"            INT                             NOT NULL,
   "OPERATOR_TIME"      VARCHAR2(32),
   "BICYCLE_ID"         VARCHAR2(15),
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_BICYCLE_PILE PRIMARY KEY ("PILE_ID")
);

CREATE TABLE "BICYCLE_RECORD"  (
   "RECORD_ID"          INT                             NOT NULL,
   "BICYCLE_ID"         INT                             NOT NULL,
   "CARD_ID"            INT                             NOT NULL,
   "RENT_TIME"          VARCHAR2(32)                    NOT NULL,
   "RENT_PILE_ID"       INT                             NOT NULL,
   "RETURN_TIME"        VARCHAR2(32),
   "RETURN_PILE_ID"     INT,
   "MONEY"              NUMBER(13,2),
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_BICYCLE_RECORD PRIMARY KEY ("RECORD_ID")
);

CREATE TABLE "BICYCLE_STATION"  (
   "STATION_ID"         INT                             NOT NULL,
   "STATION_CODE"       VARCHAR2(20)                    NOT NULL,
   "STATION_NAME"       VARCHAR2(50)                    NOT NULL,
   "LONGITUDE"          NUMBER(10,5)                    NOT NULL,
   "LATITUDE"           NUMBER(10,5)                    NOT NULL,
   "BICYCLE_PILE_NUM"   NUMBER(2)                       NOT NULL,
   "ADDRESS"            VARCHAR2(100)                   NOT NULL,
   "PERSON_IN_CHARGE"   VARCHAR2(15),
   "BUILD_TIME"         VARCHAR2(32)                    NOT NULL,
   "RUN_TIME"           VARCHAR2(32)                    NOT NULL,
   "USER_ID"            INT,
   "CREATE_TIME"        VARCHAR2(32),
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_BICYCLE_STATION PRIMARY KEY ("STATION_ID")
);

CREATE TABLE "CARD"  (
   "CARD_ID"            INT                             NOT NULL,
   "CARD_CODE"          VARCHAR2(15),
   "CARD_TYPE"          INT                             NOT NULL,
   "NAME"               VARCHAR2(50)                    NOT NULL,
   "IDCARD"             VARCHAR2(18)                    NOT NULL,
   "SEX"                CHAR(1)                         NOT NULL,
   "TELPHONE"           VARCHAR2(20),
   "MOBILE"             VARCHAR2(15)                    NOT NULL,
   "EMAIL"              VARCHAR2(30)                    NOT NULL,
   "ADDRESS"            VARCHAR2(100),
   "WORK"               VARCHAR2(100),
   "ZXBJ"               CHAR(1),
   "MONTHLY_MONEY"      NUMBER(13,2),
   "FROZEN_MONEY"       NUMBER(13,2),
   "WALLET_MONEY"       NUMBER(13,2),
   "STATUS"             INT,
   CONSTRAINT PK_CARD PRIMARY KEY ("CARD_ID")
);

CREATE TABLE "CARD_INFO_RECORD"  (
   "RECORD_ID"          INT                             NOT NULL,
   "CARD_ID"            INT                             NOT NULL,
   "INFO_TYPE"          NUMBER(1)                       NOT NULL,
   "CREATE_TIME"        VARCHAR2(32)                    NOT NULL,
   "USER_ID"            INT                             NOT NULL,
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_CARD_INFO_RECORD PRIMARY KEY ("RECORD_ID")
);

CREATE TABLE "CARD_RECORD"  (
   "RECORD_ID"          INT                             NOT NULL,
   "CARD_ID"            INT                             NOT NULL,
   "FEE_TYPE"           INT                             NOT NULL,
   "CHG_MONTHLY_MONEY"  NUMBER(13,2),
   "CHG_WALLET_MONEY"   NUMBER(13,2),
   "CHG_FROZEN_MONEY"   NUMBER(13,2),
   "CREATE_TIME"        VARCHAR2(32)                    NOT NULL,
   "USER_ID"            INT,
   "REMARK"             VARCHAR2(200),
   "ZXBJ"               INT,
   CONSTRAINT PK_CARD_RECORD PRIMARY KEY ("RECORD_ID")
);

CREATE TABLE "MSPHASE"  (
   "PHASEID"            INT                             NOT NULL,
   URL                  VARCHAR2(200),
   "DESCRIPTION"        VARCHAR2(500),
   CONSTRAINT PK_MSPHASE PRIMARY KEY ("PHASEID")
);

CREATE TABLE "REPAIR_RECORD"  (
   "RECORD_ID"          INT                             NOT NULL,
   "BICYCLE_ID"         INT                             NOT NULL,
   "REPAIR_TYPE"        CHAR(1)                         NOT NULL,
   "REPAIR_PART"        VARCHAR2(100),
   "REPAIR_RESULT"      CHAR(1)                         NOT NULL,
   "FEE"                NUMBER(7,3),
   "REPAIRER"           VARCHAR2(15)                    NOT NULL,
   "REPAIR_DATE"        VARCHAR2(15)                    NOT NULL,
   "REMARK"             VARCHAR2(200),
   "USER_ID"            INT,
   "OPERATOR_TIME"      VARCHAR2(32),
   CONSTRAINT PK_REPAIR_RECORD PRIMARY KEY ("RECORD_ID")
);

CREATE TABLE "SYPERMISSION"  (
   "PERMISSIONID"       INT                             NOT NULL,
   ROLEID               INT                             NOT NULL,
   "PHASEID"            VARCHAR2(32),
   CONSTRAINT PK_SYPERMISSION PRIMARY KEY ("PERMISSIONID")
);

CREATE TABLE "SYROLE"  (
   "ROLE_ID"            INT                             NOT NULL,
   "ROLE_NAME"          VARCHAR2(50)                    NOT NULL,
   "ROLE_DESCRIBE"      VARCHAR2(100),
   CONSTRAINT PK_SYROLE PRIMARY KEY ("ROLE_ID")
);

CREATE TABLE "SYUSER"  (
   "USER_ID"            INT                             NOT NULL,
   "ROLE_ID"            INT,
   "LOGIN_NAME"         VARCHAR2(255)                   NOT NULL,
   "USERNAME"           VARCHAR2(20),
   "PASSWORD"           VARCHAR2(255)                   NOT NULL,
   "ACTIVE_FLAG"        NUMBER(1)                       NOT NULL,
   "ZXBJ"               CHAR(1)                         NOT NULL,
   "OFFICE_PHONE"       VARCHAR2(20),
   "MOBILE_PHONE"       VARCHAR2(15),
   "EMAIL"              VARCHAR2(50),
   CONSTRAINT PK_SYUSER PRIMARY KEY ("USER_ID")
);

CREATE TABLE "VENDER"  (
   "VENDER_ID"          INT                             NOT NULL,
   "VENDER_CODE"        VARCHAR2(10)                    NOT NULL,
   "VENDER_TYPE"        CHAR(1),
   "VENDER_NAME"        VARCHAR2(200)                   NOT NULL,
   "ADDRESS"            VARCHAR2(200)                   NOT NULL,
   "TELPHONE"           VARCHAR2(20)                    NOT NULL,
   "CONTACTS"           VARCHAR2(20)                    NOT NULL,
   "PRODUCT_LICENSE"    VARCHAR2(20)                    NOT NULL,
   "BUSSINESS_REGISTRATION_NO" VARCHAR2(20)                    NOT NULL,
   "REGISTERED_CAPITAL" NUMBER(12,2),
   "USER_ID"            INT,
   "CREATE_TIME"        VARCHAR2(32),
   "ZXBJ"               CHAR(1),
   "REMARK"             VARCHAR2(200),
   CONSTRAINT PK_VENDER PRIMARY KEY ("VENDER_ID")
);

