
create table if not exists clothing_item_entity (
          item_id varchar(50) not null,
          category varchar(20) not null,
          color varchar(20) not null,
          is_new boolean,
          laundry_state varchar(20) not null,
          size varchar(5) not null,
          description varchar(300),
          name varchar(20) not null,
          user_id varchar(20) not null,
          primary key (item_id)
) engine=InnoDB;
