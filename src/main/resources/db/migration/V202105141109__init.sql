CREATE TABLE student
(
    id               varchar(64) NOT NULL,
    name             varchar(64) NULL,
    created_at       TIMESTAMP   NOT NULL,
    created_by       varchar(64) NOT NULL,
    last_modified_at TIMESTAMP   NOT NULL,
    last_modified_by varchar(64) NOT NULL,
    enabled          boolean     NOT NULL,
    PRIMARY KEY (id) USING BTREE
);