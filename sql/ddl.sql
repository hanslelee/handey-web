drop table if exists todo_box CASCADE;
create table todo_box
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    title varchar(255),
    fixed boolean default 0,
    primary key (id)
);

drop table todo_box;

drop table if exists weekly_box CASCADE;
create table weekly_box
(
    id bigint generated by default as identity,
    title varchar(255),
    primary key (id)
);

drop table if exists todo_elm CASCADE;
create table todo_elm
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
    content varchar(255),
    completed boolean default 0,
    to_do_box_id bigint not null,
    primary key (id),
    foreign key (to_do_box_id) references todo_box(id) on delete cascade
);

drop table if exists join_box CASCADE;
create table join_box
(
     id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
     username varchar(255),
     email varchar(255),
     password varchar(255),
     primary key(id)
);

--     id bigint generated by default as identity,