create table time_units
(
  id    bigserial not null
    constraint time_units_pkey
      primary key,
  name varchar(255)
);

--INSERT INTO time_units ( name) VALUES ( 'day');
--INSERT INTO time_units ( name) VALUES ( 'week');
--INSERT INTO time_units ( name) VALUES ( 'month');


create table user_setting
(
  id                bigserial not null
    constraint user_setting_pkey
      primary key,
  timezone          integer default 0,
  reminder_timelife integer default 1,
  units_id          integer default 1
    constraint units_id
      references time_units
      on delete cascade

);
create index fki_user_setting__index
  on user_setting (units_id);

create table role
(
  id   bigserial not null
    constraint role_pkey
      primary key,
  type varchar(255)
);
--INSERT INTO role ( type) VALUES ( 'client');
--INSERT INTO role ( type) VALUES ( 'admin');

create table "user"
(
  id                bigserial       not null
    constraint user_pkey
      primary key,
  firstname         varchar(255) not null,
  lastname          varchar(255) not null,
  patronymic        varchar(255),
  email             varchar(255) not null,
  login             varchar(255) not null,
  password          varchar(255) not null,
  date_registration timestamp(6) not null,
  role_id           integer
    constraint role_id
      references role
      on delete cascade,
  setting_id        integer
    constraint setting_id
      references user_setting
      on delete cascade

);
create index fki_user__index
  on "user" (role_id);

create index fki_user__index__setting
  on "user" (setting_id);





create table status
(
  id    bigserial not null
    constraint status_pkey
      primary key,
  name varchar(255)
);

--INSERT INTO status ( name) VALUES ( 'done');
--INSERT INTO status ( name) VALUES ( 'created');
--INSERT INTO status ( name) VALUES ( 'send');
--INSERT INTO status ( name) VALUES ( 'accept');
--INSERT INTO status ( name) VALUES ('reject');




create table list
(
  id    bigserial not null
    constraint list_pkey
      primary key,
  name varchar(255),
  user_id     integer
    constraint user_id
      references "user"
      on delete cascade

);
create index list_user_id_index
  on list (user_id);


create table reminder
(
  id            bigserial           not null
    constraint reminder_pkey
      primary key,
  name         varchar(255)      not null,
  date_create  timestamp(6),
  date_finish  timestamp(6),
  date_start   timestamp(6),
  priority     integer default 1 not null,
  owner        integer           not null
    constraint owner
      references "user"
      on delete cascade,
  executor     integer           not null
    constraint executor
      references "user"  on delete cascade,
  count_repeat integer,
  status_id    integer
    constraint status_id
      references status
      on delete cascade,
  units_id     integer
    constraint units_id
      references time_units
      on delete cascade,
  list_id      integer
    constraint list_id
      references list
      on delete cascade

);
create index reminder_owner_index
  on reminder (owner);

create index reminder_executor_index
  on reminder (executor);

create index reminder_status_id_index
  on reminder (status_id);

create index reminder_units_id_index
  on reminder (units_id);

create index reminder_list_id_index
  on reminder (list_id);

create table note
(
  id           bigserial not null
    constraint note_pkey
      primary key,
  content     varchar(255),
  reminder_id integer
    constraint reminder_id
      references reminder
      on delete cascade

);
create index note_reminder_id_index
  on note (reminder_id);


create table files
(
  id   bigserial not null
    constraint files_pkey
      primary key,
  name       varchar(255),
  address_file       varchar(255),
  reminder_id  integer
    constraint reminder_id
      references reminder
      on delete cascade


);
create index files_reminder_id_index
  on files (reminder_id);


create table label
(
  id    bigserial not null
    constraint label_pkey
      primary key,
  name varchar(255),
  user_id integer
    constraint user_id
      references "user"
      on delete cascade


);
create index label_user_id_index
  on label (user_id);

create table reminder_label
(
  id          bigserial not null
    constraint reminder_label_pkey
      primary key,
  reminder_id integer
    constraint reminder_id
      references reminder
      on delete cascade,
  label_id    integer
    constraint label_id
      references label
      on delete cascade

);
create index reminder_label_reminder_id_index
  on reminder_label (reminder_id);

create index reminder_label_label_id_index
  on reminder_label (label_id);























