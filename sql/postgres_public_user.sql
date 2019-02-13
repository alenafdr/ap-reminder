create table "user"
(
  id                serial       not null
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
    constraint fk_role_id
      references role
      on update cascade on delete cascade
    constraint role_id
      references role
      on update cascade on delete cascade,
  setting_id        integer
    constraint fk_setting_id
      references user_setting
);

alter table "user"
  owner to postgres;

create index fki_role_id
  on "user" (role_id);

create index fki_setting_id
  on "user" (setting_id);

