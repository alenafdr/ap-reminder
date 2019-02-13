create table role
(
  id   serial not null
    constraint role_pkey
      primary key,
  type varchar(255)
);

alter table role
  owner to postgres;

INSERT INTO public.role (id, type) VALUES (1, 'client');
INSERT INTO public.role (id, type) VALUES (2, 'admin');