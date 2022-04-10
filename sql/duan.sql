CREATE DATABASE `duan`

CREATE TABLE `multiplechoice` (
  `objectid` varchar(100) NOT NULL,
  `room_name` varchar(100) DEFAULT NULL,
  `question_name` varchar(100) DEFAULT NULL,
  `answer1` varchar(100) DEFAULT NULL,
  `answer2` varchar(100) DEFAULT NULL,
  `answer3` varchar(100) DEFAULT NULL,
  `answer4` varchar(100) DEFAULT NULL,
  `correct_answer` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO duan.multiplechoice (objectid,room_name,question_name,answer1,answer2,answer3,answer4,correct_answer) VALUES
	 ('8258','Phòng trưng bày số 1','Đâu là cơ quan ngôn luận của Đông Dương Cộng sản đảng?"','Báo Thanh niên','Báo Đỏ','Báo Giải phóng','Báo Búa liềm','answer4');
