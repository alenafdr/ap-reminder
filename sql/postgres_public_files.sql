create table files
(
  id          serial not null
    constraint files_pkey
      primary key,
  file        varchar(255),
  reminder_id integer
    constraint fk_reminder_id
      references reminder
      on delete set null
);

alter table files
  owner to postgres;

create index files_reminder_id_index
  on files (reminder_id);

