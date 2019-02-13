create table units
(
  id   serial not null
    constraint units_pkey
      primary key,
  name varchar(255)
);

alter table units
  owner to postgres;

INSERT INTO public.units (id, name) VALUES (1, 'day');
INSERT INTO public.units (id, name) VALUES (2, 'week');
INSERT INTO public.units (id, name) VALUES (3, 'month');