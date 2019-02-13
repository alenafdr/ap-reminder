create table user_setting
(
  id                serial not null
    constraint user_setting_pkey
      primary key,
  timezone          integer default 0,
  reminder_timelife integer default 1,
  units_id          integer default 1
    constraint fk_user_setting
      references user_setting
      on delete cascade
);

alter table user_setting
  owner to postgres;

