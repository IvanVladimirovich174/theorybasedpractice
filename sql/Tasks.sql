create table book
(
    id         serial primary key,
    title      varchar(30),
    author     varchar(30),
    date_added timestamp
);

select *
from book;

insert into book(title, author, date_added)
values ('Nedorosl', 'D.I.Fonvizin', now());

/* value too long for type character varying(30) */
insert into book(title, author, date_added)
values ('Travel from St. Petersburg to Moscow', 'A.N.Radishev', now() - interval '24h');

/* change column title in book table */
alter table book
    alter column title type varchar(100);

/* change column author in book table */
alter table book
    alter column author type varchar(100);

/* change table name */
alter table book
    rename to books;

insert into books (id, title, author, date_added)
values (3, 'Doctor Jivago', 'B.l.Pasternak', now() - interval '24h');

insert into books
values (4, 'My sister - life', 'B.l.Pasternak', now());

delete
from books
where id = 1;

/* add again */
insert into books(id, title, author, date_added)
values (1, 'Nedorosl', 'D.I.Fonvizin', now());

/* delete all values in table */
truncate table books;

/* delete table */
drop table books;

select *
from books
where id = 2;

select *
from books;

/* pagination - get first 4 records */
select *
from books
limit 4;

/* pagination - get 4 records from 2 exclusive */
select *
from books
offset 2 limit 4;

/* pagination formula:
  limit = number of records on one page
  offset = (current page - 1) * number of records on one page
 */

/* find books where title = 'Nedorosl' */
select *
from books
where title = 'Nedorosl';

/* find all Pasternak's books */
select *
from books
where author like '%Pasternak';

/* get max id */
select max(id)
from books;

/* find all Radishev's and Pasternak's books
   sorted descending order by date_added */
select *
from books
where author like '%Pasternak'
   or author like '%Radishev'
order by date_added desc;

/* find all Pasternak's books which added yesterday */
select *
from books
where author like '%Pasternak'
  and date_added <= now() - interval '24h'
  and date_added >= now() - interval '48h';

update books
set date_added = '2020-02-02'
where id = 2;

select *
from books
where id = 2;

update books
set date_added = '2020-02-02'
where title like '%Nedorosl';

select *
from books;

create table reviews
(
    id       serial primary key,
    book_id  integer references books,
    reviewer varchar(100) not null,
    rating   integer      not null,
    comment  varchar(100) null
);

/* Key (book_id)=(777) is not present in table "books" */
insert into reviews (book_id, reviewer, rating, comment)
values (777, 'Petya', 9, 'Good book');

select *
from reviews;

insert into reviews (book_id, reviewer, rating, comment)
values (2, 'Petya', 9, 'Good book');

insert into reviews (book_id, reviewer, rating)
values (1, 'Kirill', 9);

insert into reviews (book_id, reviewer, rating, comment)
values (3, 'Petya', 7, 'ok');

insert into reviews (book_id, reviewer, rating, comment)
values (4, 'Innokentyi', 2, 'Didn''t like');

/* get records from table "reviews", where comment != null */
select *
from reviews
where comment is not null;

/* count number of records in table "reviews";
   give name the column "number_of_reviews"
*/
select count(*) as number_of_reviews
from reviews;

/* get all comments from table "reviews";
give name the column "text"
*/
select comment as text
from reviews;

/* count number of unique books' id for which reviews have been left */
select count(distinct book_id)
from reviews;

/* get number of reviews for every book's id */
select count(*), book_id
from reviews
group by book_id;

/* get all records from table "books" and table "reviews" */
select *
from books b,
     reviews r
where b.id = r.book_id;

select *
from books b
         join reviews r on b.id = r.book_id;

/* get all books which don't have comments with help of LEFT JOIN */
select *
from books b
         left join reviews r on b.id = r.book_id;