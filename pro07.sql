--회원테이블
create table member(
id varchar2(30) primary key,
pw varchar2(50) not null,
name varchar2(20) not null,
address varchar2(50) not null,
email varchar2(30) not null,
tel varchar2(13) not null,
regdate date default sysdate
);

insert into member values('jin','1234','진석','경기도김포시','a87@naver.com','010-1234-1234',sysdate);

--게시판테이블
create table board(
no int primary key,
title varchar2(200) not null,
content varchar2(2000) not null,
id varchar2(30) not null,
regdate date default sysdate
);
--보드테이블에 컬럼 추가
alter table board add visited int default 0;
--컬럼명 id > writer로 변경
alter table board rename column id to writer;

--외래키 생성
ALTER TABLE board ADD CONSTRAINT fk_board foreign KEY(id) references member (id);
--ALTER TABLE [FK를 생성시킬 테이블명]
--ADD CONSTRAINT [FK명] foreign KEY(FK가 될 컬럼명) references [PK가 위치하는 테이블] ([PK컬럼명]);
--보드 시퀀스 생성
create sequence seq_board increment by 1 start WITH 1 ;

insert into board values(seq_board.nextval,'글제목1','글내용1','jin',sysdate);
insert into board values(seq_board.nextval,'글제목2','글내용2','jin',sysdate,0);  --시퀀스사용
insert into board values((select nvl(max(no),0) + 1 from board),'제목2','내용2','jin',sysdate,0);   --시퀀스 x
insert into board values((SELECT NVL(MAX(no),0) + 1 FROM board),'nvl1','nvltest','jin',sysdate,0);
insert into board values((select nvl(max(no),0) +1 from board),'nvl2','nvltest2','jin',sysdate,0);
insert into board values((select nvl(max(no),0)+1 from board),'제목5','내용5','jin',sysdate,0);



--등록된 글수 카운트 
select count(*)from board;

select *from board;
