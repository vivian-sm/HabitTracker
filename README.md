<div align="center">

# HabitTracker 
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![MVVM](https://img.shields.io/badge/Architecture-MVVM-6200EE?style=for-the-badge)
![University Project](https://img.shields.io/badge/University-Project-orange?style=for-the-badge&logo=graduation-cap)
![Made with Love](https://img.shields.io/badge/Made%20with-%E2%9D%A4-red?style=for-the-badge)

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/Logo_Ubaya.png/320px-Logo_Ubaya.png" width="120px"/>
</div>

## Overview

Habit Tracker is an Android application built with Kotlin using the MVVM architecture. It helps users track and monitor positive daily habits such as drinking water, walking, sleeping, and more. Navigation is handled via Android Navigation Component, and data is stored in-memory using a Singleton pattern.

## Feature 1: Login

The Login screen is the entry point of the application.
**How it works:**
- Users are presented with a username and password field on a centered card layout.
- Credentials are hardcoded for universities project requirements:
  - **Username:** `student`
  - **Password:** `123`
- If the user enters incorrect credentials, an error message is displayed.
- On successful login, the user is navigated to the Dashboard. The Login screen is removed from the back stack, so pressing Back does not return to it.

**UI Components:**
- `TextInputLayout` + `TextInputEditText` for username and password fields
- `MaterialButton` for the login action
- `CardView` wrapping the form for a clean, elevated appearance

## Feature 2: Dashboard

The Dashboard is the main screen after a successful login. It displays all habits the user has created.

**How it works:**
- Habits are listed using a `RecyclerView` with a custom card layout (`habit_card_item.xml`).
- When no habits exist yet, the list is empty — prompting the user to create one.
- A **Floating Action Button (FAB)** in the bottom-right corner navigates the user to the Create New Habit screen.

**Each habit card displays:**
- **Icon** — a visual icon representing the habit, shown inside a circular background
- **Habit Name** — displayed prominently in bold
- **Short Description** — a brief subtitle under the name
- **Status Badge** — shows either `In Progress` or `Completed`
- **Progress Bar** — a horizontal bar reflecting current progress toward the goal
- **Progress Count** — e.g., `3 / 8 glasses`
- **Increment (+) button** — increases the current progress by 1
- **Decrement (−) button** — decreases the current progress by 1

**Status Logic:**
- The status badge automatically changes from **In Progress** to **Completed** when the user's progress reaches the defined goal.

## Feature 3: Create New Habit

This screen allows users to define and add a new habit to their dashboard.

**How it works:**
- Accessed by tapping the FAB (+) on the Dashboard.
- A back button in the header allows the user to return to the Dashboard without saving.
- Once the **Create Habit** button is tapped, the new habit is immediately added to the Dashboard list.

**Input Fields:**

| Field | Description |
|---|---|
| **Habit Name** | The name of the habit (e.g., "Drink Water") |
| **Short Description** | A brief description of the habit |
| **Goal** | A numeric value indicating how many units complete the habit |
| **Unit** | The unit of measurement (e.g., glasses, minutes, pages, meals) |
| **Icon** | Selected via a Spinner (dropdown); icons sourced from Vector Assets |

**UI Components:**
- `EditText` fields with outline background styling
- `Spinner` for icon selection
- `ScrollView` to ensure the form is accessible on smaller screens
- A full-width `Button` at the bottom to submit the form

## Architecture & Tech Stack

| Component | Technology                                               |
|---|----------------------------------------------------------|
| Language | Kotlin                                                   |
| Architecture | MVVM (Model–View–ViewModel)                              |
| Navigation | Android Navigation Component                             |
| Data Storage | In-memory Singleton                                      |
| UI | XML Layouts, Material Components, CardView, RecyclerView |
| Build System | Gradle with Kotlin DSL                                   |
| Min SDK | 26 (Android 7.0)                                         |
| Target SDK | 36                                                       |


## Navigation Flow

```
Login Screen
    └── (on successful login) ──► Dashboard
                                      └── (FAB tap) ──► Create New Habit
                                                            └── (Create Habit) ──► back to Dashboard
```

## Project Info

- **Course:** Advanced Native Mobile Programming (ANMP) — Even Semester 2025/2026
- **Program:** Informatics Engineering, Universitas Surabaya
- **Deadline:** Friday, 8 May 2026
- **Repository:** [github.com/vivian-sm/HabitTracker](https://github.com/vivian-sm/HabitTracker)

**Team Members:**
- Joshua Nehemia Subagyo – 160423034
- Vivian Sisca Maria – 160423066 [Leader]
- Hon Felix Edward – 160423135