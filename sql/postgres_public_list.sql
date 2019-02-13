create table list
(
  id   serial not null
    constraint list_pkey
      primary key,
  name varchar(255)
);

alter table list
  owner to postgres;

INSERT INTO public.list (id, name) VALUES (1, 'job');
INSERT INTO public.list (id, name) VALUES (2, 'personal');
INSERT INTO public.list (id, name) VALUES (3, 'study');
INSERT INTO public.list (id, name) VALUES (4, 'delegating');