--운영DB에는 없는 테이블
SELECT * FROM notexistsinprd;


--테스트 코드가 실행되기전 rangers 데이터 삭제
DELETE FROM rangers;


--rangers 초기 데이터 3건 입력
INSERT INTO rangers VALUES ('brown', '브라운');
INSERT INTO rangers VALUES ('cony', '코니');
INSERT INTO rangers VALUES ('sally', '샐리');


--jspuser
DELETE FROM jspuser;


-- 116건
INSERT INTO jspuser VALUES ('brown','브라운','f01471c38113db263f9a532d8b6c054af31bf653aeea92d1c284cdd022b9','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.con','123123123','/profile/brown.png');
INSERT INTO jspuser VALUES ('sally','샐리','65c8b7874e6e1d2bc0978232e2274f7764ac156926db381f74f7b46fc5dc','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/04/27','sally@gmail.con','123123123','/profile/sally.png');
INSERT INTO jspuser VALUES ('moon','문','03d1c81a2397bb51dface79a897decd50e7f4d8ea7fd547c8506d80e282905e','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/06','moon@gmail.con','123123123','/profile/moon.png');
INSERT INTO jspuser VALUES ('james','제임스','249bbac76e15fc9f93dba1ba0b5b7cc5a4b6f2a7d57a4a50b944dbd45ecd41','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/02/14','james@gmail.con','123123123','/profile/james.png');
INSERT INTO jspuser VALUES ('xxxx1','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx2','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx3','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx4','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx5','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx6','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx7','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx8','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx9','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx10','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx11','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx12','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx13','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx15','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx16','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx18','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx19','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx21','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx22','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx24','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx25','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx27','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx28','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx30','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx31','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx33','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx34','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx36','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx37','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx39','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx40','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx42','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx43','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx45','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx46','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx48','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx49','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx51','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx52','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx54','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx55','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx56','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx57','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx58','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx59','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx60','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx61','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx62','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx63','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx64','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx65','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx66','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx67','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx68','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx69','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx70','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx71','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx73','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx74','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx76','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx77','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx79','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx80','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx82','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx83','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx85','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx86','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx88','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx89','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx91','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx92','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx94','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx95','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx97','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx98','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx100','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('ryan','ryan','ryanpass','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan.png');
INSERT INTO jspuser VALUES ('xxxx23','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx26','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx29','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx32','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx35','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx38','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx41','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx44','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx47','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx50','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx53','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx72','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx75','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx78','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx81','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx84','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx87','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx90','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx93','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx96','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx99','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('cony','코니','9299a16ffb4d721536dddc82d646c9ed3f78971f5a3fcd3439ef223a35903cda','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/08/08','cony@gmail.con','123123123','/profile/cony.png');
INSERT INTO jspuser VALUES ('minions1','testUserId','pass1234','대전광역시','알거없구','31059','91/08/14','mi@ni.ons','042-627-0550','');
INSERT INTO jspuser VALUES ('brown5','sally','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown5.png');
INSERT INTO jspuser VALUES ('brown9','sally','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown9.png');
INSERT INTO jspuser VALUES ('brown10','sally','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown010.png');
INSERT INTO jspuser VALUES ('brown11','sally','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown011.png');
INSERT INTO jspuser VALUES ('brown001','brown001','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/brown001.png');
INSERT INTO jspuser VALUES ('minions2','testUserId','pass1234','대전광역시','알거없구','31059','91/08/14','mi@ni.ons','042-627-0550','');
INSERT INTO jspuser VALUES ('userRyan','userRyan','ryanpass','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan2.png');
INSERT INTO jspuser VALUES ('minions','minions','fce41cf036529bd2cd7fd9e865a0c68a67514f2b9ddcedb1e4824fb4e2','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/minions.jpg');
INSERT INTO jspuser VALUES ('aaa','aaa','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','C:\ddit\A_TeachingMaterial\6.JspSrpgin\upload\moon.png');
INSERT INTO jspuser VALUES ('xxxx14','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx17','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
INSERT INTO jspuser VALUES ('xxxx20','xxxx','4affea9ab1a488ab4b83227cfbed2e18b94cbcf61d32e46aa15b7e0c413b650','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');

