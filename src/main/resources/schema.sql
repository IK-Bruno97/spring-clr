-- Table: room
CREATE TABLE room (
  room_id INT PRIMARY KEY,
  room_number VARCHAR(10) NOT NULL,
  room_type VARCHAR(50) NOT NULL,
  capacity INT NOT NULL,
  price DECIMAL(10, 2) NOT NULL
);
