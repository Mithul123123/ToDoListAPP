# ToDoListAPP
ToDo Application Explanation
Overview
My ToDo application is a task management tool built using Java Object-Oriented Programming (OOP) principles and the Java Swing framework for the graphical user interface (GUI). It allows users to efficiently organize their daily tasks by adding, removing, and managing tasks based on specific schedules or deadlines.

🔗Features
User Authentication:
The application connects to a MySQL Workbench database to securely store user credentials and task data. Each user has their own account, ensuring personalized task management.

🎭Add Tasks:
Users can create new tasks by entering the task details (such as name, description, and time). The task is then saved in the database and displayed in the application's interface.

🎭Remove Tasks:
Users can delete tasks they no longer need. This action updates both the GUI and the database, ensuring synchronization.

🎭Manage Tasks by Time:
Tasks can be managed according to their scheduled time. The application may provide sorting, filtering, or reminders based on the deadlines or times associated with each task.

🎭Persistent Storage:
All user data and tasks are stored in a MySQL database, ensuring that information is retained between sessions and can be accessed from different computers if needed.

🔗Architecture & Technologies
🎭Java OOP:
The application is structured around object-oriented programming concepts, using classes for users, tasks, and database operations. This modular approach makes the codebase organized, maintainable, and extensible.

🎭Java Swing:
The user interface is built with Swing, providing interactive windows, buttons, text fields, and tables for a smooth user experience.

🎭MySQL Workbench:
The backend database is managed using MySQL Workbench, which stores user information and task details. Java’s JDBC is used to connect the application to the database, executing queries for CRUD (Create, Read, Update, Delete) operations.
