create table label
(
  id   serial not null
    constraint label_pkey
      primary key,
  name varchar(255)
);

alter table label
  owner to postgres;

