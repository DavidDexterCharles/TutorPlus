-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2017 at 11:59 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tutorplus`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Account_id` varchar(255) NOT NULL,
  `Account_Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Account_id`, `Account_Type`) VALUES
('T1', 'Tutor');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `Course_Number` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Semester` int(11) NOT NULL,
  `Course_Level` int(11) NOT NULL,
  `Department_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_component`
--

CREATE TABLE `course_component` (
  `Course_Comp_id` int(11) NOT NULL,
  `Course_Comp_Name` varchar(255) NOT NULL,
  `Course_Number` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_topics`
--

CREATE TABLE `course_topics` (
  `Topic_id` varchar(255) NOT NULL,
  `Topic` varchar(255) NOT NULL,
  `Course_Number` varchar(255) NOT NULL,
  `Course_Comp_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `Department_id` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Faculty_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `Faculty_id` varchar(255) NOT NULL,
  `Faculty_Name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `options`
--

CREATE TABLE `options` (
  `Ans_id` varchar(255) NOT NULL,
  `Question_id` varchar(255) NOT NULL,
  `Answer` varchar(255) NOT NULL,
  `Topic_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `Question_id` varchar(255) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `Topic_id` varchar(255) NOT NULL,
  `Course_Comp_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `Status_Id` varchar(255) NOT NULL,
  `Status_Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student_courses`
--

CREATE TABLE `student_courses` (
  `User_id` int(11) NOT NULL,
  `Course_Number` varchar(255) NOT NULL,
  `Status_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tutorial`
--

CREATE TABLE `tutorial` (
  `Tutorial_id` varchar(255) NOT NULL,
  `Type_id` varchar(255) NOT NULL,
  `Created_By` varchar(255) NOT NULL,
  `Course_Comp_id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tutorial_type`
--

CREATE TABLE `tutorial_type` (
  `Type_id` varchar(255) NOT NULL,
  `Type_Name` varchar(255) NOT NULL,
  `Created_By` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tutors`
--

CREATE TABLE `tutors` (
  `User_id` int(11) NOT NULL,
  `Course_Number` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `User_id` int(11) NOT NULL,
  `User_account` varchar(255) NOT NULL,
  `Account_id` varchar(255) NOT NULL,
  `Status_id` varchar(255) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `OtherName` varchar(255) NOT NULL,
  `Department_id` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Account_id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`Course_Number`),
  ADD KEY `Department_id` (`Department_id`),
  ADD KEY `Department_id_2` (`Department_id`);

--
-- Indexes for table `course_component`
--
ALTER TABLE `course_component`
  ADD PRIMARY KEY (`Course_Comp_id`);

--
-- Indexes for table `course_topics`
--
ALTER TABLE `course_topics`
  ADD PRIMARY KEY (`Topic_id`),
  ADD KEY `Course_Number` (`Course_Number`),
  ADD KEY `Course_Comp_id` (`Course_Comp_id`);

--
-- Indexes for table `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`Department_id`),
  ADD KEY `Faculty_id` (`Faculty_id`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`Faculty_id`);

--
-- Indexes for table `options`
--
ALTER TABLE `options`
  ADD PRIMARY KEY (`Ans_id`),
  ADD KEY `Question_id` (`Question_id`),
  ADD KEY `Topic_id` (`Topic_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`Question_id`),
  ADD KEY `Course_Comp_id` (`Course_Comp_id`),
  ADD KEY `Topic_id` (`Topic_id`),
  ADD KEY `Course_Comp_id_2` (`Course_Comp_id`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`Status_Id`);

--
-- Indexes for table `student_courses`
--
ALTER TABLE `student_courses`
  ADD PRIMARY KEY (`User_id`,`Course_Number`),
  ADD KEY `Course_Number` (`Course_Number`);

--
-- Indexes for table `tutorial`
--
ALTER TABLE `tutorial`
  ADD PRIMARY KEY (`Tutorial_id`),
  ADD KEY `Course_Comp_id` (`Course_Comp_id`),
  ADD KEY `Type_id` (`Type_id`);

--
-- Indexes for table `tutorial_type`
--
ALTER TABLE `tutorial_type`
  ADD PRIMARY KEY (`Type_id`);

--
-- Indexes for table `tutors`
--
ALTER TABLE `tutors`
  ADD PRIMARY KEY (`User_id`),
  ADD KEY `Course_Number` (`Course_Number`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`User_id`),
  ADD KEY `Account_id` (`Account_id`),
  ADD KEY `Status_id` (`Status_id`),
  ADD KEY `Department_id` (`Department_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course_component`
--
ALTER TABLE `course_component`
  MODIFY `Course_Comp_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `User_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `courses_ibfk_1` FOREIGN KEY (`Department_id`) REFERENCES `departments` (`Department_id`);

--
-- Constraints for table `course_topics`
--
ALTER TABLE `course_topics`
  ADD CONSTRAINT `course_topics_ibfk_1` FOREIGN KEY (`Course_Number`) REFERENCES `courses` (`Course_Number`),
  ADD CONSTRAINT `course_topics_ibfk_2` FOREIGN KEY (`Course_Comp_id`) REFERENCES `course_component` (`Course_Comp_id`);

--
-- Constraints for table `departments`
--
ALTER TABLE `departments`
  ADD CONSTRAINT `departments_ibfk_1` FOREIGN KEY (`Faculty_id`) REFERENCES `faculty` (`Faculty_id`);

--
-- Constraints for table `options`
--
ALTER TABLE `options`
  ADD CONSTRAINT `options_ibfk_1` FOREIGN KEY (`Question_id`) REFERENCES `questions` (`Question_id`),
  ADD CONSTRAINT `options_ibfk_2` FOREIGN KEY (`Topic_id`) REFERENCES `course_topics` (`Topic_id`);

--
-- Constraints for table `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`Course_Comp_id`) REFERENCES `course_component` (`Course_Comp_id`),
  ADD CONSTRAINT `questions_ibfk_2` FOREIGN KEY (`Topic_id`) REFERENCES `course_topics` (`Topic_id`);

--
-- Constraints for table `student_courses`
--
ALTER TABLE `student_courses`
  ADD CONSTRAINT `student_courses_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `users` (`User_id`),
  ADD CONSTRAINT `student_courses_ibfk_2` FOREIGN KEY (`Course_Number`) REFERENCES `courses` (`Course_Number`);

--
-- Constraints for table `tutorial`
--
ALTER TABLE `tutorial`
  ADD CONSTRAINT `tutorial_ibfk_1` FOREIGN KEY (`Course_Comp_id`) REFERENCES `course_component` (`Course_Comp_id`),
  ADD CONSTRAINT `tutorial_ibfk_2` FOREIGN KEY (`Type_id`) REFERENCES `tutorial_type` (`Type_id`);

--
-- Constraints for table `tutors`
--
ALTER TABLE `tutors`
  ADD CONSTRAINT `tutors_ibfk_1` FOREIGN KEY (`User_id`) REFERENCES `users` (`User_id`),
  ADD CONSTRAINT `tutors_ibfk_2` FOREIGN KEY (`Course_Number`) REFERENCES `courses` (`Course_Number`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`Account_id`) REFERENCES `account` (`Account_id`),
  ADD CONSTRAINT `users_ibfk_2` FOREIGN KEY (`Status_id`) REFERENCES `status` (`Status_Id`),
  ADD CONSTRAINT `users_ibfk_3` FOREIGN KEY (`Department_id`) REFERENCES `departments` (`Department_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
