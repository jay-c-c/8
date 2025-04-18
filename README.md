# Student Management System (Java)

This project is a **Java-based student management system** that handles the creation, validation, and display of student records. It makes extensive use of **custom exception handling** to ensure data integrity and proper user feedback.

## Features

- Add student records with proper validations.
- Display all stored student records.
- Handles the following scenarios with custom exceptions:
  - Duplicate PRN entries
  - Maximum capacity of students reached
  - Null or empty fields
  - Invalid PRN or CGPA values
  - Corrupted or incomplete student records
  - No students found

## Key Classes and Their Responsibilities

- **Student**: Represents a student with fields like name, PRN, CGPA, and branch. Validates data during object creation.
- **StudentOperations**: Manages a list of students and provides methods to add and display them.
- **Custom Exceptions**:
  - `NullFieldException`: Thrown when required fields are `null`.
  - `EmptyFieldException`: Thrown when fields are empty strings.
  - `InvalidPRNException`: Thrown for non-positive PRN values.
  - `InvalidCGPAException`: Thrown when CGPA is out of the 0.0–10.0 range.
  - `DuplicatePRNException`: Prevents addition of students with duplicate PRNs.
  - `MaxCapacityReachedException`: Limits total students to 100.
  - `NoStudentsFoundException`: Thrown when trying to display an empty list.
  - `StudentDataCorruptedException`: Thrown if any student record has missing critical information.

## How It Works

1. **Create a `Student` object** with valid data.
2. **Add the student** using `StudentOperations.addStudents()`.
3. **Display all students** using `StudentOperations.displayStudent()`.

All operations are wrapped in exception handling to maintain robustness.

---

