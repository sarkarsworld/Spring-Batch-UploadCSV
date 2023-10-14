# Spring-Batch-UploadCSV
Basic Spring Batch example to demonstrate how spring batch works. It will upload CSV file to DB

This program loads data from a CSV file kept at a static location within the project and pushes it in DB table.
It does it in a chunk size of 10.
**This program also uses "SimpleAsyncTaskExecutor" to execute 10 concurrent threads to process records**.
