# ToDo Application

The ToDo Application is a simple Android application developed using Kotlin, providing users with effective task management capabilities. The app utilizes the Room Database for local storage and offers basic functionalities such as task creation, updating, and deletion.

## Key Components

1. **Entity Class**
   - The `Entity` class represents a ToDo task and is annotated with Room annotations for seamless database integration.
   - Fields include task ID, title, priority, and due date.

2. **myDatabase Class**
   - The `myDatabase` class extends RoomDatabase and serves as the database holder.
   - Defines an abstract function to access the DAO (Data Access Object).

3. **DAO (Data Access Object) Interface**
   - The `DAO` interface provides methods for various database operations, including inserting, updating, deleting tasks, and retrieving the task list.

4. **DataObject Class**
   - The `DataObject` class is a singleton object that stores a list of tasks in memory.
   - Provides methods for manipulating the task list, such as adding, retrieving, updating, and deleting tasks.

5. **CreateCard Class**
   - The `CreateCard` class represents the activity for creating a new task.
   - Includes UI elements for entering task details like title, priority, and due date.
   - Utilizes the Room database to persist tasks locally.

6. **UpdateCard Class**
   - The `UpdateCard` class represents the activity for updating existing tasks.
   - Retrieves task details based on the selected task ID and allows users to modify and save changes.
   - Integrates with the Room database for updating and deleting tasks.

7. **SplashScreen Class**
   - The `SplashScreen` class is the initial screen displaying a splash screen during app initialization.
   - Initializes the Room database and loads existing tasks into the `DataObject` list.

8. **Adapter Class**
   - The `Adapter` class extends RecyclerView.Adapter and manages the display of tasks in a RecyclerView.
   - Uses a custom layout for each task item, adapting the UI based on task priority.

9. **XML Layout Files**
   - The XML layout files define the visual structure of the app's UI.
   - Includes screens for creating tasks (`CreateCard`), updating tasks (`UpdateCard`), displaying tasks (`view`), and the main activity (`MainActivity`).

## Usage
# ToDo Application - Setup and Run Instructions

Follow these steps to set up and run the ToDo application on your local machine:

## Prerequisites

1. *Android Studio:*
   - Ensure you have Android Studio installed on your computer. If not, download and install it from (https://developer.android.com/studio).

2. *Kotlin:*
   - Make sure Kotlin is set up in your Android Studio environment.

## Installation

1. *Clone the Repository:*
   bash
   git clone https://github.com/Karthikdussa/To_do_App.git
   

2. *Open Project in Android Studio:*
   - Launch Android Studio.
   - Click on "Open an existing Android Studio project."
   - Navigate to the cloned repository and select the project folder.

3. *Build and Sync:*
   - Wait for Android Studio to build and sync the project.

## Running the Application

1. *Run on Emulator:*
   - Start an Android emulator using AVD Manager.
   - Click on the "Run" button in Android Studio to deploy the application to the emulator.

2. *Run on Physical Device:*
   - Connect your Android device to your computer.
   - Enable USB debugging on your device.
   - Click on the "Run" button in Android Studio to deploy the application to your device.

## Usage

1. *Splash Screen:*
   - The app will open with a splash screen while initializing.

2. *Main Screen (MainActivity):*
   - View the list of tasks.
   - Click the "+" button to create a new task.

3. *Create Task (CreateCard):*
   - Enter task details such as title, priority, and due date.
   - Click the "Save" button to add the task.

4. *Update Task (UpdateCard):*
   - Click on an existing task to update its details.
   - Modify task details and click "Update" to save changes or "Delete" to remove the task.


These instructions guide you through the process of setting up and running the ToDo application on your local environment. Adjust paths and URLs according to your project's specifics.

## Dependencies
--androidx.databinding:databinding-runtime:7.0.3
--androidx.core:core-ktx:1.10.1
--androidx.recyclerview:recyclerview:1.3.0
--androidx.appcompat:appcompat:1.6.1
--com.google.android.material:material:1.9.0
--androidx.constraintlayout:constraintlayout:2.1.4
--junit:junit:4.13.2
--androidx.test.ext:junit:1.1.5
--androidx.test.espresso:espresso-core:3.5.1
--room_version = "2.6.1"
--androidx.room:room-runtime:$room_version
--androidx.room:room-compiler:$room_version
--kapt("androidx.room:room-compiler:$room_version")
--androidx.room:room-ktx:$room_version
