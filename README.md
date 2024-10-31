## Localized Database for Employee Management 

### Solution Overview
First start by creating the database structure:

The database uses Table-Based Localization with separate tables for each language:

employee_en: English records

employee_fa: Farsi records

employee_ja: Japanese records

This approach allows efficient data retrieval and simplifies queries by directly selecting the table based on the user's language preference.

### User Interface (UI)
The application’s user interface includes:

### Language Selection: 
Users can choose English, Farsi, or Japanese.

### Dynamic Labels: 
Field labels and buttons adjust to the selected language for a localized experience.
