ALTER TABLE board CHANGE reg_date created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
ALTER TABLE board CHANGE upd_date updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;

ALTER TABLE board
MODIFY COLUMN created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP;


INSERT INTO board (title, writer, content) VALUES
('First Title', 'Alice', 'This is the first content.'),
('Second Title', 'Bob', 'This is the second content.'),
('Third Title', 'Charlie', 'This is the third content.'),
('Fourth Title', 'David', 'This is the fourth content.'),
('Fifth Title', 'Eve', 'This is the fifth content.'),
('Sixth Title', 'Frank', 'This is the sixth content.'),
('Seventh Title', 'Grace', 'This is the seventh content.'),
('Eighth Title', 'Hank', 'This is the eighth content.'),
('Ninth Title', 'Ivy', 'This is the ninth content.'),
('Tenth Title', 'Jack', 'This is the tenth content.'),
('Eleventh Title', 'Kate', 'This is the eleventh content.'),
('Twelfth Title', 'Leo', 'This is the twelfth content.'),
('Thirteenth Title', 'Mia', 'This is the thirteenth content.'),
('Fourteenth Title', 'Nick', 'This is the fourteenth content.'),
('Fifteenth Title', 'Olivia', 'This is the fifteenth content.'),
('Sixteenth Title', 'Paul', 'This is the sixteenth content.'),
('Seventeenth Title', 'Quinn', 'This is the seventeenth content.'),
('Eighteenth Title', 'Rachel', 'This is the eighteenth content.'),
('Nineteenth Title', 'Steve', 'This is the nineteenth content.'),
('Twentieth Title', 'Tina', 'This is the twentieth content.'),
('Twenty-first Title', 'Uma', 'This is the twenty-first content.'),
('Twenty-second Title', 'Victor', 'This is the twenty-second content.'),
('Twenty-third Title', 'Wendy', 'This is the twenty-third content.'),
('Twenty-fourth Title', 'Xander', 'This is the twenty-fourth content.'),
('Twenty-fifth Title', 'Yara', 'This is the twenty-fifth content.'),
('Twenty-sixth Title', 'Zane', 'This is the twenty-sixth content.'),
('Twenty-seventh Title', 'Ada', 'This is the twenty-seventh content.'),
('Twenty-eighth Title', 'Ben', 'This is the twenty-eighth content.'),
('Twenty-ninth Title', 'Cara', 'This is the twenty-ninth content.'),
('Thirtieth Title', 'Dan', 'This is the thirtieth content.');