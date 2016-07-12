CREATE TABLE contact (
  id                INT AUTO_INCREMENT,
  contact_name      VARCHAR(50),
  contact_telnumber VARCHAR(20),

  PRIMARY KEY (id)
);

CREATE TABLE users (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(50) NOT NULL,
  enabled  BOOLEAN     NOT NULL
);

CREATE TABLE authorities (
  username  VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users (username),
  UNIQUE (username, authority)
);