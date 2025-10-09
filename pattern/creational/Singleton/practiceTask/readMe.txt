Scenario:
    You’re building a logging system for your application.

        You want all modules (UI, database, API, etc.) to log messages to a single log file.
        The Logger should be globally accessible but only one instance should exist.


Practice Task:
    Implement a Logger class that:

        Is thread-safe (use synchronized or double-checked locking).
        Allows writing logs to a single file or console.
        Prevents creating multiple instances.