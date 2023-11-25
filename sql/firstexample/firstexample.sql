CREATE TABLE student (
    id              int primary key,
    name            char(25),      -- имя студента
    age             int,           -- возраст студента
    birthDate       date           -- дата рождения студента
);

CREATE TABLE course (
   id              int primary key,
   course_name     char(25)        -- название курса
);