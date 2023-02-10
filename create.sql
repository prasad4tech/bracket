create table group (name varchar(255) not null, primary key (name)) engine=InnoDB;
create table match (id bigint not null, match_type varchar(255), result_id bigint, team1_name varchar(255), team2_name varchar(255), primary key (id)) engine=InnoDB;
create table result (id bigint not null auto_increment, is_draw bit not null, is_penalties bit not null, t1goals integer not null, t1penalty_goals integer not null, t2goals integer not null, t2penalty_goals integer not null, winner_name varchar(255), primary key (id)) engine=InnoDB;
create table team (name varchar(255) not null, primary key (name)) engine=InnoDB;
create table tournament (code varchar(255) not null, name integer not null, year integer not null, primary key (code)) engine=InnoDB;
alter table match add constraint FKcq697h992wsp2l5cvxr1vjpx foreign key (result_id) references result (id);
alter table match add constraint FKk1eqi1nfqpou2c2cjcy92j08j foreign key (team1_name) references team (name);
alter table match add constraint FKg7bl15hjhoubq0p709fvm26g7 foreign key (team2_name) references team (name);
alter table result add constraint FK1w8bw7vv2iohwe0q0uwo3sfaw foreign key (winner_name) references team (name);
