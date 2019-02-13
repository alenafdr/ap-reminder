create table reminder
(
  id           serial            not null
    constraint reminder_pkey
      primary key,
  name         varchar(255)      not null,
  date_create  timestamp(6),
  date_finish  timestamp(6),
  date_start   timestamp(6),
  priority     integer default 1 not null,
  owner        integer           not null
    constraint fk_owner
      references "user"
      on delete cascade,
  executor     integer           not null
    constraint fk_executor
      references "user"
      on delete set null,
  count_repeat integer,
  status_id    integer
    constraint fk_status_id
      references status
      on update cascade on delete cascade,
  units_id     integer
    constraint fk_units_id
      references units
      on update cascade on delete cascade,
  list_id      integer
    constraint fk_list_id
      references list
      on update cascade on delete cascade
);

alter table reminder
  owner to postgres;

create index fki_list_id
  on reminder (list_id);

create index fki_status_id
  on reminder (status_id);

create index fki_units_id
  on reminder (units_id);

create index fki__owner
  on reminder (owner);

create index fki_executor
  on reminder (executor);

