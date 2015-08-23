DROP TABLE comments IF EXISTS;

CREATE TABLE comments (
  id         INTEGER IDENTITY PRIMARY KEY,
  content VARCHAR(200),
  author  VARCHAR(30)
);