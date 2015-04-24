-- 需要注意的是，在建表中必须使用users做为表名，并且表中必须含有username和password这两个字段，其他的字段可以自行扩展
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
