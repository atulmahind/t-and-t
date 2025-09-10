
create table if not exists user
(
    user_id    varchar(50) not null,
    first_name varchar(50) not null,
    last_name  varchar(50),
    email      varchar(100) not null,
    age        int,
    primary key (user_id)
) engine=InnoDB;

alter table clothing_item_entity
    add constraint fk_user
    foreign key (user_id) references user (user_id);


