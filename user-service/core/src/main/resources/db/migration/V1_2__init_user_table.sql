SET search_path TO "users", public;

CREATE SEQUENCE IF NOT EXISTS sq__user_id;

CREATE TABLE IF NOT EXISTS "user" (
    "id" int8 NOT NULL DEFAULT nextval('sq__user_id'),
    "data" jsonb NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY ("id")
);