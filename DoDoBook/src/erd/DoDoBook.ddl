DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE board_type CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE jumun_detail CASCADE CONSTRAINTS;
DROP TABLE jumun CASCADE CONSTRAINTS;
DROP TABLE book CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;


DROP SEQUENCE board_no_SEQ;
DROP SEQUENCE board_type_no_SEQ;
DROP SEQUENCE cart_no_SEQ;
DROP SEQUENCE jumun_detail_no_SEQ;
DROP SEQUENCE jumun_no_SEQ;
DROP SEQUENCE member_no_SEQ;
DROP SEQUENCE reply_no_SEQ;

CREATE SEQUENCE board_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE board_type_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE jumun_detail_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE jumun_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE member_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;
CREATE SEQUENCE reply_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

/**********************************/
/* Table Name: 회원 */
/**********************************/
CREATE TABLE member(
		member_no                     		NUMBER(10)		 NOT NULL,
		member_id                     		VARCHAR2(20)		 NOT NULL,
		member_password               		VARCHAR2(20)		 NOT NULL,
		member_question               		VARCHAR2(50)		 NOT NULL,
		member_answer                 		VARCHAR2(50)		 NOT NULL,
		member_name                   		VARCHAR2(20)		 NOT NULL,
		member_birthday               		NUMBER(10)		 NOT NULL,
		member_gender                 		VARCHAR2(10)		 NOT NULL,
		member_email                  		VARCHAR2(50)		 NOT NULL,
		member_zipcode                		VARCHAR2(10)		 NOT NULL,
		member_address1               		VARCHAR2(100)		 NOT NULL,
		member_address2               		VARCHAR2(30)		 NOT NULL,
		member_phone                  		VARCHAR2(20)		 NOT NULL,
		member_point                  		NUMBER(10)		 DEFAULT 0		 NOT NULL,
		member_since                  		DATE		 DEFAULT sysdate		 NOT NULL
);

/**********************************/
/* Table Name: 도서 */
/**********************************/
CREATE TABLE book(
		book_code                     		VARCHAR2(20)		 NOT NULL,
		book_name                     		VARCHAR2(100)		 NOT NULL,
		book_price                    		NUMBER(10)		 NOT NULL,
		book_point                    		NUMBER(10)		 NOT NULL,
		book_image                    		VARCHAR2(30)		 NOT NULL,
		book_stock                    		NUMBER(10)		 NOT NULL,
		book_page                     		NUMBER(10)		 NOT NULL,
		book_writer                   		VARCHAR2(30)		 NOT NULL,
		book_company                  		VARCHAR2(50)		 NOT NULL,
		book_publish                  		DATE		 NULL ,
		book_desc                     		VARCHAR2(1000)		 NOT NULL,
		book_contents                 		VARCHAR2(2000)		 NOT NULL,
		book_salecount                		NUMBER(10)		 NOT NULL
);

/**********************************/
/* Table Name: 주문 */
/**********************************/
CREATE TABLE jumun(
		jumun_no                      		NUMBER(10)		 NOT NULL,
		jumun_date                    		DATE		 DEFAULT sysdate		 NOT NULL,
		jumun_reciever                		VARCHAR2(20)		 NOT NULL,
		jumun_zipcode                 		VARCHAR2(10)		 NOT NULL,
		jumun_address1                		VARCHAR2(100)		 NOT NULL,
		jumun_address2                		VARCHAR2(30)		 NOT NULL,
		jumun_phone                   		VARCHAR2(20)		 NOT NULL,
		jumun_state                   		VARCHAR2(30)		 DEFAULT '입금요망'		 NOT NULL,
		member_no                     		NUMBER(10)		 NULL 
);

/**********************************/
/* Table Name: 주문상세 */
/**********************************/
CREATE TABLE jumun_detail(
		jumun_detail_no               		NUMBER(10)		 NOT NULL,
		jumun_detail_count            		NUMBER(10)		 NOT NULL,
		jumun_no                      		NUMBER(10)		 NULL ,
		book_code                     		VARCHAR2(20)		 NULL 
);

/**********************************/
/* Table Name: 장바구니 */
/**********************************/
CREATE TABLE cart(
		cart_no                       		NUMBER(10)		 NOT NULL,
		cart_count                    		NUMBER(10)		 NOT NULL,
		book_code                     		VARCHAR2(20)		 NULL ,
		member_no                     		NUMBER(10)		 NULL 
);

/**********************************/
/* Table Name: 게시판타입 */
/**********************************/
CREATE TABLE board_type(
		board_type_no                 		NUMBER(10)		 NOT NULL,
		board_type_name               		VARCHAR2(20)		 NOT NULL
);

/**********************************/
/* Table Name: 게시판 */
/**********************************/
CREATE TABLE board(
		board_no                      		NUMBER(10)		 NOT NULL,
		board_name                    		VARCHAR2(50)		 NOT NULL,
		board_contents                		VARCHAR2(2000)		 NOT NULL,
		board_writer                  		VARCHAR2(50)		 NOT NULL,
		board_date                    		DATE		 NOT NULL,
		board_group                   		NUMBER(10)		 NOT NULL,
		board_step                    		NUMBER(10)		 NOT NULL,
		board_depth                   		NUMBER(2)		 NOT NULL,
		board_inq_count               		NUMBER(10)		 NOT NULL,
		board_password                		NUMBER(10)		 NOT NULL,
		board_type_no                 		NUMBER(10)		 NULL ,
		member_no                     		NUMBER(10)		 NULL 
);

/**********************************/
/* Table Name: 댓글 */
/**********************************/
CREATE TABLE reply(
		reply_no                      		NUMBER(10)		 NOT NULL,
		reply_writer                  		VARCHAR2(20)		 NOT NULL,
		reply_contents                		VARCHAR2(300)		 NOT NULL,
		reply_date                    		DATE		 NOT NULL,
		reply_password                		NUMBER(10)		 NOT NULL,
		board_no                      		NUMBER(10)		 NULL 
);

ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (member_no);

ALTER TABLE book ADD CONSTRAINT IDX_book_PK PRIMARY KEY (book_code);

ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_PK PRIMARY KEY (jumun_no);
ALTER TABLE jumun ADD CONSTRAINT IDX_jumun_FK0 FOREIGN KEY (member_no) REFERENCES member (member_no);

ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_PK PRIMARY KEY (jumun_detail_no);
ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_FK0 FOREIGN KEY (jumun_no) REFERENCES jumun (jumun_no);
ALTER TABLE jumun_detail ADD CONSTRAINT IDX_jumun_detail_FK1 FOREIGN KEY (book_code) REFERENCES book (book_code);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (book_code) REFERENCES book (book_code);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (member_no) REFERENCES member (member_no);

ALTER TABLE board_type ADD CONSTRAINT IDX_board_type_PK PRIMARY KEY (board_type_no);

ALTER TABLE board ADD CONSTRAINT IDX_board_PK PRIMARY KEY (board_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK0 FOREIGN KEY (board_type_no) REFERENCES board_type (board_type_no);
ALTER TABLE board ADD CONSTRAINT IDX_board_FK1 FOREIGN KEY (member_no) REFERENCES member (member_no);

ALTER TABLE reply ADD CONSTRAINT IDX_reply_PK PRIMARY KEY (reply_no);
ALTER TABLE reply ADD CONSTRAINT IDX_reply_FK0 FOREIGN KEY (board_no) REFERENCES board (board_no);

