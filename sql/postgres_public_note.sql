create table note
(
  id          serial not null
    constraint note_pkey
      primary key,
  content     varchar(255),
  reminder_id integer
    constraint fk_reminder_id
      references reminder
);

alter table note
  owner to postgres;

create index note_reminder_id_index
  on note (reminder_id);

