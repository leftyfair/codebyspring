drop table if exists board;

create table board(
	bno int auto_increment primary key,
    title varchar(200) not null,
    content text,
    writer varchar(50),
    regdate timestamp default current_timestamp,
    updatedate timestamp default current_timestamp
);

insert into board(title, content, writer) values
('제목테스트1', '내용테스트1', '테스터1'),
('제목테스트2', '내용테스트2', '테스터2'),
('제목테스트3', '내용테스트3', '테스터3');