# DoctorAnywhere
## Spring Assignment 

This project is compatible with **Java 17**.

Firstly open up your coding editor, preferrably **Intellij**. Build and run the project.

Next, open up **Postman**(download it if you have not).

URL to use in postman: **localhost:8080/api/v1/tasks**

Below are the features you can do with **Postman**:

## Creating a task:
Make sure to have `id` and `title` inputted similar to the example below in **json** format. The system should catch you if those are null fields.
![image](https://user-images.githubusercontent.com/65106667/227702124-fb368b44-2199-477a-9352-6e8c41de6e9f.png)

 
## Getting all tasks:
I have further created more tasks for this example :grin:
![image](https://user-images.githubusercontent.com/65106667/227702346-af1d4d76-b0f4-414f-9355-3092ff92c7ef.png)


## Getting a task by id:
Selectively choose a task by `id` by inserting /{id} after the url of getting all tasks
![image](https://user-images.githubusercontent.com/65106667/227702359-feb53bf8-ad8e-4fc7-82f1-2bd47d27996f.png)


## Putting a task by id:
Edit the task by id, whether its the `id`, `title`, `description` or `completed`
If the following `id` is left blank, system will assume that the `id` will not be changed.
If the rest is left blank, system will assume null.
![image](https://user-images.githubusercontent.com/65106667/227702269-107ae190-8151-4a1e-81b9-4d45d0de2063.png)
Get all tasks or get task by id will show the edited task.
![image](https://user-images.githubusercontent.com/65106667/227702192-39c90a9d-4864-4c86-870e-5664b34458a7.png)


## Deleting a task by id:
Remove task by `id`. 
![image](https://user-images.githubusercontent.com/65106667/227702426-b00ba0a7-c44b-4b24-b0ac-f9652157ed53.png)
It will not appear anymore if you use get all tasks after.
![image](https://user-images.githubusercontent.com/65106667/227702441-412c4967-cd37-4a4f-94ce-7da2dbdfa8b3.png)

## Evidence of a git repo
![image](https://user-images.githubusercontent.com/65106667/227703081-9439df0e-6ba0-40d3-8469-b4552cd155f9.png)




