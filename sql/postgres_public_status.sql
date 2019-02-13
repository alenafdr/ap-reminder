create table status
(
  id   serial not null
    constraint status_pkey
      primary key,
  name varchar(255)
);

alter table status
  owner to postgres;

INSERT INTO public.status (id, name) VALUES (1, 'done');
INSERT INTO public.status (id, name) VALUES (2, 'created');
INSERT INTO public.status (id, name) VALUES (3, 'send');
INSERT INTO public.status (id, name) VALUES (4, 'accept');
INSERT INTO public.status (id, name) VALUES (5, 'reject');