-- CREATE DATABASE IF NOT EXISTS `duan`
--
-- duan.play definition

CREATE TABLE IF NOT EXISTS `play` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `question_name` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                        `question_type` varchar(40) DEFAULT NULL,
                        `description` varchar(10000) DEFAULT NULL,
                        `correct_answer` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
                        `is_active` tinyint DEFAULT '0',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO duan.play (question_name, question_type, description, correct_answer, is_active)
VALUES ('Đâu là cơ quan ngôn luận của Đông Dương Cộng sản đảng?', 'multiplechoice',
        '{"option1": "Báo Thanh niên", "option2": "Báo Đỏ", "option3": "Báo Giải phóng", "option4": "Báo Búa liềm"}',
        'option4', 0),
       ('Nước Việt Nam có quyền hưởng tự do và độc lập, và sự thật đã trở thành một nước tự do, độc lập là nội dung của văn bản nào?',
        'multiplechoice',
        '{"option1": "Lời kêu gọi toàn quốc kháng chiến", "option2": "Kháng chiến nhất định thắng lợii", "option3": "Tuyên ngôn độc lập", "option4": "Đường Kách mệnh"}',
        'option3', 0),
       ('Ngày khai sinh ra nước Cộng hòa xã hội chủ nghĩa Việt Nam là?', 'multiplechoice',
        '{"option1": "30/4/1975", "option2": "15/9/1945", "option3": "2/9/1945", "option4": "15/8/1945"}', 'option3',
        0),
       ('Khi nào Việt Nam có gạo để xuất khẩu?', 'multiplechoice',
        '{"option1": "Năm 1989", "option2": "Năm 1990", "option3": "Năm 1991", "option4": "Năm 1992"}', 'option1', 0),
       ('cau 1', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 2', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 3', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 4', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 5', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 6', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0);
INSERT INTO duan.play (question_name, question_type, description, correct_answer, is_active)
VALUES ('cau 7', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 8', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 9', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 10', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 11', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 12', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 13', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 14', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 15', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 16', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0);
INSERT INTO duan.play (question_name, question_type, description, correct_answer, is_active)
VALUES ('cau 17', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 18', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 19', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 20', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 21', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 22', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 23', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 24', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 25', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 26', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0);
INSERT INTO duan.play (question_name, question_type, description, correct_answer, is_active)
VALUES ('cau 27', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 28', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 29', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 30', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0),
       ('cau 31', 'multiplechoice', '{"option1": "1", "option2": "2", "option3": "3", "option4": "4"}', 'option1', 0);