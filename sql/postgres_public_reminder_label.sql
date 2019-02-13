create table reminder_label
(
  id          serial not null
    constraint reminder_label_pkey
      primary key,
  reminder_id integer
    constraint fk_reminder_id
      references reminder
      on delete cascade,
  label_id    integer
    constraint fk_label_id
      references label
      on delete set null
);

alter table reminder_label
  owner to postgres;

create index fki_reminder_label_label_id
  on reminder_label (label_id);

create index fki_reminder_label_reminder_id
  on reminder_label (reminder_id);

