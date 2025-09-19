create table clothing_item_entity (
          item_id varchar(20) not null,
          category varchar(20),
          color varchar(20),
          is_new bit,
          laundry_state varchar(20),
          size varchar(5),
          description varchar(300),
          name varchar(20),
          user_id varchar(20),
          primary key (item_id)
) engine=InnoDB;
