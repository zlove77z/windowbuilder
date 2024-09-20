show tables;

create table hoewon (
	idx int not null auto_increment primary key,
	name varchar(30) not null,
	age int default 20,
	gender char(2) default '여자',
	joinday datetime default now(),
	address varchar(20)
);

desc hoewon;
desc test;

insert into hoewon values (default, '홍길동', default, '남자', default, '서울');
insert into hoewon values (default, '김말숙', 23, '여자', default, '서울');
insert into hoewon values (default, '이기자', 33, '남자', default, '서울');
insert into hoewon values (default, '이숙자', 44, '여자', default, '서울');
insert into hoewon values (default, '황선홍', 22, '남자', default, '서울');

select * from hoewon;