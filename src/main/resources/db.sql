CREATE TABLE user
(
  id         INT AUTO_INCREMENT
    PRIMARY KEY,
  username   VARCHAR(255) NOT NULL,
  password   VARCHAR(255) NOT NULL,
  address    VARCHAR(255) NOT NULL,
  createTime DATETIME     NOT NULL,
  updateTime DATETIME     NULL
);