CREATE TABLE member (
	email varchar(45) not null primary key,
	pw varchar(45) not null,
	name varchar(50) not null,
	mtype varchar(15) not null,
	admin int default 0,
	profileno int
);

SELECT * FROM member;

SELECT * FROM profile;

select * from member where email = 'ysung1223@nate.com';

delete from member where email = 'ysung1223@nate.com';

alter table member drop column profileno;

ALTER TABLE member CHANGE type mtype varchar(15);

delete table member;

insert into member(email,pw,name,type) values("ysung1223@nate.com","1234","여성","감독");

CREATE TABLE profile (
	profileno int not null primary key,
	email varchar(45) not null,
	image varchar(100),
	birth varchar(15),
	height int,
	weight int,
	hobby varchar(15),
	phone varchar(20),
	foreign key (email) references member (email)
);

alter table profile modify email varchar(45);

alter table profile modify profileno int not null auto_increment;

alter table career modify email varchar(45);

CREATE TABLE career (
	careerno int auto_increment primary key,
	email varchar(45) not null,
	type varchar(15),
	title varchar(45),
	roll varchar(15),
	date varchar(15),
	foreign key (email) references member (email)
);



